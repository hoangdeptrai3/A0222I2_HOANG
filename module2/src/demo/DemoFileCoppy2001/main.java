package demo.DemoFileCoppy2001;

import java.util.List;

public class main {
    public static void main(String[] args) {
        FileReadWiter fileReadWiter = new FileReadWiter();
        List<String> list = fileReadWiter.readFile("src/demo/DemoFileCoppy2001/fileman.txt");

        for (String b : list){
            fileReadWiter.writeFile("src/demo/DemoFileCoppy2001/fileCopy.txt",b);
        }
    }
}
