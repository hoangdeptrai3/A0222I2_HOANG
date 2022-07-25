package demo.DemoFileCoppy2001;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReadWiter {
    public List<String> readFile(String path){
        List<String> list = new ArrayList<>();
        int count = 0;
      try{
          File file = new File(path);
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
              count += line.length();
              list.add(line);
          }
          bufferedReader.close();
      }catch (IOException e){
          e.printStackTrace();
      }
        System.out.println(count);
      return list;

    }
//    write file
    public void writeFile(String path,String src){
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(src);
            bufferedWriter.newLine();
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
