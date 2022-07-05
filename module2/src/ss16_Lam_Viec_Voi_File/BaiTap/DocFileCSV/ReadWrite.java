package ss16_Lam_Viec_Voi_File.BaiTap.DocFileCSV;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ReadWrite {
   public List<String[]> readFile(String filePath){
       List<String[]> list = new ArrayList<>();
       try{
           File file = new File(filePath);
           if (!file.exists()){
               throw  new FileNotFoundException();
           }
           FileReader fileReader = new FileReader(file);
           BufferedReader bufferedReader = new BufferedReader(fileReader);
           String line;
           while ((line = bufferedReader.readLine()) != null ){
               if (line.trim().isEmpty()){
                   continue;
               }
               String[] a =  line.split(",");
               list.add(a);
           }
       }catch (IOException e){
           e.printStackTrace();
       }
       return list;
   }


}
