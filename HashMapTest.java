package ua.goit.polymorpism.Module9.HomeWork9;

public class HashMapTest {
    public static void main(String[] args) {
        MyHashMap<String, Integer> myHashMap = new MyHashMap();

        myHashMap.put("Password1", 1203);
        myHashMap.put("Password", 123);
        System.out.println(myHashMap);
    }
}
