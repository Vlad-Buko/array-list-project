package linkedList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

/**
 * ToDo add comments
 *
 * @param <T>
 */
public class MyLinkedList<T> implements MyLinkedListInterface<T> {
    private int size;
    private Node<T> first;
    private Node<T> last;

    @Override
    public void addFirst(T e) {
        MyLinkedList.Node<T> first = this.first;
        MyLinkedList.Node<T> newNode = new MyLinkedList.Node<>(null, e, first);
        this.first = newNode;
        if (first == null) {
            last = newNode;
        } else {
            first.prev = newNode;
        }
        size++;
    }

    @Override
    public void addLast(T e) {
        MyLinkedList.Node<T> last = this.last;
        MyLinkedList.Node<T> newNode = new MyLinkedList.Node<>(last, e, null);
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
                MyLinkedList.Node<T> previousNode = nextNode.prev;
                MyLinkedList.Node<T> newNode = new MyLinkedList.Node<>(previousNode, e, nextNode);
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
        MyLinkedList.Node<T> firstNode = this.first;
        if (firstNode == null)
            throw new NoSuchElementException();
        return firstNode.item;
    }

    @Override
    public T getLast() {
        MyLinkedList.Node<T> LastNode = this.last;
        if (LastNode == null)
            throw new NoSuchElementException();
        return LastNode.item;
    }

    @Override
    public T get(int index) {
        if (index < size / 2) {
            MyLinkedList.Node<T> firstNode = this.first;
            for (int i = 0; i < index; i++) {
                firstNode = firstNode.next;
            }
            return firstNode.item;
        } else {
            MyLinkedList.Node<T> lastNode = this.last;
            for (int i = size - 1; i > index; i--) {
                lastNode = lastNode.prev;
            }
            return lastNode.item;
        }
    }

    /**
     * Removes first element in collection, and returns stored object.
     *
     * @return object that was stored in first place of this collection
     */
    @Override
    public T removeFirst() {
        Node<T> tNode = first;
        if (tNode == null) {
            throw new NoSuchElementException();
        }
        T item = tNode.item;
        MyLinkedList.Node<T> nextAfterTNode = tNode.next;
        first = nextAfterTNode;
        if (nextAfterTNode == null) {
            last = null;
        } else {
            nextAfterTNode.prev = null;
        }
        size--;
        return item;
    }

    @Override
    public T removeLast() {
        Node<T> tNode = last;
        if (tNode == null) {
            throw new NoSuchElementException();
        }
        T item = tNode.item;
        MyLinkedList.Node<T> beforeTNode = tNode.prev;
        last = beforeTNode;
        if (beforeTNode == null) {
            first = null;
        } else {
            beforeTNode.next = null;
        }
        size--;
        return item;
    }

    @Override
    public boolean remove(T e) {
        if (e == null) {
            return remove(indexOf(e)) == e;
        } else {
            return remove(indexOf(e)).equals(e);
        }
    }

    @Override
    public T remove(int index) {
        if (index < size / 2) {
            Node<T> firstNode = this.first;
            for (int i = 0; i < index; i++) {
                firstNode = firstNode.next;
            }
            firstNode.prev.next = firstNode.next;
            firstNode.next.prev = firstNode.prev;
            size--;
            return firstNode.item;
        } else {
            Node<T> lastNode = this.last;
            for (int i = size - 1; i > index; i--) {
                lastNode = lastNode.prev;
            }
            lastNode.prev.next = lastNode.next;
            lastNode.next.prev = lastNode.prev;
            size--;
            return lastNode.item;
        }
    }

    @Override
    public boolean contains(T e) {
        return indexOf(e) >= 0;
    }

    @Override
    public T set(int index, T e) {
        T item = remove(index);
        add(index, e);
        return item;
    }

    @Override
    @SuppressWarnings("unchecked")
    public int indexOf(T e) {
        T[] objects = (T[]) this.toArray();
        int i = 0;
        if (e == null) {
            for (T t : objects) {
                if (t == e) {
                    return i;
                }
                i++;
            }
        } else {
            for (T t : objects) {
                if (t.equals(e)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /**
     * This method returns last index of given object in param.
     *
     * @param e element to find index of
     * @return index
     */
    @Override
    @SuppressWarnings("unchecked")
    public int lastIndexOf(T e) {
        T[] objects = (T[]) this.toArray();
        if (e == null) {
            for (int i = objects.length - 1; i >= 0; i--) {
                if (objects[i] == e) {
                    return i;
                }
            }
        } else {
            for (int i = objects.length - 1; i >= 0; i--) {
                if (objects[i].equals(e)) {
                    return i;
                }
            }
        }
        return -1;
    }

    /**
     * Sorting collection by using bubble sorting.
     * Using toArray util method to create array, then sort that array,
     * then clear this collection, then add all element to new collection.
     *
     * @param c comparator for generic type of objects
     *          stored in this collection.
     */
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

    /**
     * Clears this collection by assigning null to
     * last and first references and 0 to size.
     */
    public void clear() {
        size = 0;
        last = null;
        first = null;
    }

    /**
     * This method returns size of our collection.
     *
     * @return size of our collection
     */
    public int size() {
        return size;
    }

    /**
     * This is inner class Node, to store elements and reference to next
     * and previous Node.
     *
     * @param <T> generic type of object to store in
     */
    private static class Node<T> {
        /**
         * Field to store element of type T.
         */
        T item;
        /**
         * Field to store reference to next Node.
         */
        MyLinkedList.Node<T> next;
        /**
         * Field to store reference to previous Node.
         */
        MyLinkedList.Node<T> prev;

        /**
         * Constructor of Node class.
         *
         * @param prevNode reference to previous Node
         * @param e        element to add in Node
         * @param nextNode reference to next Node
         */
        Node(MyLinkedList.Node<T> prevNode, T e, MyLinkedList.Node<T> nextNode) {
            this.item = e;
            this.next = nextNode;
            this.prev = prevNode;
        }
    }

    /**
     * This method is realisation of toString method for this collection.
     *
     * @return String with size and all elements in this collection
     */
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


    /**
     * Private util method to create array of objects
     * stored in our collection.
     *
     * @return array of objects
     */
    private Object[] toArray() {
        if (size == 0) {
            return new Object[0];
        }
        MyLinkedList.Node<T> tNode = first;
        Object[] ts = new Object[size];
        for (int i = 0; i < size; i++) {
            ts[i] = tNode.item;
            tNode = tNode.next;
        }
        return Arrays.copyOf(ts, size);
    }

}
