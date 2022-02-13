import arrayList.ArrayListImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * This class implements JUnit 5 class testing ArrayList
 *
 * @param <T> this is generic param
 * @author Vladislav Buko
 * @version J.0.1
 * @see ArrayListImplTest
 */

public class ArrayListImplTest<T> {
    private ArrayListImpl<String> testList = new ArrayListImpl<>();
    int valueArrSize = 0;
    T[] valueArray;

    /**
     * In the default constructor we add our initial array
     */
    public ArrayListImplTest() {
        testList.add("Viktoria");
        testList.add("Alvarez");
        testList.add("Tom");
        testList.add("Viktoria");
    }

    /**
     * For facilities we used methods Reflections API, what would
     * open methods with indicator access private.
     */
    @Before
    public void init() {
        try {
            Field field = testList.getClass().getDeclaredField("arrSize");
            Field fieldTwo = testList.getClass().getDeclaredField("array");
            fieldTwo.setAccessible(true);
            field.setAccessible(true);
            valueArrSize = (Integer) field.get(testList);
            valueArray = (T[]) fieldTwo.get(testList);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void valueArrSizeShouldBeZero() {
        this.valueArrSize = 0;
        Assert.assertEquals("Check, that value arrSize zero", 0, valueArrSize);
    }

    @Test
    public void valueArrayShouldBeZero() {
        this.valueArray = null;
        Assert.assertEquals("Check, that value arrSize zero", null, valueArray);
    }

    @Test
    public void shouldAddIfThereIsNoObject() {
        this.valueArrSize = 0;
        testList.add("Something");
        Assert.assertEquals("Expected that at zero, object will be created", 0, valueArrSize);
    }

    @Test
    public void addShouldIncreaseTheSizeOfTheVariable() {
        Assert.assertEquals("Expected that meaning value arrSize, will be +1 ", 4, testList.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void addElementByIndexShouldThrowAnExceptionIndexOutOfBoundsException() {
        testList.add("Something", 24);
        Assert.assertEquals(5, testList.size());
    }

    @Test
    public void addElementByIndexShouldCreateAnObject() {
        testList.add("Something", 3);
        Assert.assertEquals("Expected that at zero, object will be created", 4, valueArrSize);
    }

    @Test
    public void addElementByIndexShouldIncreaseTheSizeOfTheVariable() {
        testList.add("Something", 4);
        Assert.assertEquals("When adding an element, variable size increases", 5, testList.size());
    }

    /**
     * We check, to increase the length of the array by the same number as the added array.
     */
    @Test
    public void addAllShouldIncreaseByTheNumberOfThePassedArray() {
        ArrayListImpl<String> names = new ArrayListImpl<>();
        names.add("Some");
        names.add("Drink");
        names.add("Vine");
        testList.addAll(names);
        Assert.assertEquals(7, testList.size());
    }

    /**
     * Me check our sort with used Stream API
     */
    @Test
    public void sortShouldStreamlineOurArray() {
        ArrayListImpl<Integer> number = new ArrayListImpl<>();
        number.add(2);
        number.add(5);
        number.add(1);
        number.sort();
        Assert.assertEquals("ArrayListImpl{arrSize=3, array=[1, 2, 5]}", number.toString());
    }

    @Test
    public void removeShouldElementFromArrayByIndex() {
        testList.remove(2);
        Assert.assertEquals("Check if the length is reduced array", 3, testList.size());
    }

    /**
     * With this method, we can change value in our array.
     */
    @Test
    public void setShouldInstallNewValueOurArrayList() {
        testList.set(2, "Something");
        Assert.assertEquals(testList.get(2), "Something");
    }

    @Test
    public void getShouldReturnOurValue() {
        Assert.assertEquals("Get our value from array", "Tom", testList.get(2));
    }

    @Test
    public void sizeShouldFitOurSize() {
        Assert.assertEquals("Size array", 4, testList.size());
    }

    /**
     * Get the index number from our array
     */
    @Test
    public void indexOfShouldReturnValue() {
        Assert.assertEquals(2, testList.indexOf("Tom"));
    }

    /**
     * When retrieving an element, the iterator goes from the end of the list
     */
    @Test
    public void lastIndexOfShouldCountFromTheEndOfTheList() {
        Assert.assertEquals(3, testList.lastIndexOf("Viktoria"));
    }

    /**
     * Check for an error in a private method "CheckIndexBound", without used Reflection.
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void checkIndexBoundShouldThrowAnIndexOfBoundsException() {
        testList.get(111);
        Assert.assertEquals(4, testList.size());
    }

    @Test
    public void removeShouldReduceTheSizeOfAnArray() {
        testList.remove(2);
        Assert.assertEquals(3, testList.size());
    }

    /**
     * Here we check that the private method returns false. Our method checks for
     * both the reference type match and the "equals()" method.
     */
    @Test
    public void checkElementExistShouldBeFromZeroToRight() {
        Assert.assertEquals(false, testList.remove(null));
    }
}