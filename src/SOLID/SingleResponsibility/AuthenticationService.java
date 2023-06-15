package SOLID.SingleResponsibility;

public class AuthenticationService {
    public boolean login(IAuthService auth){
        auth.login();
        return true;
    }

    public boolean logout(IAuthService auth){
        auth.logout();
        return true;
    }
}
