package SOLID.LiskovSubstitution;

public class Eagle implements Bird {
    @Override
    public void eat() {
        System.out.println("Eagle Eating");
    }

    @Override
    public void fly() {
        System.out.println("Eagle Flying.");
    }
}
