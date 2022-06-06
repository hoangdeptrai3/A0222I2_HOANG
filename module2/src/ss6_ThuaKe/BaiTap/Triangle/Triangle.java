package ss6_ThuaKe.BaiTap.Triangle;

import java.awt.*;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    public Triangle(){

    }
    public Triangle(double side1,double side2,double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1(){

        return this.side1;
    }
    public void setSide1(Double side1){
        this.side1 = side1;
    }
    public double getSide2(){
        return this.side2;
    }
    public void setSide2(Double side2){
        this.side2 = side2;
    }
    public double getSide3(){
        return this.side3;
    }
    public void setSide3(Double side3){
        this.side3 = side3;
    }
    public double getArea(){
        double tmp = getPerimeter() / 2;
        return Math.sqrt(tmp * (tmp - side1) * (tmp - side2) * (tmp - side3));
    }

    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
