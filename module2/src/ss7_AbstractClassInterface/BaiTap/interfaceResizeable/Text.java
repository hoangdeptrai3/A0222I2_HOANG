package ss7_AbstractClassInterface.BaiTap.interfaceResizeable;

import java.util.Arrays;

public class Text {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        Circle circle = new Circle("red",true,2.0);
        Rectangle rectangle = new Rectangle("blue",true,2.0,3.0);
        Square square = new Square("black",true,5.0);
        circle.reSize(Math.random());
        rectangle.reSize(Math.random());
        square.reSize(Math.random());
        shapes[0] = circle;
        shapes[1] = rectangle;
        shapes[2] = square;
        System.out.println(Arrays.toString(shapes));

    }
}
