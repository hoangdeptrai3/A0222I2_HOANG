package demo.demoFile.demoFile5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriter {
     public List<String> readFile(String Path){
         List<String> list = new ArrayList<>();
         int count = 0;
         try {
             File file = new File(Path);
             if (!file.exists()){
                 throw new FileNotFoundException();
             }
             FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             String line;
             while ((line = bufferedReader.readLine()) != null){
                 if (line.trim().isEmpty()){
                     continue;
                 }

                 list.add(line);
                 count += line.length();
             }
             bufferedReader.close();
         }catch (IOException e){
             System.out.println("The copy file is not found !");
         }
         System.out.println("tong so dong la : " +count);
         return list;
     }
     public void writerFile(String path,String str){
         try{
             File file = new File(path);
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
             bufferedWriter.write(str);
             bufferedWriter.newLine();
             bufferedWriter.close();
         }catch (IOException e){
             System.out.println("The copy file is not found !");
         }
     }
}
