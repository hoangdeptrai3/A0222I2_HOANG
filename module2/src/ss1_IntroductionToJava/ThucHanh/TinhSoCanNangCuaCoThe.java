package ss1_IntroductionToJava.ThucHanh;

import java.util.*;


public class TinhSoCanNangCuaCoThe {
    public static void main(String[] args){
        float weight;
        float height;
        float bmi;
        Scanner h = new Scanner(System.in);
        System.out.println("moi nhap can nang");
        weight = h.nextFloat();
        System.out.println("moi nhap chieu cao");
        height = h.nextFloat();
        bmi = (float)(weight / Math.pow(height, 2));
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");

    }
}

