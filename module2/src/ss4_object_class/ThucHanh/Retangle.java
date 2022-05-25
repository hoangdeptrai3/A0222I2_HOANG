package ss4_object_class.ThucHanh;

import java.util.Scanner;

public class Retangle {
    double width;
    double height;
    public Retangle(){
    }
    public Retangle(double width,double height){
        this.width = width;
        this.height = height;
    }
    public double  getArea(){
        return this.width * this.height ;
    }
    public double getPerimeter(){
        return (this.width + this.height)*2;
    }
    public String display(){
        return "your retangle is height : "+this.height+ " , " + "widh :"+this.width;
    }
    public double displayArea(){
       return getArea();
    }
    public double displayPerimeter(){
        return getPerimeter();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap width :");
        double width = sc.nextDouble();
        System.out.print("nhap height :");
        double height = sc.nextDouble();
        Retangle a = new Retangle(width,height);
        System.out.println(a.display());
        System.out.println("dien tich la :" +a.displayArea());
        System.out.println("chu vi la :" +a.displayPerimeter());
    }
}
