package demo.demoFile;

import java.io.*;

public class DemoF8 {
    public static void main(String[] args) {
        String[] arr = {"thai","quang","huy","hoang"};
//        ghi file
      try{
          File f = new File("demo.txt");
          FileWriter fileWriter = new FileWriter(f,true);
          BufferedWriter w = new BufferedWriter(fileWriter);
          for (String o : arr){
              w.write(o);
              w.newLine();
          }
          w.close();
      }catch (IOException e){
          e.printStackTrace();
      }

//      doc file
        try{
            FileReader fileReader = new FileReader("demo.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while (true){
                line = bufferedReader.readLine();
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
