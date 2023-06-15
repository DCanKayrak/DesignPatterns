package SOLID.LiskovSubstitution;

public class Penguin implements Bird{
    @Override
    public void eat() {
        System.out.println("Penguin Eating");
    }

    @Override
    public void fly() {
        System.out.println("Penguins can't fly");
    }
}
