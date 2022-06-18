package demo;
import java.security.Key;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
       Map<Integer,String> list = new LinkedHashMap<>();
       list.put(1,"h");
        list.put(11,"d");
        list.put(19,"d");
        list.put(6,"s");
        list.put(8,"h");
       for (Map.Entry<Integer,String> a : list.entrySet()){
           System.out.println(a.getKey() + ":" + a.getValue());
       }
       for (int key2  : list.keySet()){
           System.out.println(key2 + ":" + list.get(key2));
       }
    }

}
