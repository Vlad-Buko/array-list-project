package arrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SpecArrayList <String> namePerson = new ArrayListImpl<>();
        namePerson.add("Tom");
        System.out.println(namePerson);

        //Георгий
        ArrayListImpl lio = new ArrayListImpl();
        Integer i = new Integer(0);
        Object o = new Object();
        lio.add(i, o);
        lio.lastIndexOf(o);
        lio.remove(o);

    }
}
