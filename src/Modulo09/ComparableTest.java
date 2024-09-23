package Modulo09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Faça um programa para ler um arquivo contendo funcionários (nome e salário) no formato
 * .csv, armazenando-os em uma lista. Depois, ordenar a lista por nome e mostrar o resultado
 * na tela. Nota: o caminho do arquivo pode ser informado "hardcode"
 */

public class ComparableTest {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        String filePath = "C:\\Users\\lucas\\OneDrive\\Documentos\\GitHub\\CursoJavaNelioAlves\\src\\Modulo09\\teste.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){

            String emplyeeCsv = br.readLine();
            while (emplyeeCsv != null) {
                String[] fields = emplyeeCsv.split(",");
                String name = fields[0];
                Double salary = Double.parseDouble(fields[1]);
                employees.add(new Employee(name, salary));
                emplyeeCsv = br.readLine();
            }

            Collections.sort(employees);
            for (Employee employee : employees){
                System.out.println(employee);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
