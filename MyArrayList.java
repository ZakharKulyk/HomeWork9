package ua.goit.polymorpism.Module9.HomeWork9;

import java.util.Arrays;

public class MyArrayList<T> {
    private T elements[];
    private  int size;
    private final int DEFAULT_SIZE = 10;
    public MyArrayList(){
        this.elements = (T[]) new Object[DEFAULT_SIZE];
    }

    public T[] getElements() {
        return elements;
    }

    public void setElements(T[] elements) {
        this.elements = elements;
    }

    public void add(T value) {
        if (this.size == elements.length) {
            resize();
        }
        this.elements[size] = value;
        size++;
    }
    public T remove(int index){
        T temp = null;
        for(int i =index; i<size-1; i++)
        {
            temp = elements[index];
            this.elements[index] = elements[i+1];

        }
        this.size--;
        return  temp;

    }
    public T get(int index){
        return  this.elements[index];
    }

    public void clear()
    {
        Arrays.setAll(this.elements, i->0);
        Arrays.setAll(this.elements, i->null);
        this.size = 0;
    }
    public int size()
    {
      return  this.size;
    }

    public void resize(){
        this.elements = (T[]) new Object[DEFAULT_SIZE*2];
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elements, size));
    }

}
