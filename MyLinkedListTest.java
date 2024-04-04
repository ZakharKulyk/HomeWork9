package ua.goit.polymorpism.Module9.HomeWork9;

import java.util.Arrays;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList();
        myLinkedList.add("one");
        myLinkedList.add("two");
        myLinkedList.add("four");
        String remove = myLinkedList.remove(1);
        System.out.println(remove);

        System.out.println(myLinkedList);

    }
}
