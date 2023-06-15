package SOLID.SingleResponsibility;

public class Main {
    public static void main(String[] args) {
        AuthenticationService authService = new AuthenticationService();
        CustomerAuth customerAuth = new CustomerAuth();
        authService.login(customerAuth);
    }

}
