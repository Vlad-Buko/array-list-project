package linkedList;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        MyLinkedList<String> stringLinkedList = new MyLinkedList<>();
        System.out.println(stringLinkedList);
        for (int i = 0; i < 10; i++) {
            System.out.println(stringLinkedList.add("Test " + (new Random().nextInt(100))));
        }
        System.out.println(stringLinkedList);
        stringLinkedList.addFirst("Test remove 1");
        stringLinkedList.add(stringLinkedList.size() / 2, "Test remove 2");
        stringLinkedList.addLast("Test remove 3");
        System.out.println(stringLinkedList);
        System.out.println(stringLinkedList.removeFirst());
        System.out.println(stringLinkedList);
        System.out.println(stringLinkedList.removeLast());
        System.out.println(stringLinkedList);
        System.out.println(stringLinkedList.remove("Test remove 2"));
        System.out.println(stringLinkedList);
        stringLinkedList.remove(2);
        System.out.println(stringLinkedList);
        stringLinkedList.sort(String::compareTo);
        System.out.println(stringLinkedList);
        System.out.println(stringLinkedList.set(2, "Set test"));
        System.out.println(stringLinkedList);
        System.out.println(stringLinkedList.get(1));
        System.out.println(stringLinkedList.getFirst());
        System.out.println(stringLinkedList.getLast());
        System.out.println(stringLinkedList.lastIndexOf("Set test"));
        System.out.println(stringLinkedList.contains("Set test"));

        stringLinkedList.add("Vlad");
        stringLinkedList.add("Mike");
        stringLinkedList.add("Pala");
        stringLinkedList.add("Hublot");
        System.out.println(stringLinkedList.get(1000));


        MyLinkedList<Integer> integerMyLinkedList = new MyLinkedList<>();
        System.out.println(integerMyLinkedList);
        for (int i = 0; i < 1000; i++) {
            integerMyLinkedList.add(new Random().nextInt(100));
        }
        System.out.println(integerMyLinkedList);
        integerMyLinkedList.sort(Integer::compare);
        System.out.println(integerMyLinkedList);

    }
}
