package arrayList;

/**
 * Our own realisation of interface of ArrayList
 * @param <T> this is generic param
 */
public interface SpecArrayList<T> {

    void add(T e);

    void add(T e, int index);

    void addAll(ArrayListImpl<T> arrayList);

    void sort();

    boolean remove(int index);

    boolean remove(T e);

    public void set(int index, T e);

    T get(int index);

    int size();

    int indexOf(T e);

    int lastIndexOf(T e);

}
