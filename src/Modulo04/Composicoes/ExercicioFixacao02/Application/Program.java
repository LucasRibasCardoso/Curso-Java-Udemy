package Modulo04.Composicoes.ExercicioFixacao02.Application;

import Modulo04.Composicoes.ExercicioFixacao02.Models.Entities.Client;
import Modulo04.Composicoes.ExercicioFixacao02.Models.Entities.Order;
import Modulo04.Composicoes.ExercicioFixacao02.Models.Entities.OrderItem;
import Modulo04.Composicoes.ExercicioFixacao02.Models.Entities.Product;
import Modulo04.Composicoes.ExercicioFixacao02.Models.Enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.next();

        System.out.print("Birth date (DD/MM/YYYY): ");
        String stringDate = sc.next();
        Date birthDate = sdf.parse(stringDate);

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = sc.next();
        OrderStatus orderStatus = OrderStatus.valueOf(status);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        List<OrderItem> items = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();

            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            Product product = new Product(productName, productPrice);

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantity, productPrice, product);

            items.add(orderItem);
        }

        Order order = new Order(new Date(), orderStatus, client, items);

        System.out.println();
        System.out.println("ORDER SUMMARY");
        System.out.println(order);

        sc.close();
    }
}
