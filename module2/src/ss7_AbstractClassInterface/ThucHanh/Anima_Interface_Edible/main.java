package ss7_AbstractClassInterface.ThucHanh.Anima_Interface_Edible;

public class main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        for (Animal a : animals){
            System.out.println(a.makeSound());
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howtoEat());
        }

    }
}
