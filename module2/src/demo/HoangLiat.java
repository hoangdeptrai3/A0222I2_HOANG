package demo;

import java.util.*;
public class HoangLiat<E> {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        list.push(2);
        list.push(3);
        list.push(4);
        System.out.println(list);

        System.out.println(list.pop());

        System.out.println(list.peek());

    }
}
