package demo.demoFile.demoFile2;

import java.io.*;

public class main {
    public static void main(String[] args) {
        try{

            BufferedWriter f = new BufferedWriter(new FileWriter("hello2.txt"));
            System.out.println(f.getClass());
            f.write("hello");
            f.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        try{
            BufferedReader f2 = new BufferedReader(new FileReader("hello2.txt"));
            String line = null;
            while ((line = f2.readLine()) != null){
                System.out.println(line);
            }
            f2.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
