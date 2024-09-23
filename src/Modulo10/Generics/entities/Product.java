package Modulo10.Generics.entities;

public class Product implements Comparable<Product>{

    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Product o) {
        return price.compareTo(o.getPrice());
    }

    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }
}
