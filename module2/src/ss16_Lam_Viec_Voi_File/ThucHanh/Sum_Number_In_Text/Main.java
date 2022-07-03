package ss16_Lam_Viec_Voi_File.ThucHanh.Sum_Number_In_Text;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap duowng dan ");
        String path = sc.nextLine();
        ReadFileExemple a = new ReadFileExemple();
        a.readFileText(path);
    }

}
///Users/huyhoanghoangicloud.com/Desktop/codegymdn/A0222I2_THAIQUANGHUYHOANG/module2
//src\\ss16_Lam_Viec_Voi_File\\ThucHanh\\Sum_Number_In_Text\\hello3.txt