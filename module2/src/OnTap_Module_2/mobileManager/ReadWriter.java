package OnTap_Module_2.mobileManager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriter {
    public List<String> read(String path){
        List<String> list = new ArrayList<>();
        try{
            File file = new File(path);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine())!= null){
                if (line.trim().isEmpty()){
                    continue;
                }
                list.add(line);
            }
            bufferedReader.close();

        }catch (IOException e){
            e.printStackTrace();
        }
        return list;

    }

    public void writer(String path,List<DienThoai> phone,boolean appen){
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path,appen));
            for (DienThoai e : phone){
                bufferedWriter.write(e.toString());
                bufferedWriter.newLine();
                bufferedWriter.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
