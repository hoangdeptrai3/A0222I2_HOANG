package demo.DemoFile9999;

import javax.swing.filechooser.FileFilter;
import java.io.*;
import java.util.List;

public class main {
    public static void main(String[] args) {
        String[] arr = {"hoang","dep","trai"};
       try{
           File file = new File("student.txt");
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

//       docFile
        try{
            File file = new File("student.txt");
            if (!file.exists()){
                throw  new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
//                if (line.trim().isEmpty()){
//                    continue;
//                }
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
