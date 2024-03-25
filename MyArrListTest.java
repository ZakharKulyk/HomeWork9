package ua.goit.polymorpism.Module9.HomeWork9;

import java.util.Arrays;

public class MyArrListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(5);
        myArrayList.add(7);
        myArrayList.add(10);

        System.out.println(myArrayList);
        myArrayList.remove(1);
        System.out.println(myArrayList);
        int size = myArrayList.size();
        System.out.println(size);



    }
}
