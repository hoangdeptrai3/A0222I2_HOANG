package project.libraryManager.util;

import project.libraryManager.model.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {
    public List<String> readFile(String path){
        List<String> listFile = new ArrayList<>();
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
                    listFile.add(line);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return listFile;
    }

    public void writeFile(String path, List<Book> books, boolean isApend ){
        try{
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Book b : books){
                bufferedWriter.write(b.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
