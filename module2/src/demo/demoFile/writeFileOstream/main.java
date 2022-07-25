package demo.demoFile.writeFileOstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class main {
    public static void main(String[] args) throws IOException {
        OutputStream out = new FileOutputStream("hello.txt");
        byte[] bytes = new byte[]{'1','a','b'};
        for (int i = 0; i < bytes.length;i++){
            byte b = bytes[i];
            out.write(b);
        }
        out.close();
    }
}
