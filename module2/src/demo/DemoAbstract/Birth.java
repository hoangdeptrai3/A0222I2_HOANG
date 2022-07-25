package demo.DemoAbstract;

public class Birth implements Fly,Walk {

    @Override
    public void fly() {
        System.out.println("birth can fly ");
    }

    @Override
    public void walk() {
        System.out.println("birth can not walk");
    }
}
