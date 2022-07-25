package demo.DemoAbstract;

public class dog extends AnimalAb implements Fly  {

    @Override
    public void eat() {
        System.out.println("dog eat rice");
    }

    @Override
    public void duoi() {

    }

    @Override
    public void fly() {
        System.out.println("cho ko biet bay ");
    }
}
