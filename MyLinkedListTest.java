package ua.goit.polymorpism.Module9.HomeWork9;

import java.util.Arrays;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer>myLinkedList = new MyLinkedList<>();

        for(int i =0; i<10; i++){
            myLinkedList.add(i);
        }
        System.out.println(myLinkedList);
        Integer remove = myLinkedList.remove(0);
        System.out.println(remove);
        System.out.println(myLinkedList);
        myLinkedList.clear();
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.size());


    }
}
