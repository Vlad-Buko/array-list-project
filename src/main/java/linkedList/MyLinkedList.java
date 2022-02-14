package linkedList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class MyLinkedList<T> implements MyLinkedListInterface<T> {
    private int size;
    private Node<T> first;
    private Node<T> last;

    @Override
    public void addFirst(T e) {
        final MyLinkedList.Node<T> f = first;
        final MyLinkedList.Node<T> newNode = new MyLinkedList.Node<>(null, e, f);
        first = newNode;
        if (f == null) {
            last = newNode;
        } else {
            f.prev = newNode;
        }
        size++;
    }

    @Override
    public void addLast(T e) {
        final MyLinkedList.Node<T> last = this.last;
        final MyLinkedList.Node<T> newNode = new MyLinkedList.Node<>(last, e, null);
        this.last = newNode;
        if (last == null)
            first = newNode;
        else
            last.next = newNode;
        size++;
    }

    @Override
    public boolean add(T e) {
        addLast(e);
        return true;
    }

    @Override
    public void add(int index, T e) {
        if (index >= 0 && index <= size) {
            if (index == size) {
                addLast(e);
            } else {
                MyLinkedList.Node<T> nextNode;
                if (index < (size / 2)) {
                    nextNode = first;
                    for (int i = 0; i < index; i++) {
                        nextNode = nextNode.next;
                    }
                } else {
                    nextNode = last;
                    for (int i = size - 1; i > index; i--) {
                        nextNode = nextNode.prev;
                    }
                }
                final MyLinkedList.Node<T> previousNode = nextNode.prev;
                final MyLinkedList.Node<T> newNode = new MyLinkedList.Node<>(previousNode, e, nextNode);
                nextNode.prev = newNode;
                if (previousNode == null) {
                    first = newNode;
                } else {
                    previousNode.next = newNode;
                }
                size++;
            }
        } else {
            throw new IndexOutOfBoundsException("Index is " + index + " and size is " + size);
        }
    }

    @Override
    public T getFirst() {
        final MyLinkedList.Node<T> firstNode = this.first;
        if (firstNode == null)
            throw new NoSuchElementException();
        return firstNode.item;
    }

    @Override
    public T getLast() {
        final MyLinkedList.Node<T> LastNode = this.last;
        if (LastNode == null)
            throw new NoSuchElementException();
        return LastNode.item;
    }

    @Override
    public T get(int index) {
        //return null;
        //Georgiy
        Node<T> listFirst = first;//, listLast = last;
        for(int i = 0; i < index; i++)
            listFirst = listFirst.next;

        for(int i = 0; i > index; i--)
            //listLast = listLast.prev;
            listFirst = listFirst.prev;

        listFirst.next = listFirst.prev;
        T item = listFirst.item;
        return item;

    }

    @Override
    public T removeFirst() {
        return null;
    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public boolean remove(T e) {
        //Georgiy
        /**
        MyLinkedList.Node<T> nextNode = null, prevNode = null;
        nextNode = nextNode.next;
        prevNode = prevNode.prev;
        **/
        return false;
    }

    @Override
    public T remove(int index) {
        // должен возвращать то что было в index
        return null;
    }

    @Override
    public boolean contains(T e) {
        return indexOf(e) >= 0;
    }

    @Override
    public T set(int index, T e) {
        // должен возвращать то что было в index
        return null;
    }

    @Override
    public int indexOf(T e) {
        return -1;
    }

    @Override
    public int lastIndexOf(T e) {
        return -1;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void sort(Comparator<? super T> c) {
        T[] objects = (T[]) this.toArray();
        T glass;
        for (int i = size - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (c.compare(objects[j], objects[i]) > 0) {
                    glass = objects[i];
                    objects[i] = objects[j];
                    objects[j] = glass;
                }
            }
        }
        this.clear();
        for (T t : objects) {
            this.add(t);
        }
    }

    public void clear() {
        size = 0;
        last = null;
        first = null;
    }

    private static class Node<T> {
        T item;
        MyLinkedList.Node<T> next;
        MyLinkedList.Node<T> prev;

        Node(MyLinkedList.Node<T> prevNode, T e, MyLinkedList.Node<T> nextNode) {
            this.item = e;
            this.next = nextNode;
            this.prev = prevNode;
        }
    }

    public String toString() {
        if (size == 0) {
            return "Size is 0 " + "[]";
        }
        MyLinkedList.Node<T> nextNode = first;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Size is ").append(size).append(", [");
        for (int i = 0; i < size; i++) {
            if (nextNode.next != null) {
                stringBuilder.append(nextNode.item).append(", ");
                nextNode = nextNode.next;
            } else {
                stringBuilder.append(nextNode.item).append("]");
            }
        }
        return stringBuilder.toString();
    }


    @SuppressWarnings("unchecked")
    private Object[] toArray() {
        if (size == 0) {
            return (T[]) new Object[0];
        }
        MyLinkedList.Node<T> nextNode = first;
        Object[] ts = new Object[size];
        for (int i = 0; i < size; i++) {
            ts[i] = nextNode.item;
            nextNode = nextNode.next;
        }
        return Arrays.copyOf(ts, size);
    }

}
