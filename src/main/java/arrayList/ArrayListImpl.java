package arrayList;

import java.util.Arrays;

/**
 * This is our own realisation of ArrayList with implementation
 * of SpecArrayList interface
 * @param <T> this is generic param
 * @see arrayList.SpecArrayList
 * @author JustShooter
 * @version 0.1beta
 */
public class ArrayListImpl<T> implements SpecArrayList<T> {

    private int arrSize;
    private T[] array;

    /**
     * Adding one element to the end of our collection
     * @param e some generic object
     */
    @Override
    @SuppressWarnings("unchecked")
    public void add(T e) {
        if (arrSize == 0) {
            array = (T[]) new Object[1];
        } else {
            T[] tmp = array;
            array = Arrays.copyOf(tmp, arrSize + 1);
        }
        array[arrSize] = e;
        arrSize++;
    }

    /**
     * Adding one element to the specified by index param pace in our collection
     * @param e some generic object
     * @param index index to where place the object
     */
    @Override
    @SuppressWarnings("unchecked")
    public void add(T e, int index) {
        if (index > arrSize) {
            throw new IndexOutOfBoundsException();
        }
        if (arrSize == 0) {
            array = (T[]) new Object[1];
            array[arrSize] = e;
        } else {
            T[] tmp = array;
            array = (T[]) new Object[arrSize + 1];
            for (int i = 0; i < index; i++) {
                array[i] = tmp[i];
            }
            array[index] = e;
            for (int i = index; i < tmp.length; i++) {
                array[i + 1] = tmp[i];
            }
        }
        arrSize++;
    }

    /**
     * Adding another ArrayListImpl collection to the end of our collection
     * @param arrayList another collection
     */
    @Override
    @SuppressWarnings("unchecked")
    public void addAll(ArrayListImpl<T> arrayList) {
        T[] tmp = array;
        array = (T[]) new Object[arrSize + arrayList.size()];
        for (int i = 0; i < tmp.length; i++) {
            array[i] = tmp[i];
        }
        for (int i = 0; i < arrayList.size(); i++) {
            array[i + tmp.length] = arrayList.array[i];
        }
        arrSize = tmp.length + arrayList.size();
    }

    /**
     * This is the sort method
     * Very easy realisation with Stream API, better make by using compareTo
     */
    @Override
    @SuppressWarnings("unchecked")
    public void sort() {
        array = (T[]) Arrays.stream(array).sorted().toArray(Object[]::new);
    }

    /**
     * This is override of toString method
     * @return String literal with the arrSize var and content of our collection
     */
    @Override
    public String toString() {
        return "ArrayListImpl{" +
                "arrSize=" + arrSize +
                ", array=" + Arrays.toString(array) +
                '}';
    }

    /**
     * Removing one element from our collection by index param
     * @param index this is index of element to remove
     * @return returns true if successful
     */
    @Override
    @SuppressWarnings("unchecked")
    public boolean remove(int index) {
        checkIndexBound(index);
        T[] tmp = array;
        array = (T[]) new Object[arrSize - 1];
        for (int i = 0; i < array.length; i++) {
            if (i < index) {
                array[i] = tmp[i];
            } else {
                array[i] = tmp[i + 1];
            }
        }
        arrSize--;
        return true;
    }

    /**
     * Replace one element for another, that was given by param e
     * @param index this is index of element witch is needed to be replaced
     * @param e     this is new object, that will replace old one
     */
    @Override
    public void set(int index, T e) {
        checkIndexBound(index);
        array[index] = e;
    }

    /**
     * This is get method, that will return the object at specified by index position
     * @param index this is index of element, that need to be returned
     * @return returns object at index position
     */
    @Override
    public T get(int index) {
        checkIndexBound(index);
        return array[index];
    }

    /**
     * This method returns size of our collection
     * @return int var size
     */
    @Override
    public int size() {
        return arrSize;
    }

    /**
     * Returns index of given param e
     * @param e some object
     * @return int position index
     */
    @Override
    public int indexOf(T e) {
        if (!checkElementExist(e)) return -1;
        int i = 0;
        if (e == null) {
            for (; i < arrSize; i++) {
                if (array[i] == e) {
                    break;
                }
            }
        } else {
            for (; i < arrSize; i++) {
                if (array[i].equals(e)) {
                    break;
                }
            }
        }
        return i;
    }

    /**
     * Same as indexOf, but here we iterate from the end of our collection
     * @param e some object
     * @return int position index
     */
    @Override
    public int lastIndexOf(T e) {
        boolean found = false;
        if (e == null) {
            for (T element : array) {
                if (element == e) {
                    found = true;
                    break;
                }
            }
        } else {
            for (T element : array) {
                if (element.equals(e)) {
                    found = true;
                    break;
                }
            }
        }
        if (!found) return -1;
        int i = arrSize - 1;
        if (e == null) {
            for (; i > 0; i--) {
                if (array[i] == e) {
                    break;
                }
            }
        } else {
            for (; i > 0; i--) {
                if (array[i].equals(e)) {
                    break;
                }
            }
        }
        return i;
    }

    /**
     * This is private method for check is given index is in bound of our collection size
     * throws IndexOutOfBound, if given index is greater than our collection size
     * @param index given index to check
     */
    private void checkIndexBound(int index) {
        if (index >= arrSize) {
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * Removing given in param e object if found
     * @param e some object
     * @return returns true, if given by param object "e" is found and removed
     * or false, if not found
     */
    @Override
    @SuppressWarnings("unchecked")
    public boolean remove(T e) {
        boolean deleted = false;
        if (!checkElementExist(e)) return false;
        T[] tmp = array;
        array = (T[]) new Object[arrSize - 1];
        if (e == null) {
            for (int i = 0; i < arrSize; i++) {
                if (!deleted) {
                    if (tmp[i] == e) {
                        deleted = true;
                    } else {
                        array[i] = tmp[i];
                    }
                } else {
                    array[i - 1] = tmp[i];
                }
            }
        } else {
            for (int i = 0; i < arrSize; i++) {
                if (!deleted) {
                    if (tmp[i].equals(e)) {
                        deleted = true;
                    } else {
                        array[i] = tmp[i];
                    }
                } else {
                    array[i - 1] = tmp[i];
                }
            }
        }
        arrSize--;
        return deleted;
    }

    /**
     * private method for check, if given by param object e is existed in our collection
     * @param e some object for look up
     * @return returns true if found, or false if not
     */
    private boolean checkElementExist(T e) {
        boolean found = false;
        if (e == null) {
            for (T element : array) {
                if (element == e) {
                    found = true;
                    break;
                }
            }
        } else {
            for (T element : array) {
                if (element.equals(e)) {
                    found = true;
                    break;
                }
            }
        }
        return found;
    }
}
