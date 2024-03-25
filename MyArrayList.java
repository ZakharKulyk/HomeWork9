package ua.goit.polymorpism.Module9.HomeWork9;

import java.util.Arrays;

public class MyArrayList<T> {
    private T elements[];
    private  int size;
    private int DEFAULTSIZE = 10;
    public MyArrayList(){
        elements = (T[]) new Object[DEFAULTSIZE];
    }

    public T[] getElements() {
        return elements;
    }

    public void setElements(T[] elements) {
        this.elements = elements;
    }

    public void add(T value) {
        if (size == elements.length) {
            resize();
        }
        elements[size] = value;
        size++;
    }
    public void remove(int index){
        for(int i =index; i<size-1; i++)
        {
            elements[index] = elements[i+1];

        }
        size--;
    }
    public T get(int index){
        T temp =(T) elements[index];
        return  temp;
    }

    public void clear()
    {
        size = elements.length;
        for(int i =0; i<elements.length; i++)
        {
            size--;
        }
    }
    public int size()
    {
      return  size;
    }

    public void resize(){
        elements = (T[]) new Object[DEFAULTSIZE*2];
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elements, size));
    }

}
