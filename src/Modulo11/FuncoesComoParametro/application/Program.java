package Modulo11.FuncoesComoParametro.application;

import Modulo11.FuncoesComoParametro.entities.Product;
import Modulo11.FuncoesComoParametro.service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Tv", 900.00));
        products.add(new Product("Mouse", 50.00));
        products.add(new Product("Tablet", 350.50));
        products.add(new Product("HD Case", 80.90));

        ProductService ps = new ProductService();

        double sum1 = ps.filteredSum(products, p -> p.getName().charAt(0) == 'T');
        System.out.println("Total sum: R$" + String.format("%.2f", sum1));

        double sum2 = ps.filteredSum(products, p -> p.getName().charAt(0) == 'M');
        System.out.println("Total sum: R$" + String.format("%.2f", sum2));
    }
}
