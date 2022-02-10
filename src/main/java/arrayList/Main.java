package arrayList;

public class Main {
    public static void main(String[] args) {
        SpecArrayList <String> namePerson = new ArrayListImpl<>();
        namePerson.add("Lord");
        namePerson.add("Genry");
        namePerson.add("Atom");
        namePerson.add("Jack");
        namePerson.add("Tom");
        namePerson.remove(3);
        System.out.println(namePerson.size());
        namePerson.sort();
        System.out.println(namePerson);
    }
}
