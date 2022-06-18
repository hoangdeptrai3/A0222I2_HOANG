package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Object {
    private int[] arr;
    private int n;
    public Object(){
        arr = new int[10];
        n = 0;
    }
    public Object(int capacity){
        arr = new int[capacity];
        n = 0;
    }
    public void add(int element){
        if (n == arr.length){
            int[] arr2 = new int[arr.length*2];
            for (int i = 0; i< n; i++){
                arr2[i] = arr[i];
                arr = arr2;
            }
            arr[n++] = element;
        }
//        arr[n++] = element;


    }


    public static void main(String[] args) {
        int[] list1 = new int[2];
        list1[0] = 1;
        list1[1] = 2;
        System.out.println(Arrays.toString(list1));
//       Object list = new Object();
//       list.add(1);
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(2);
        list2.add(3);
        System.out.println(list2);

    }
}
