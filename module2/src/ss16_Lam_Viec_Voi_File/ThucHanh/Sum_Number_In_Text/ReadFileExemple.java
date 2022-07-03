package ss16_Lam_Viec_Voi_File.ThucHanh.Sum_Number_In_Text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileExemple {
    public void readFileText(String filePath){
        try{
            File file = new File(filePath);
            if (!file.exists()){
                throw  new FileNotFoundException();
            }
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = " ";
            int sum = 0;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            reader.close();
            System.out.println("sum " +sum);
        }catch (Exception e){
            System.out.println("file ko ton tai hoac noi dung co loi");
        }
    }

}
