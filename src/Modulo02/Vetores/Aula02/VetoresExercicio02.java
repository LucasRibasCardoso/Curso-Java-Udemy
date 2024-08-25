package Modulo02.Vetores.Aula02;

import java.util.Locale;
import java.util.Scanner;

public class VetoresExercicio02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // pega a quantidade de produtos
        Product[] vect = new Product[n]; // cria vetor vazio com n elementos

        for (int i = 0; i < vect.length; i++) { // itera sob cada espaço vazio do vetor
            sc.nextLine();
            String name = sc.nextLine(); // pega o nome do produto
            double price = sc.nextDouble(); // pega o preço do produto
            vect[i] = new Product(name, price); // cria o produto e adiciona no vetor
        }
        double sum = 0.0; // cria a variável soma, começando com 0

        for (int i = 0; i < vect.length; i++) { // itera sob cada produto do vetor
            sum += vect[i].getPrice(); // soma o preço do produto mais o valor total da soma
        }

        double avg = sum / vect.length; // calcula a média

        System.out.printf("AVERAGE PRICE = %.2f%n", avg);
        sc.close();
    }
}
