package demo.DemoFile_99;

import java.util.List;

public class Main {
    public static void main(String[] args) {
       ReadWriter readWriter = new ReadWriter();
       readWriter.writeFile("src/demo/DemoFile_99/hello.txt");
       readWriter.readFile("src/demo/DemoFile_99/hello.txt");
    }
}
