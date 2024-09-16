package Modulo08.InjecaoDeDependencia.application;

import Modulo08.InjecaoDeDependencia.models.controllers.AuthController;
import Modulo08.InjecaoDeDependencia.models.entities.AppleAuthenticator;
import Modulo08.InjecaoDeDependencia.models.entities.GoogleAuthenticator;
import Modulo08.InjecaoDeDependencia.models.entities.UserRepository;

/**
 * Nesse exemplo estamos simulando um sistema de login, com duas classes.
 * Uma sendo responsável por autenticar e outra por salvar o usuário.
 */

public class program {
    public static void main(String[] args) {

        GoogleAuthenticator googleAuthenticator = new GoogleAuthenticator();
        AppleAuthenticator appleAuthenticator = new AppleAuthenticator();

        UserRepository userRepository = new UserRepository();

        AuthController authController = new AuthController(googleAuthenticator, userRepository);

        if (authController.login("admin", "admin")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
    }
}
