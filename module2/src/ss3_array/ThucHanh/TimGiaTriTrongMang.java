package ss3_array.ThucHanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String array[] = {"Hoang","Quang","Huy" };
        String input ;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhqp ten ban muon tim ");
        input = sc.nextLine();
        boolean a = false;
        for (int i = 0;i<array.length;i++){
            if (array[i].equals(input) == true){
                System.out.println("co ten nay trong list " +array[i] + "o vi tri"+i);
                a  = true;
                break;
            }
        }
        if (a == false){
            System.out.println("ko co");
        }
    }
}
