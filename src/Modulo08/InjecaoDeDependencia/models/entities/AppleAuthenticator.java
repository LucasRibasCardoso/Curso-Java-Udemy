package Modulo08.InjecaoDeDependencia.models.entities;

public class AppleAuthenticator implements IAuthenticator {
    @Override
    public boolean authenticate(String username, String pass) {
        // lógica para autenticar o usuário. Exemplo:
        String user = "admin";
        String password = "admin";
        System.out.println("Apple está autenticando usuário...");
        return user.equals(username) && password.equals(password);
    }
}
