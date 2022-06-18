package demo;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class MapTree {
    public static void main(String[] args) {
        Map<Integer,String> list = new HashMap<>();
        list.put(10,"dsdsd");
        list.put(1,"hoang");
        list.put(4,"thai");
        list.put(2,"huy");
        list.put(5,"quang");
        list.put(3,"hh");
        for (Map.Entry<Integer,String> entry : list.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
