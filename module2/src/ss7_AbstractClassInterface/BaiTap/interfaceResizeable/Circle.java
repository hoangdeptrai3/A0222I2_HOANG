package ss7_AbstractClassInterface.BaiTap.interfaceResizeable;

public class Circle extends Shape implements Resizeable{
    private final double PI = 3.14;
    private double radius = 2.0;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(String color,Boolean filled,double radius){
        super(color,filled);
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return PI * Math.pow(this.radius,2);
    }
    public double getPrimeter(){
        return 2*PI*this.radius;
    }

    @Override
    public void reSize(double percent) {
        this.radius *= percent;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "PI=" + getArea() +
                ", radius=" + getPrimeter() +
                '}';
    }
}
