package ua.goit.polymorpism.Module9.HomeWork9;

import java.util.Arrays;

import java.util.Arrays;

public class MyQueue<T> {
    private int size = 0;
    private T arr[];
    private int head = 0;

    public MyQueue() {
        arr = (T[]) new Object[10];
    }

    public void add(T value) {
        if (size == arr.length) {
            arr = Arrays.copyOf(arr, arr.length * 2);
        }
        arr[size] = value;
        size++;
    }

    public void clear() {
        size = 0;
    }

    public T peek(){
        if (size == 0) {
            return null; // или можно выбросить исключение, если требуется
        }
        return arr[head];
    }

    public T poll() {
        if (size == 0) {
            return null; // или можно выбросить исключение, если требуется
        }
        T element = arr[head];
        System.arraycopy(arr, 1, arr, 0, size - 1);
        size--;
        return element;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        T[] copy = Arrays.copyOfRange(arr, head, head + size);
        return Arrays.toString(copy);
    }
}
