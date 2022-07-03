package demo.demoFile.demoFile3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        String txt ="a";
        String arr[] = {"Thai Quang Huy Hoang","thai quang huy"};
        try{
            FileWriter file = new FileWriter("data.txt");
            BufferedWriter w = new BufferedWriter(file);
            for (String a : arr) {
                w.write(a);
                w.newLine();
            }
            w.close();
            file.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
