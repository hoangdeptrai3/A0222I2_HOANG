package ss7_AbstractClassInterface.BaiTap.interfaceResizeable;

public class Square extends Rectangle{
    public Square(){

    }
    public Square(double size){
        super(size,size);
    }
    public Square(String color,boolean filled,double size){
        super(color,filled,size,size);
    }
    public double getSize(){
        return getWidth();
    }
    public void setSize(double size){
        setWidth(size);
        setLength(size);
    }
    public void setWidth(double size){
        setSize(size);
    }
    public void setLength(double size){
        setSize(size);
    }

    @Override
    public String toString() {
        return "a shape with size "+
                getSize() +
                "which is a subclass of"+
                super.toString();
    }
}
