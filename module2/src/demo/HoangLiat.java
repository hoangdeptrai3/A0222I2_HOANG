package demo;

import java.util.Arrays;
import java.lang.Object;


public class HoangLiat <E>{
    private int size = 0;
    private static final int DEFAULT_CAPACITY  = 10;
    private Object elements[];
    public HoangLiat(){
        elements = new java.lang.Object[DEFAULT_CAPACITY];
    }
    public void ensuaCapa(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements,newSize);
    }
    public void add(E e){
        if (size == elements.length){
            ensuaCapa();
        }
        elements[size++] = e;
    }
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
    public static void main(String[] args){
        HoangLiat<Integer> list = new HoangLiat<>();
        list.add(1);
        list.add(2);
        System.out.println("1"+list.get(0));
    }

}

