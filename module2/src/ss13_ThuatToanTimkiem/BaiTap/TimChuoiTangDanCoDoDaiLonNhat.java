package ss13_ThuatToanTimkiem.BaiTap;

import java.util.LinkedList;
import java.util.Scanner;

public class TimChuoiTangDanCoDoDaiLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a character : ");
        String input = sc.nextLine();
//        1.khai bao 1 linked list chua chuoi co do dai max
        LinkedList<Character> listMax = new LinkedList<>();
        for (int i = 0; i<input.length();i++){
//            2.khai bao mot linked list de add i vao danh sach
            LinkedList<Character> list = new LinkedList<>();
            list.add(input.charAt(i));
//            3.vong lap for nay de so sanh va sap xep
            for (int j = i+1;j<input.length();j++){
//                4. neu ky tu tiep theo lon hon gia tri dung truoc thi add vao danh sach
                if (input.charAt(j) > list.getLast()){
                    list.add(input.charAt(j));
                }

            }
//            5. so sanh kich thuoc cua chuoi trong danh sach vs chuoi tang dan co do dai max
            if (list.size() > listMax.size()){
//                + neu kich thuoc chuoi tang dan trong list > chuoi tang dan max,
//                thi xoa listMax va them list vao listMax
                listMax.clear();
                listMax.addAll(list);
            }
//            6.nguoc lai thi xoa list
            list.clear();
        }
        for (Character ch: listMax) {
            System.out.print(ch);
        }


    }
}


