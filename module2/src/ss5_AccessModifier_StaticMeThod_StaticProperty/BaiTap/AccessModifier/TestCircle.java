package ss5_AccessModifier_StaticMeThod_StaticProperty.BaiTap.AccessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle sc = new Circle(2.0);
//        sc.setRadius(10.0);
//        sc.getRadius();
        System.out.println("dien tich hinh tron la " +sc.getArea());
    }
}
