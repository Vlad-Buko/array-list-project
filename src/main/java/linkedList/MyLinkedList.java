package linkedList;

import java.util.Comparator;

public class MyLinkedList<T> implements MyLinkedListInterface<T> {
    private int size;
    private Node<T> first;
    private Node<T> last;

    @Override
    public void addFirst(T e) {
    }

    @Override
    public void addLast(T e) {
    }

    @Override
    public boolean add(T e) {
        return false;
    }

    @Override
    public void add(int index, T e) {
    }

    @Override
    public T getFirst() {
        return null;
    }

    @Override
    public T getLast() {
        return null;
    }

    @Override
    public T get(int index) {
        return null;
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
        return false;
    }

    @Override
    public T remove(int index) {
        
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
    public void sort(Comparator<? super T> c) {
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
}
