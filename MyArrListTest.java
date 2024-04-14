package ua.goit.polymorpism.Module9.HomeWork9;

import java.util.Arrays;

public class MyArrListTest {
    public static void main(String[] args) {
        MyArrayList<Integer>list = new MyArrayList<>();
        for(int i=0; i <10; i++){
            list.add(i);
        }
        System.out.println(list);
        Integer remove = list.remove(7);
        System.out.println(list);
        Integer remove1 = list.remove(8);

        System.out.println(list);
    }
}
