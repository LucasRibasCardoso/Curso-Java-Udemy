package Modulo11.Consumer.Implementacao02.application;



import Modulo11.Consumer.Implementacao02.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        list.forEach(Product::staticPriceUpdate);

        list.forEach(System.out::println);
    }
}
