package ua.goit.polymorpism.Module9.HomeWork9;

import java.util.Arrays;

import java.util.Arrays;

public class MyStack<T> {
    private final int DEFAULT_SIZE = 10;
    private T[] stack;
    private int size = 0;

    public MyStack() {
        stack = (T[]) new Object[DEFAULT_SIZE];
    }

    public void push(T value) {
        if (this.size == this.stack.length) {
            this.stack = Arrays.copyOf(this.stack, this.size * 2);
        }
        this.stack[this.size] = value;
        this.size++;
    }

    public T remove(int index) {
        if (index < 0 || index >=this.size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        T value = stack[index];
        System.arraycopy(this.stack, index + 1, this.stack, index, this.size - index - 1);
        this.size--;
        return value;

    }

    public void clear() {
        Arrays.fill(stack, null);
        size = 0;
    }

    public int size() {
        return this.size;
    }

    public T peek() {
        if (this.size == 0) {
            return null;
        }
        return this.stack[this.size - 1];
    }

    public T pop() {
        if (this.size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        T value = this.stack[this.size-1];
        this.stack[this.size - 1] = null;
        this.size--;
        return value;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(this.stack, 0, this.size));
    }
}
