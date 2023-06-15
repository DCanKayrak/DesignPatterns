package SOLID.SingleResponsibility;

public interface IAuthService {
    boolean login();
    boolean logout();
}

class CustomerAuth implements IAuthService{

    @Override
    public boolean login() {
        System.out.println("Müşteri giriş yaptı!");
        return false;
    }

    @Override
    public boolean logout() {
        return false;
    }
}

class CorporateAuth implements IAuthService{

    @Override
    public boolean login() {
        System.out.println("Şirket giriş yaptı!");
        return false;
    }

    @Override
    public boolean logout() {
        return false;
    }
}
