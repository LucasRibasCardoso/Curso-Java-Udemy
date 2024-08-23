package Modulo01.Aula03_Encapsulamento;


public class EncapsulamentoTeste01 {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Lucas", "lucas@gmail.com", "123456", "888.122.421-32");

        System.out.println("Nome usuário: " + usuario.getNome());
        System.out.println("Email usuário: " + usuario.getEmail());
        System.out.println("Senha usuário: " + usuario.getPassword());
        System.out.println("CPF usuário: " + usuario.getCpf());

        System.out.println();

        // Note que não temos o metodo setter para o cpf, ou seja, o usuário nao pode alterar o cpf. Dessa
        // forma criamos uma barreira e mantemos os dados da nossa classe seguros.

        usuario.setNome("Silva");
        usuario.setEmail("Silva@gmail.com");
        usuario.setPassword("1384");

        System.out.println("Nome usuário: " + usuario.getNome());
        System.out.println("Email usuário: " + usuario.getEmail());
        System.out.println("Senha usuário: " + usuario.getPassword());
        System.out.println("CPF usuário: " + usuario.getCpf());
    }
}
