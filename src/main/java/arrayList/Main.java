package arrayList;

public class Main {
    public static void main(String[] args) {
        SpecArrayList <String> namePerson = new ArrayListImpl<>();
        namePerson.add("Tom");
        namePerson.add("Tom");
        namePerson.add("Tom");
        namePerson.add("Tom2");
        namePerson.add("Tom3");
        namePerson.add("Tom");
        System.out.println(namePerson);
        namePerson.sort();
        System.out.println(namePerson);
        System.out.println(namePerson.indexOf("Tom2"));
        namePerson.remove("Tom3");
        System.out.println(namePerson);

    }
}
