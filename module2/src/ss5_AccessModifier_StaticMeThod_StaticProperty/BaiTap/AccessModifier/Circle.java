package ss5_AccessModifier_StaticMeThod_StaticProperty.BaiTap.AccessModifier;

public class Circle {
    private Double radius = 1.0;
    private String color = "red";
    public Circle(){

    }
    public Circle(Double radius){

        this.radius = radius;
    }
    public Double getRadius(){

        return this.radius;
    }
    public void setRadius(Double newRadius){
        this.radius = newRadius;
    }
    public Double getArea(){

        return 3.14 * Math.pow(this.radius,2);
    }
}
