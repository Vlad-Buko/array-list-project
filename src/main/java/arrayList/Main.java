package arrayList;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SpecArrayList<String> namePerson = new ArrayListImpl<>();
        namePerson.add("Tom");
        namePerson.add("Tom");
        namePerson.add("Tom");
        namePerson.add("Tom2");
        namePerson.add("Tom3");
        System.out.println(namePerson);
        namePerson.add("Tom");
        System.out.println(namePerson);
        namePerson.sort();
        System.out.println(namePerson);
        System.out.println(namePerson.indexOf("Tom2"));
        System.out.println(namePerson.remove("Tom3"));
        System.out.println(namePerson);
        System.out.println(namePerson.remove(0));
        System.out.println(namePerson);
        System.out.println(namePerson.get(1));
        namePerson.set(1, "New String for set check");
        System.out.println(namePerson);
        namePerson.set(namePerson.indexOf("Tom"), namePerson.get(1));
        System.out.println(namePerson);
        namePerson.set(namePerson.lastIndexOf("Tom"), namePerson.get(1));
        System.out.println(namePerson);

        SpecArrayList<Integer> arrayList = new ArrayListImpl<>();
        for (int i = 0; i < 20; i++) {
            arrayList.add(new Random().nextInt(100));
        }
        System.out.println(arrayList);
        arrayList.sort();
        System.out.println(arrayList);

        ArrayList<String> list = new ArrayList<>();

    }
}
