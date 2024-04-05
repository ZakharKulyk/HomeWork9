package ua.goit.polymorpism.Module9.HomeWork9;

import java.util.Arrays;

public class MyArrListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();


        for (int i = 0; i < 10; i++) {
            myArrayList.add(i);
        }
        System.out.println(myArrayList);
        myArrayList.clear();
        System.out.println(myArrayList);
        Integer integer = myArrayList.get(0);
        Integer remove = myArrayList.remove(1);
        System.out.println(integer);
        System.out.println(remove);


    }
}
