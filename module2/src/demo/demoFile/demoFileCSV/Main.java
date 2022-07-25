package demo.demoFile.demoFileCSV;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> listStudent = new ArrayList<>();
        ReadWriter readWriter = new ReadWriter();
        List<String[]> listString = readWriter.readFile("src/demo/demoFile/demoFileCSV/ghifile.txt");
        for (String[] o : listString){
            listStudent.add(new Student(Integer.parseInt(o[0]),o[1],o[2]));
        }
        for (Student st : listStudent){
            System.out.println(st.toString());
        }
    }

}
