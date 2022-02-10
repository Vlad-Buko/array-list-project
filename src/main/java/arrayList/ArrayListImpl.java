package arrayList;

import java.util.Arrays;
import java.util.Objects;

public class ArrayListImpl<T> implements SpecArrayList<T> {
    private int arrSize;
    private T[] array;

    @Override
    @SuppressWarnings("uncheked")
    public void add(T t) {
        if (arrSize == 0) {
            this.array = (T[]) new Object[1];
        } else {
            T[] tmp = this.array;
            this.array = Arrays.copyOf(tmp, arrSize + 1);
        }
        this.array[arrSize] = t;
        arrSize++;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void add(T e, int index) {
        if (index > this.arrSize) {
            throw new IndexOutOfBoundsException();
        }
        if (arrSize == 0) {
            this.array = (T[]) new Object[1];
            this.array[arrSize] = e;
        } else {
            T[] tmp = this.array;
            this.array = (T[]) new Object[arrSize + 1];
            for (int i = 0; i < index; i++) {
                this.array[i] = tmp[i];
            }
            this.array[index] = e;
            for (int i = index; i < tmp.length; i++) {
                this.array[i + 1] = tmp[i];
            }
        }
        arrSize++;
    }

    @Override
    public void addAll(ArrayListImpl arrayList) {
//  to do
    }

    @Override
    public void sort() {
        for (int i = 0; i < arrSize; i++) {
            Arrays.stream(array).sorted();
        }
    }

    @Override
    public boolean remove(int index) {
        array[index] = null;
        T[] cleanedArray = (T[]) Arrays.stream(array).filter(Objects::nonNull).toArray(Object[]::new);
        this.array = cleanedArray;
        arrSize--;
        return true;
    }

    @Override
    public boolean remove(Object e) {
        for (int i = 0; i < arrSize; i++) {
            if (array[i].equals(e)) {
                array[i] = null;
                break;
            }
        }
        T[] cleanedArray = (T[]) Arrays.stream(array).filter(Objects::nonNull).toArray(Object[]::new);
        this.array = cleanedArray;
        arrSize--;
        return true;
    }

    @Override
    public void set(int index, T e) {
        array[index] = e;
    }

    @Override
    public T get(int index) {
        return array[index];
    }

    @Override
    public int size() {
        return arrSize;
    }

    @Override
    public int indexOf(Object e) {
        if (e == null) {
            return -1;
        }
        for (int i = 0; i < size(); i++) {
            if (e.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object e) {
//  to do
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
