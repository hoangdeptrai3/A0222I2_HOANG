package ss5_AccessModifier_StaticMeThod_StaticProperty.ThucHanh.StaticProperty;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("roll royce" ,"a");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("roll royce2" , "b");
        System.out.println(Car.numberOfCars);
        Car car3 = new Car ("roll royce3","c");
        System.out.println(Car.numberOfCars);
    }
}
