package ss6_ThuaKe.BaiTap.PointAndMoveablePoint;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       Point ip1 = new Point(1,2);
        System.out.println("result " +       ip1.toString());
        ip1.setXY(10,10);
        System.out.println("arr : "+ Arrays.toString(ip1.getXY()));

        MoveablePoint ip2 = new MoveablePoint(3,3,4,5);
        System.out.println("result " +ip2.toString());
        ip2.setSpeed(5,5);
        System.out.println("-------------------");
//        ip2.move();
        System.out.println("kq :"+ip2.move());
//        System.out.println("arr " +Arrays.toString(ip2.getSpeed()));
    }
}
