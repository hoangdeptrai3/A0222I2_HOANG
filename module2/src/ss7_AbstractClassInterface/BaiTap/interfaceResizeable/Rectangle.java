package ss7_AbstractClassInterface.BaiTap.interfaceResizeable;

public class Rectangle extends Shape implements Resizeable{
    public double width = 2.0;
    public double length = 4.0;
    public Rectangle(){

    }
    public Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(String color,boolean filled,double width,double length){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + getWidth() +
                ", length=" + getLength() +
                '}'+super.toString();
    }

    @Override
    public void reSize(double percent) {
        this.width *= percent;
        this.length *= percent;
    }
}
