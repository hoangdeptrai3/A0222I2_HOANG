package ss6_ThuaKe.BaiTap.CircleCylinder;

import java.util.Scanner;

public class Cylinder extends Circle {
    public Double height;
    public Cylinder(){

    }
    public Cylinder(Double radius, String color, Double height){
        this.height = height;
//        setColor(color);
//        setRadius(radius);
        super.setColor(color);
        super.setRadius(radius);
    }
    public Double getTheTich(){
        return 3.14 * Math.pow(this.getRadius(),2) * this.height;
    }
    public String toString(){
        return "the tich :"+getTheTich()+"\n color:"+getColor();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("moi nhap radius");
        Double r = Double.parseDouble(sc.nextLine());
        System.out.print("nhap color : ");
        String color = sc.nextLine();
        System.out.print("nhap height ");
        Double h = Double.parseDouble(sc.nextLine());
        Cylinder c = new Cylinder(r,color,h);
//        double display = c.getTheTich();
//        System.out.println("the tich la "+display + "  color "+color);
        System.out.println(c.toString());
    }
}
