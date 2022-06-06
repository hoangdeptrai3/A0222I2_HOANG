package ss7_AbstractClassInterface.ThucHanh.Anima_Interface_Edible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "hello chichken";
    }
    @Override
    public String howtoEat(){
        return "eat dc";
    }
}
