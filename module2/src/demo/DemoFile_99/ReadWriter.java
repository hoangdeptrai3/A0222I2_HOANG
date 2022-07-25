package demo.DemoFile_99;

import javax.swing.filechooser.FileFilter;
import java.io.*;
import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.List;

public class ReadWriter {
    public void writeFile(String path){
        String arr[] = {"1","hoang"};
       try{
           File file = new File(path);
           FileWriter fileWriter = new FileWriter(file);
           BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
           for (String a : arr){
               bufferedWriter.write(a);
               bufferedWriter.newLine();

           }
           bufferedWriter.close();
       }catch (IOException e){
           e.printStackTrace();
       }
    }

    public void readFile(String path){
        try{
            File file = new File(path);
            if (!file.exists()){
                throw  new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine())!= null){
                if (line.trim().isEmpty()){
                    continue;
                }
                System.out.println("s"+line);
            }
            bufferedReader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
