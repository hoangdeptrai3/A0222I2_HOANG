package demo.demoFile.demoFile5;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadWriter readWriter = new ReadWriter();
        List<String> str = readWriter.readFile("src/demo/demoFile/demoFile5/fileGoc.txt");
        for (String o : str){
            readWriter.writerFile("src/demo/demoFile/demoFile5/fileCopy.txt",o);
        }
    }
}

