package demo;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        String[] a = {"Jonh", "Mary", "Caly", "Tomy"};
        Arrays.sort(a);
        for (int i = 0;i< a.length;i++){
            System.out.println(a[i]);
        }
    }
}
