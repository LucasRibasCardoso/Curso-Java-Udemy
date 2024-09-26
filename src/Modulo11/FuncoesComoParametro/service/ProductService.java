package Modulo11.FuncoesComoParametro.service;

import Modulo11.FuncoesComoParametro.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double filteredSum(List<Product> products, Predicate<Product> comparation){
        double sum = 0.0;
        for (Product p : products){
            if (comparation.test(p)){
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
