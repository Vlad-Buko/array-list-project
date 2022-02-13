package arrayList;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Some testing of our own realisation of ArrayList
 */
public class Main {

    public static void main(String[] args) {
        SpecArrayList<String> namePerson = new ArrayListImpl<>();
        namePerson.add("Tom0");
        namePerson.add("Tom1");
        namePerson.add("Tom0");
        namePerson.add("Tom2");
        namePerson.add("Tom6");

        System.out.println(namePerson.lastIndexOf("Tom0"));
    }
}
