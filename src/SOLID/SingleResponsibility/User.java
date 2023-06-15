package SOLID.SingleResponsibility;

public class User {
    private String firstName;
    private String lastName;

    private String getFullName(){
        return firstName + lastName;
    }
}
