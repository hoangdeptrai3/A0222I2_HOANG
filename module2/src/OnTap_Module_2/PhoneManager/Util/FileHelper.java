package OnTap_Module_2.PhoneManager.Util;

import OnTap_Module_2.PhoneManager.models.Phone;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {
    public List<String> read(String path){
        List<String> list = new ArrayList<>();
        try{
            File file = new File(path);
            if (!file.exists()){
                file.createNewFile();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine())!= null){
                if (line.trim().isEmpty()){
                    list.add(line);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return list;
    }

    public void writer(String path, List<Phone> phones,boolean isAppen){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path,isAppen));){

            for (Phone p : phones){
                bufferedWriter.write(p.toData());
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
