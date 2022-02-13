package linkedList;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        MyLinkedList<String> stringLinkedList = new MyLinkedList<>();
        System.out.println(stringLinkedList);
        for (int i = 0; i < 10; i++) {
            stringLinkedList.add("Test " + (new Random().nextInt(100)));
        }
        System.out.println(stringLinkedList);
        stringLinkedList.sort(String::compareTo);
        System.out.println(stringLinkedList);

        MyLinkedList<Integer> integerMyLinkedList = new MyLinkedList<>();
        System.out.println(integerMyLinkedList);
        for (int i = 0; i < 10; i++) {
            integerMyLinkedList.add(new Random().nextInt(100));
        }
        System.out.println(integerMyLinkedList);
        integerMyLinkedList.sort(Integer::compare);
        System.out.println(integerMyLinkedList);

    }
}
