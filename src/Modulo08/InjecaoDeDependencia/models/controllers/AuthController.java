package Modulo08.InjecaoDeDependencia.models.controllers;

import Modulo08.InjecaoDeDependencia.models.entities.IAuthenticator;
import Modulo08.InjecaoDeDependencia.models.entities.IUserRepository;

public class AuthController {
    private IAuthenticator authenticator;
    private IUserRepository userRepository;

    public AuthController(IAuthenticator authenticator, IUserRepository userRepository) {
        this.authenticator = authenticator;
        this.userRepository = userRepository;
    }

    public boolean login(String username, String password) {
        if (this.authenticator.authenticate(username, password)) {
            this.userRepository.save(username);
            return true;
        }
        else{
            return false;
        }
    }
}
