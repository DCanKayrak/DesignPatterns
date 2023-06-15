package SOLID.InterfaceSegregation;

public class Eagle implements Flyable,Eatable {
    @Override
    public void eat() {
        System.out.println("Eagle Eating");
    }

    @Override
    public void fly() {
        System.out.println("Eagle Flying.");
    }
}
