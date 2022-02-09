package arrayList;

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
}
