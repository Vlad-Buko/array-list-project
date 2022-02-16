package linkedList;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        MyLinkedList<String> stringLinkedList = new MyLinkedList<>();
        stringLinkedList.add("Vlad");
        stringLinkedList.add("Mike");
        stringLinkedList.add("Pala");
        stringLinkedList.add("Hublot");


        System.out.println(stringLinkedList.indexOf("Hublotxx"));

        //System.out.println(integerMyLinkedList);
       // for (int i = 0; i < 10; i++) {
           // integerMyLinkedList.add(new Random().nextInt(100));
       // }
       // System.out.println(integerMyLinkedList);
       // integerMyLinkedList.sort(Integer::compare);
       // System.out.println(integerMyLinkedList);

    }
}
