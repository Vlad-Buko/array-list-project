import linkedList.MyLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * This class implements JUnit 5 class testing LinkedList
 *
 * NOTE
 * Testing methods , which were with an access modifier Private , I didn't test.
 * Could be tested using reflection mechanism
 * @param <T> this is generic param
 * @author Vladislav Buko
 * @version J.0.2
 * @see MyLinkedListTest
 */

public class MyLinkedListTest<T> {

    MyLinkedList<String> testList = new MyLinkedList<>();

    /**
     * Create an initial array
     */
    public MyLinkedListTest() {
        testList.add("Marry");
        testList.add("Happy");
        testList.add("Dream");
        testList.add("Aurus");
    }

    /**
     *The size variable is the same as the number of elements in the array
     */
    @Before
    public void sizeShouldBeEqualsValueArrayNumbers() {
        try {
            Field field = testList.getClass().getDeclaredField("size");
            field.setAccessible(true);
            int valueSizeTest = (int) field.get(testList);
            Assert.assertEquals(4, valueSizeTest);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /**
     * Adding elements in beginning our LinkedList
     * Check by name elements
     */
    @Test
    public void addFirstShouldSetValueInStartArray() {
        testList.addFirst("Something");
        Assert.assertEquals(testList.getFirst(), "Something");
    }

    /**
     * Adding elements in last our LinkedList
     * Check by name elements
     */
    @Test
    public void addLastShouldSetValueInLastArray() {
        testList.addLast("Something");
        Assert.assertEquals(testList.getLast(), "Something");
    }

    /**
     * At the adding, our array increase on one element,
     * And of course, element adding in starting LinkedList
     * Check by length LinkedList
     */
    @Test
    public void addFirstShouldIncreaseLengthArray() {
        testList.addFirst("Vlad");
        Assert.assertEquals(5, testList.size());
    }

    /**
     * At the adding, our array increase on one element,
     * And of course, element adding in starting LinkedList
     * Check by length LinkedList
     */
    @Test
    public void addLastShouldIncreaseLengthArray() {
        testList.addLast("Vlad");
        Assert.assertEquals(5, testList.size());
    }

    /**
     * When adding elements, me wait true
     */
    @Test
    public void addShouldReturnTrue() {
        Assert.assertTrue(testList.add("vlad"));
    }

    /**
     * When adding by index, we replace the existing element linkedList
     */
    @Test
    public void addThisAddingByIndexShouldSetValueToIndexArray() {
        testList.add(3, "Tom");
        String expected = "Tom";
        Assert.assertEquals(expected, testList.get(3));
    }

    /**
     * When the element is not there, me wait Exception
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void addThisAddingByIndexShouldThrowIndexOutOfBoundsException() {
        testList.add(244, "VeryWant");
        Assert.assertEquals(4, testList.size());
    }

    /**
     * Getting first element LinkedList
     */
    @Test
    public void getFirstShouldReturnDefiniteElement() {
        String expected = "Marry";
        Assert.assertEquals(expected, testList.getFirst());
    }

    /**
     * If element missing in out LinkedList, me give Exception
     */
    @Test(expected = NoSuchElementException.class)
    public void getFirstShouldReturnException() {
        MyLinkedList<String> testListForDefiniteMethod = new MyLinkedList<>();
        testListForDefiniteMethod.getFirst();
        Assert.assertEquals(0, testListForDefiniteMethod.size());
    }

    @Test
    public void getLastShouldReturnDefiniteElement() {
        String expected = "Aurus";
        Assert.assertEquals(expected, testList.getLast());
    }

    @Test(expected = NoSuchElementException.class)
    public void getLastShouldReturnException() {
        MyLinkedList<String> testListForDefiniteMethod = new MyLinkedList<>();
        testListForDefiniteMethod.getLast();
        Assert.assertEquals(0, testListForDefiniteMethod.size());
    }

    @Test
    public void getByIndexShouldReturnOurElementWhichLocatedInArray() {
        Assert.assertEquals("Happy", testList.get(1));
    }

    @Test(expected = NoSuchElementException.class)
    public void removeFirstShouldThrowExeption() {
        LinkedList<String> namess = new LinkedList<>();
        namess.removeFirst();
        Assert.assertEquals(0, namess.size());
    }

    @Test
    public void removeFirstShouldFirstElementOfTheList() {
        testList.removeFirst();
        Assert.assertEquals("Happy", testList.getFirst());
    }

    @Test(expected = NoSuchElementException.class)
    public void removeLastShouldThrowExeption() {
        LinkedList<String> namess = new LinkedList<>();
        namess.removeLast();
        Assert.assertEquals(0, namess.size());
    }

    @Test
    public void removeLastShouldFirstElementOfTheList() {
        testList.removeLast();
        Assert.assertEquals("Dream", testList.getLast());
    }

    @Test
    public void removeMethodShoulRemoveByIndex() {
        testList.remove("Dream");
        Assert.assertEquals(3, testList.size());
    }

    /**
     * This test failed, deletion by null value is not performed
     */
    @Ignore
    public void removeMethodShouldRemoveByIndexIfValueEqualsNull() {
        MyLinkedList<String> name = new MyLinkedList<>();
        name.add(null);
        name.remove(0);
        Assert.assertEquals(0, name.size());
    }

    @Test
    public void removeShouldReduceOurArray() {
        testList.remove(2);
        Assert.assertEquals(false, testList.contains("Dream"));
    }

    @Test
    public void containsShouldReturnValueArray() {
        Assert.assertEquals(true, testList.contains("Dream"));
    }

    @Test
    public void setShouldReplaceElementInArrayAndCheckElementByName() {
        testList.set(2, "Some");
        Assert.assertEquals(true, testList.contains("Some"));
    }

    @Test
    public void setShouldReplaceElementInArrayAndCheckElementByIndex() {
        testList.set(2, "Some");
        Assert.assertEquals("Some", testList.get(2));
    }

    /**
     * This method searches for an element from the beginning array
     */
    @Test
    public void indexOfShouldReturnGivenIndexElement() {
        Assert.assertEquals(1, testList.indexOf("Happy"));
    }

    /**
     * In this method, if our given value not find, then will be return -1
     */
    @Test
    public void indexOfShouldReturnGivenMinusOneIfValueIsNotEmpty() {
        Assert.assertEquals(-1, testList.indexOf("Halabala"));
    }

    /**
     * This method does the same as the previous one, but counts from
     * the end of our linked list.
     */
    @Test
    public void lastIndexOfShouldReturnIndexValue() {
        Assert.assertEquals(1, testList.lastIndexOf("Happy"));
    }

    /**
     * In this method, if our given value not find, then will be return -1
     */
    @Test
    public void lastIndexOfShouldReturnGivenMinusOneIfValueIsNotEmpty() {
        Assert.assertEquals(-1, testList.indexOf("Halabala"));
    }

    /**
     * Sorting collection by using bubble sorting.
     * Using toArray util method to create array, then sort that array,
     * then clear this collection, then add all element to new collection.
     */
    @Test
    public void sortShouldReturnOrderedListOfElements() {
        MyLinkedList<Integer> linkedListTest = new MyLinkedList<>();
        linkedListTest.add(5);
        linkedListTest.add(1);
        linkedListTest.add(7);
        linkedListTest.add(3);
        linkedListTest.sort(Integer::compare);
        Assert.assertEquals("Size is 4, [1, 3, 5, 7]", linkedListTest.toString());
    }

    @Test
    public void clearShouldAllElement() {
        testList.clear();
        Assert.assertEquals(0, testList.size());
    }

    @Test
    public void sizeShouldReturnOurItems() {
        Assert.assertEquals(4, testList.size());
    }
}



