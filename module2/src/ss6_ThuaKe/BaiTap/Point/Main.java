package ss6_ThuaKe.BaiTap.Point;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Point2D h = new Point2D(1,2);
        System.out.println(h.toString());
        h.setXY(3,4);
        System.out.println("array " +Arrays.toString(h.getXY()));

        Poin3d k = new Poin3d(7,8,9);
        System.out.println(k.toString());
        k.setXYZ(10,11,12);
        System.out.println("array " +Arrays.toString(k.getXYZ()));
    }
}
