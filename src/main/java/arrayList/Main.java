package arrayList;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {
    public static final Random RANDOM = new Random();
    public static final int BOUND = 100;

    public static void main(String[] args) {
        SpecArrayList<String> namePerson = new ArrayListImpl<>();
        namePerson.add("Tom0");
        namePerson.add("Tom1");
        namePerson.add("Tom0");
        namePerson.add("Tom2");
        namePerson.add("Tom6");
        System.out.println(namePerson);
        namePerson.add("Tom5");
        System.out.println(namePerson);
        namePerson.sort();
        System.out.println(namePerson);
        System.out.println(namePerson.indexOf("Tom2"));
        System.out.println(namePerson.remove("Tom2"));
        System.out.println(namePerson);
        System.out.println(namePerson.remove(0));
        System.out.println(namePerson);
        System.out.println(namePerson.get(1));
        namePerson.set(1, "New String for check");
        System.out.println(namePerson);
        namePerson.set(namePerson.indexOf("Tom0"), namePerson.get(1));
        System.out.println(namePerson);
        namePerson.set(namePerson.lastIndexOf("Tom5"), namePerson.get(1));
        System.out.println(namePerson);
        long start = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            namePerson.add("Test" + i, namePerson.size() / 2);
        }
        long finish = System.nanoTime();
        System.out.println(TimeUnit.MILLISECONDS.convert((finish - start), TimeUnit.NANOSECONDS) + " milliSec");
//        System.out.println(namePerson);


        SpecArrayList<Integer> arrayList = new ArrayListImpl<>();
        for (int i = 0; i < 20; i++) {
            arrayList.add(RANDOM.nextInt(BOUND));
        }
        System.out.println(arrayList);
        arrayList.sort();
        System.out.println(arrayList);


    }
}
