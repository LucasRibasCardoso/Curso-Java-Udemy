package Modulo02.ExercicioFixacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> listEmployees = new ArrayList<>();

        // Pergunta quantos empregador deseja cadastrar
        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Employee #" + i + ": ");

            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(listEmployees, id)) {
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            listEmployees.add(new Employee(id, name, salary));
        }


        System.out.println();
        // Pergunta o id do empregado que deseja aumentar o salário
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        // Itera sob cada empregado pegando o id e comparando para ver se encontra o empregado equivalente.
        Employee emp = listEmployees.stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElse(null); // se não encontrar, retorna null

        // se emp for null é porque não existe empregado com esse id informado
        if (emp == null) {
            System.out.println("This id does not exist!");
        }
        // Se o empregado for encontrado, pergunta quantos % deseja aumentar no salario
        else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        // Imprime a lista de empregados atualizada
        System.out.println();
        System.out.println("List of employees:");

        for (Employee obj : listEmployees) {
            System.out.println(obj);
        }

        sc.close();
    }

    /**
     * Essa função recebe uma lista de empregados e um Id que deseja encontrar o funcionário equivalente.
     * Para cada empregado da lista, pega o id e compara com o Id alvo, se encontrar algum empregado, retorna
     * true, se não retorna false.
     *
     * @param list
     * @param id
     * @return boolean
     */
    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElse(null);
        return emp != null;
    }
}
