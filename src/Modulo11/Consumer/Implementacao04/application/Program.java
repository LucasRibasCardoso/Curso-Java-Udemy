package Modulo11.Consumer.Implementacao04.application;


import Modulo11.Consumer.Implementacao03.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        Consumer<Product> consumer = product -> {
            product.setPrice(product.getPrice() * 1.1);
        };

        list.forEach(consumer);

        list.forEach(System.out::println);
    }
}
