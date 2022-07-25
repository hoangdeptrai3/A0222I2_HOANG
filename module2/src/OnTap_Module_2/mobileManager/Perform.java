package OnTap_Module_2.mobileManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Perform {
    private List<DienThoai> arrayList;
    private ReadWriter read = new ReadWriter();
    private static final String PATH = "src/OnTap_Module_2/mobileManager/hello.txt";


    public Perform(){
        arrayList = new ArrayList<>();
    }
    public Perform(List<DienThoai> arrayList) {
        this.arrayList = arrayList;
    }

//    add
    public void addMobile(DienThoai sp){
        int lastId = 0;

        if(arrayList.size() >0){
            lastId = arrayList.get(arrayList.size() - 1).getId();
        }
        sp.setId(lastId + 1);
       arrayList.add(sp);
       read.writer(PATH,arrayList,true);
    }
//    display
    public void display(){
        for (DienThoai a : arrayList){
            System.out.println(a);
        }
    }
//    delete
    public void delete(int id) {
            try{
                for (int i = 0; i<arrayList.size();i++) {
                    if (arrayList.get(i).getId() == id) {
                        arrayList.remove(i);
                        read.writer(PATH,arrayList,true);
                    } else {
                        throw new Exception();
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
//        search
    public void searchName(String name){
        for (DienThoai search : arrayList){
            if (search.getName().contains(name)){
                System.out.println("co " +name);
            }else {
                System.out.println("khong co dien thoai nao ten "+name);
            }
        }
    }

}

