package ss16_Lam_Viec_Voi_File.BaiTap.DocFileCSV;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Information> list = new ArrayList<>();
        ReadWrite read = new ReadWrite();
        List<String[]> stringList = read.readFile("src/ss16_Lam_Viec_Voi_File/BaiTap/DocFileCSV/ghiFile.csv");
        for (String[] item : stringList){
            list.add(new Information(Integer.parseInt(item[0]), item[1], item[2]));
        }
        for (Information a : list){
            System.out.println(a.toString());
        }


    }
}
