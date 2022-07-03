package demo.demoFile;

import java.io.*;

public class demoFile4 {
    public static void main(String[] args) {
        String arr[] = {"hoang","dep","trai"};
       try{

           FileWriter file = new FileWriter("hoang5.txt",true);
           BufferedWriter w = new BufferedWriter(file);
           for (String o : arr){
               w.write(o);
               w.newLine();
           }
           w.close();
       }catch (IOException e){
           e.printStackTrace();
       }
       try{
           FileReader fr = new FileReader("hoang5.txt");
           BufferedReader read = new BufferedReader(fr);
           String line = " ";
           while (true){
               line = read.readLine();
               if (line == null){
                   break;
               }
               System.out.println(line);
           }
       }catch (IOException e){
           e.printStackTrace();
       }
    }
}
