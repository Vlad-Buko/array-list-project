package arrayList;

import java.util.Arrays;

public class ArrayListImpl<T> implements SpecArrayList<T> {

    private int arrSize;
    private T[] array;

    @Override
    @SuppressWarnings("unchecked")
    public void add(T e) {
        if (arrSize == 0) {
            this.array = (T[]) new Object[1];
        } else {
            T[] tmp = this.array;
            this.array = Arrays.copyOf(tmp, arrSize + 1);
        }
        this.array[arrSize] = e;
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
    @SuppressWarnings("unchecked")
    public void addAll(ArrayListImpl<T> arrayList) {
        T[] tmp = this.array;
        this.array = (T[]) new Object[arrSize + arrayList.size()];
        for (int i = 0; i < tmp.length; i++) {
            this.array[i] = tmp[i];
        }
        for (int i = 0; i < arrayList.size(); i++) {
            this.array[i + tmp.length] = arrayList.array[i];
        }
        this.arrSize = tmp.length + arrayList.size();
    }

    @Override
    @SuppressWarnings("unchecked")
    public void sort() {
        this.array = (T[]) Arrays.stream(this.array).sorted().toArray(Object[]::new);
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
        T[] tmp = this.array;
        this.array = (T[]) new Object[arrSize - 1];
        for (int i = 0; i < this.array.length; i++) {
            if (i < index) {
                this.array[i] = tmp[i];
            } else {
                this.array[i] = tmp[i + 1];
            }
        }
        arrSize--;
        return true;
    }

    @Override
    public void set(int index, T e) {
        checkIndexBound(index);
        this.array[index] = e;
    }

    @Override
    public T get(int index) {
        checkIndexBound(index);
        return this.array[index];
    }

    @Override
    public int size() {
        return arrSize;
    }

    @Override
    public int indexOf(T e) {
        if (!checkElementExist(e)) return -1;
        int i = 0;
        for (; i < arrSize; i++) {
            if (this.array[i].equals(e)) {
                break;
            }
        }
        return i;
    }

    @Override
    public int lastIndexOf(T e) {
        if (!checkElementExist(e)) return -1;
        int i = arrSize - 1;
        for (; i > 0; i--) {
            if (this.array[i].equals(e)) {
                break;
            }
        }
        return i;
    }

    private void checkIndexBound(int index) {
        if (index >= this.arrSize) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public boolean remove(T e) {
        boolean deleted = false;
        if (!checkElementExist(e)) return false;
        T[] tmp = this.array;
        this.array = (T[]) new Object[arrSize - 1];
        for (int i = 0; i < arrSize; i++) {
            if (!deleted) {
                if (tmp[i].equals(e)) {
                    deleted = true;
                } else {
                    this.array[i] = tmp[i];
                }
            } else {
                this.array[i-1] = tmp[i];
            }
        }
        arrSize--;
        return deleted;
    }

    private boolean checkElementExist(T e) {
        boolean found = false;
        for (T element : array) {
            if (element.equals(e)) {
                found = true;
                break;
            }
        }
        return found;
    }
}
