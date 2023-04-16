import java.sql.Array;
import java.util.Scanner;

public class Helllo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m[] = new int[10];
        for (int i = 0 ; i < 5 ;i++){
                m[i] = sc.nextInt();

        }
        for (int i = 1;i<m.length;i++){
            System.out.println(m[i]);
        }
    }
}
