package Modulo08.InjecaoDeDependencia.models.entities;

public class GoogleAuthenticator implements IAuthenticator {
    @Override
    public boolean authenticate(String username, String pass) {
        // lógica para autenticar o usuário. Exemplo:
        String user = "admin";
        String password = "admin";
        System.out.println("Google está autenticando usuário...");
        return user.equals(username) && password.equals(password);
    }
}
