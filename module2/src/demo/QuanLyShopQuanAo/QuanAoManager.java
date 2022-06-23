package demo.QuanLyShopQuanAo;

import java.util.ArrayList;
import java.util.List;

public class QuanAoManager {
    private List<QuanAo> lists = new ArrayList<>();

    public QuanAoManager(){
        lists = new ArrayList<QuanAo>();
    }

    public QuanAoManager(List<QuanAo> lists) {
        this.lists = lists;
    }
//    1.add
    public void add(QuanAo aq){
        lists.add(aq);
    }
//    2.display
    public void display(){
        for (QuanAo aq : lists){
            System.out.println("list :" + aq);
        }
    }
//    3.remove
    public void delete(int id){
        for (int i = 0;i<lists.size();i++){
            if (lists.get(i).getIdQuanAo() == id){
                lists.remove(i);
                break;
            }
        }

    }
}
