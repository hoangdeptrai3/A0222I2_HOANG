package demo.demoFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFile7 {
    public static void main(String[] args) {
        String arr[] = {"hoang","thai"};
        try{
            File f = new File("/Users/huyhoanghoangicloud.com/Desktop/codegymdn/A0222I2_THAIQUANGHUYHOANG/module2/src/demo/demoFile/text.txt");
            BufferedWriter w = new BufferedWriter(new FileWriter(f));
            for (String o : arr){
                w.write(o);
                w.newLine();
            }
            w.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
