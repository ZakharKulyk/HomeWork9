package ua.goit.polymorpism.Module9.HomeWork9;


import java.util.Arrays;
import java.util.Objects;

public class MyHashMap {

    private static final int DEFAULT_CAPACITY = 16;
    private Node[] table;
    private int size;

    public MyHashMap() {
        table = new Node[DEFAULT_CAPACITY];
        size = 0;
    }

    public void put(Object key, Object value) {
        if (key == null)
            return;

        int hash = key.hashCode() % table.length;
        if (table[hash] == null) {
            table[hash] = new Node(key, value);
            size++;
        } else {
            Node currentNode = table[hash];
            while (currentNode != null) {
                if (currentNode.key.equals(key)) {
                    currentNode.value = value;
                    return;
                }
                if (currentNode.next == null) {
                    currentNode.next = new Node(key, value);
                    size++;
                    return;
                }
                currentNode = currentNode.next;
            }
        }
    }

    public void remove(Object key) {
        if (key == null)
            return;

        int hash = key.hashCode() % table.length;
        if (table[hash] != null) {
            Node prevNode = null;
            Node currentNode = table[hash];
            while (currentNode != null) {
                if (currentNode.key.equals(key)) {
                    if (prevNode == null) {
                        table[hash] = currentNode.next;
                    } else {
                        prevNode.next = currentNode.next;
                    }
                    size--;
                    return;
                }
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
        }
    }

    public void clear() {
        Arrays.fill(table, null);
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object get(Object key) {
        if (key == null)
            return null;

        int hash = key.hashCode() % table.length;
        Node currentNode = table[hash];
        while (currentNode != null) {
            if (currentNode.key.equals(key)) {
                return currentNode.value;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    private static class Node {
        Object key;
        Object value;
        Node next;

        Node(Object key, Object value) {
            this.key = key;
            this.value = value;
            next = null;
        }
    }
}
