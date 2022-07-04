package ss16_Lam_Viec_Voi_File.BaiTap.CopyFileText;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadAndWriteStringInFile readAndWriteStringInFile = new ReadAndWriteStringInFile();
        List<String> strList = readAndWriteStringInFile.readFile("src/ss16_Lam_Viec_Voi_File/BaiTap/CopyFileText/fileMain.txt");
        for (String item : strList) {
            readAndWriteStringInFile.writeFile("src/ss16_Lam_Viec_Voi_File/BaiTap/CopyFileText/fileCopy.txt", item);

        }
    }
}
