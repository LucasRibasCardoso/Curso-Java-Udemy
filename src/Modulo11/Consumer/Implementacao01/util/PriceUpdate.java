package Modulo11.Consumer.Implementacao01.util;

import Modulo11.Consumer.Implementacao01.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product p) {
        // Aumenta o preço em 10%
        p.setPrice(p.getPrice() * 1.1);
    }
}
