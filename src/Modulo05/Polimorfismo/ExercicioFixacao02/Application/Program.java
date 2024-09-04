package Modulo05.Polimorfismo.ExercicioFixacao02.Application;

import Modulo05.Polimorfismo.ExercicioFixacao02.Entities.ImportedProduct;
import Modulo05.Polimorfismo.ExercicioFixacao02.Entities.Product;
import Modulo05.Polimorfismo.ExercicioFixacao02.Entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Date;

/**
 * Fazer um programa para ler os dados de N
 * produtos (N fornecido pelo usuário). Ao final,
 * mostrar a etiqueta de preço de cada produto na
 * mesma ordem em que foram digitados.
 * Todo produto possui nome e preço. Produtos
 * importados possuem uma taxa de alfândega, e
 * produtos usados possuem data de fabricação.
 * Estes dados específicos devem ser
 * acrescentados na etiqueta de preço conforme
 * exemplo (próxima página). Para produtos
 * importados, a taxa e alfândega deve ser
 * acrescentada ao preço final do produto.
 */

public class Program {
    public static void main(String[] args) throws ParseException {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int numberOfProducts = sc.nextInt();

        for (int i = 1; i <= numberOfProducts; i++) {
            System.out.println();
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char productType = sc.next().charAt(0);
            productType = Character.toUpperCase(productType);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            switch (productType) {
                case 'I':
                    System.out.print("Customs fee: ");
                    double customsFee = sc.nextDouble();
                    products.add(new ImportedProduct(name, price, customsFee));
                    break;

                case 'U':
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    products.add(new UsedProduct(name, price, date));
                    break;

                case 'C':
                    products.add(new Product(name, price));

                default:
                    System.out.println("Invalid product type!");
                    break;

            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product product : products) {
            System.out.println(product.priceTag());
        }
    }
}
