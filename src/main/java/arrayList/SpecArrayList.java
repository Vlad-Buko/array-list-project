package arrayList;

public interface SpecArrayList <T> {

    void add(T t);
    // Оставил дженерик
    void add(T t, Object[] elementData, int s);

    void add(Object o, int index);

    void sort();

    void concat(SpecArrayList<T> newList);

    boolean delete(int index);

    T get(int index);

    int size();
}
