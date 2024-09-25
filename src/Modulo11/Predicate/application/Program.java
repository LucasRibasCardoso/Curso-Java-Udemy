package Modulo11.Predicate.application;

import Modulo11.Predicate.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Iphone", 3400.00));
        list.add(new Product("SmartWatch", 960.00));
        list.add(new Product("Headset", 300.00));

        /*
         * @removeIf() recebe como parâmetro um @Predicate, que é uma interface com um unico metodo abstrato,
         * esse metodo é responsável retornar um booleano conforme a condição passada.
         *
         * Nesse exemplo, os itens com preço acima ou igual a 950.00 serão removidos.
         */
        list.removeIf(p -> p.getPrice() >= 950.00);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
