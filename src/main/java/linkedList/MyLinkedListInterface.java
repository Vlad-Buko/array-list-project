package linkedList;

import java.util.Comparator;

public interface MyLinkedListInterface<T> {

    void addFirst(T e);

    void addLast(T e);

    boolean add(T e);

    void add(int index, T e);

    T getFirst();

    T getLast();

    T get(int index);

    T removeFirst();

    T removeLast();

    boolean remove(T e);

    T remove(int index);

    boolean contains(T e);

    T set(int index, T e);

    int indexOf(T e);

    int lastIndexOf(T e);

    void sort(Comparator<? super T> c);

    void clear();
}
