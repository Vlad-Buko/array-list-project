package arrayList;

import java.util.Arrays;

public class ArrayListImpl<T> implements SpecArrayList<T> {
    private int arrSize;
    private T[] array;

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

    @Override
    @SuppressWarnings("unchecked")
    public void sort() {
        array = (T[]) Arrays.stream(array).sorted().toArray(Object[]::new);
    }

    @Override
    public String toString() {
        return "ArrayListImpl{" +
                "arrSize=" + arrSize +
                ", array=" + Arrays.toString(array) +
                '}';
    }

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

    @Override
    public void set(int index, T e) {
        checkIndexBound(index);
        array[index] = e;
    }

    @Override
    public T get(int index) {
        checkIndexBound(index);
        return array[index];
    }

    @Override
    public int size() {
        return arrSize;
    }

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

    @Override
    public int lastIndexOf(T e) {
        if (!checkElementExist(e)) return -1;
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

    private void checkIndexBound(int index) {
        if (index >= arrSize) {
            throw new IndexOutOfBoundsException();
        }
    }

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
