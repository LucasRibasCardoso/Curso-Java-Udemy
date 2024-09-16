package Modulo08.InjecaoDeDependencia.models.entities;

public interface IAuthenticator {
    boolean authenticate(String username, String password);
}
