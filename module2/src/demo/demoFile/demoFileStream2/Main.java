package demo.demoFile.demoFileStream2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("src/demo/demoFile/demoFileStream2/hello.txt");
        byte[] bytes = new byte[10];
        int i = -1;
        while ((i = is.read())!= -1){
            String s = new String(bytes,0,i);
            System.out.println(s);
        }
        is.close();
    }
}
