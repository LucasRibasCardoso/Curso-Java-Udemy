package Modulo08.InjecaoDeDependencia.models.entities;

public class UserRepository implements IUserRepository {
    @Override
    public void save(String username) {
        // lógica para salvar o usuário autenticado
        System.out.println("Salvando usuario...");
    }
}
