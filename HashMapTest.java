package ua.goit.polymorpism.Module9.HomeWork9;

public class HashMapTest {
    public static void main(String[] args) {
       MyHashMap<String, Integer> map = new MyHashMap<>();
       map.put("Zakhar", 129830);
       map.put("aisd", 129309);
       map.put("Zakhar", 123);
        System.out.println(map.get("Zakhar"));
    }
}
