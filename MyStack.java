package ua.goit.polymorpism.Module9.HomeWork9;

import java.util.Arrays;

import java.util.Arrays;

public class MyStack<T> {
    private static int DEFAULTSIZE = 10;
    private T[] stack;
    private int size = 0;

    public MyStack() {
        stack = (T[]) new Object[DEFAULTSIZE];
    }

    public void push(T value) {
        if (size == stack.length) {
            stack = Arrays.copyOf(stack, size * 2);
        }
        stack[size] = value;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        System.arraycopy(stack, index + 1, stack, index, size - index - 1);
        size--;
    }

    public void clear() {
        size = 0;
    }

    public int size() {
        return size;
    }

    public T peek() {
        if (size == 0) {
            return null; // or throw new EmptyStackException();
        }
        return stack[size - 1];
    }

    public void pop() {
        if (size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        stack[size - 1] = null;
        size--;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(stack, 0, size));
    }
}
