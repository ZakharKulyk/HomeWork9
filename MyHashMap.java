package ua.goit.polymorpism.Module9.HomeWork9;


import java.util.Arrays;
import java.util.Objects;

public class MyHashMap<T, T1> {

    private static final int DEFAULT_CAPACITY = 16;
    private Node[] table;
    private int size;

    public MyHashMap() {
        this.table = new Node[16];
        this.size = 0;
    }

    public void put(T key, T1 value) {
        if (key == null) {
            throw new NullPointerException();
        }


        int hash = Math.abs(key.hashCode()) % table.length;

        if (this.table[hash] == null) {
            this.table[hash] = new Node(key, value);
            this.size++;
        } else {
            Node currentNode = this.table[hash];
            while (currentNode != null) {
                if (currentNode.key.equals(key)) {
                    currentNode.value = value;
                    return;
                }
                if (currentNode.next == null) {
                    currentNode.next = new Node(key, value);
                    this.size++;
                    return;
                }
                currentNode = currentNode.next;
            }
        }
    }

    public void remove(Object key) {
        if (key == null) {
            throw new NullPointerException();
        }

        int hash = Math.abs(key.hashCode()) % table.length;
        if (this.table[hash] != null) {
            Node prevNode = null;
            Node currentNode = this.table[hash];
            while (currentNode != null) {
                if (currentNode.key.equals(key)) {
                    if (prevNode == null) {
                        this.table[hash] = currentNode.next;
                    } else {
                        prevNode.next = currentNode.next;
                    }
                    this.size--;
                    return;
                }
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
        }
    }

    public void clear() {
        this.table = new Node[0];
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public Object get(Object key) {
        if (key == null)
            return new NullPointerException();

        int hash = Math.abs(key.hashCode()) % this.table.length;;
        Node currentNode = this.table[hash];
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

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        for (Node node : this.table) {
            while (node != null) {
                stringBuilder.append(node.key).append("=").append(node.value).append(", ");
                node = node.next;
            }
        }
        if (size > 0) {
            stringBuilder.setLength(stringBuilder.length() - 2);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

}
