package arrayList;

import java.util.ArrayList;

public class ArrayListImpl <T> implements SpecArrayList {

//    private static final int DEFAULT_CAPACITY = 10;
//    private static final Object[] EMPTY_ELEMENTDATA = {};

    private int size;

    @Override
    public void add(Object o) {

    }

    @Override
    public void add(Object o, Object[] elementData, int s) {

    }

    @Override
    public void add(Object o, int index) {

    }

    @Override
    public void sort() {

    }

    @Override
    public void concat(SpecArrayList newList) {

    }

    @Override
    public boolean delete(int index) {
        return false;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    //Георгий
    @Override
    public void add(int index, Object o) {

        ArrayList<String> als = new ArrayList<>();
        //als.add(index, new String(index + " Index"));
        //als.add(index, new String(o.toString()));
        als.add("index: " + index);
        System.out.println("-- void add --\n" + als);

    }

    @Override
    public void lastIndexOf(Object o) {

        String str = "Hello, World!!!";
        System.out.println("-- void lastIndexOf --\n" + str + " Index: ',' = " + str.lastIndexOf(","));
        //System.out.println(str.lastIndexOf(","));

    }

    @Override
    public void remove(Object o) {

        ArrayList<Integer> al = new ArrayList<>();
        //String str = "Hello, World!!!";
        //int i = 1234567890;
        al.add(6);
        al.add(2);
        al.add(5);

        System.out.println("-- void remove --\n" + "ArrayList: " + al);
        al.remove(new Integer(2));
        System.out.println("Remove value: 2 = " + al);
        //System.out.println(al);

    }

}
