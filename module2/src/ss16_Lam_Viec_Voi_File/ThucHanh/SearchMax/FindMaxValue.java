package ss16_Lam_Viec_Voi_File.ThucHanh.SearchMax;
import java.util.List;
import java.util.Scanner;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String address ="";
        ReadAndWriteFile read = new ReadAndWriteFile();
        System.out.println("moi nhap duong dan :");
        address = sc.nextLine();
        List<Integer> numbers = read.readFile(address);
        int maxValue =  findMax(numbers);
        read.writeFile(address,maxValue);


    }
}
///Users/huyhoanghoangicloud.com/Desktop/codegymdn/A0222I2_THAIQUANGHUYHOANG/module2/src/ss16_Lam_Viec_Voi_File/ThucHanh/SearchMax
