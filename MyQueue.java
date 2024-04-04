package ua.goit.polymorpism.Module9.HomeWork9;

import java.lang.reflect.Array;
import java.util.Arrays;

import java.util.Arrays;

public class MyQueue<T> {
    private int size = 0;
    private T arr[];
    private int head = 0;

    public MyQueue() {
        this.arr = (T[]) new Object[10];
    }

    public void add(T value) {
        if (this.size == this.arr.length) {
            this.arr = Arrays.copyOf(this.arr, this.arr.length * 2);
        }
        this.arr[this.size] = value;
        this.size++;
    }

    public void clear() {
        Arrays.fill(this.arr, null);
        this.size=0;
        this.head=0;
    }

    public T peek(){
        if (this.size == 0) {
            return null;
        }
        return this.arr[this.head];
    }

    public T poll() {
        if (this.size == 0) {
            return null;
        }
        T element = this.arr[this.head];
        System.arraycopy(this.arr, 1, this.arr, 0, this.size - 1);
        this.size--;
        return element;
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        T[] copy = Arrays.copyOfRange(this.arr, this.head, this.head + this.size);
        return Arrays.toString(copy);
    }
}
