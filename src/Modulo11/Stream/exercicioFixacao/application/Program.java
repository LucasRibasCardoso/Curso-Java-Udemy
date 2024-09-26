package Modulo11.Stream.exercicioFixacao.application;

//C:\Users\lucas\OneDrive\Documentos\GitHub\CursoJavaNelioAlves\src\Modulo11\Stream\exercicioFixacao\Products

import Modulo11.Stream.exercicioFixacao.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        System.out.print("Enter full path file: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {

                String[] fields = line.split(",");
                Product product = new Product(fields[0], Double.parseDouble(fields[1]));
                products.add(product);

                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Pega a média entre os produtos
        double average = products.stream()
                .map(p -> p.getPrice())
                .reduce(0.0, (x, y) -> x + y) / products.size();

        // Filtra e ordena os produtos abaixo da média
        List<String> belowAverageProducts = products.stream()
                .filter(product -> product.getPrice() <= average)
                .map(Product::getName)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());


        System.out.println("Average price: R$" + String.format("%.2f", average));

        for (String product : belowAverageProducts) {
            System.out.println(product);
        }
    }
}
