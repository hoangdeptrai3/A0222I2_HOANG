package demo.demoFile.demoFileCSV;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriter {
    public List<String[]> readFile(String Path) {
        List<String[]> list = new ArrayList<>();
        try{
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
                String[] addE = line.split(";");
                list.add(addE);
            }

        }catch (IOException e){
            System.out.println("file not found ");
        }
        return list;
    }
}
