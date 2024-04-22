package ua.goit.polymorpism.Module9.HomeWork9;

public class HashMapTest {
    public static void main(String[] args) {
       MyHashMap<String, Integer> map = new MyHashMap<>();
       map.put(null, 129830);
       map.put(null, 1);
       map.put("Zakhar", 123);
        System.out.println(map.get(null));
    }
}
