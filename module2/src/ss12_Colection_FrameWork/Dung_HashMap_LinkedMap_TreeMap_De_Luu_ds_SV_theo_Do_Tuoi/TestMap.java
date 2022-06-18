package ss12_Colection_FrameWork.Dung_HashMap_LinkedMap_TreeMap_De_Luu_ds_SV_theo_Do_Tuoi;
import java.util.*;
public class TestMap {
    public static void main(String[] args) {
//        hashMap
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Thai",1);
        hashMap.put("Quang",2);
        hashMap.put("Huy",3);
        hashMap.put("Hoang",4);
        System.out.println("save Name and age");
        System.out.println(hashMap+"\n");
//        treeMap
        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Hien thi giam dan :");
        System.out.println(treeMap);

//        linkedHashMap
        Map<String,Integer> linkedMap = new LinkedHashMap<>();
        linkedMap.put("Thai",1);
        linkedMap.put("Quang",2);
        linkedMap.put("Huy",3);
        linkedMap.put("Hoang",4);
        System.out.println("\nThe age for " + "Quang " + linkedMap.get("Quang"));
    }
}
