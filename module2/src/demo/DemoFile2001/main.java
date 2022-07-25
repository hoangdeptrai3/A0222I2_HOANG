package demo.DemoFile2001;

import java.io.*;

public class main {
    public static void main(String[] args) {
        int count = 0;
        try{
            File file = new File("src/demo/DemoFile2001/hello.txt");
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
                System.out.println(line);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(count);
    }
}
