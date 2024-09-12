package Modulo07.ExercicioFixacao.application;

import Modulo07.ExercicioFixacao.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.print("Enter a folder path: ");
        String strPath = sc.nextLine();

        File sourcefolder = new File(strPath);
        String sourceFolder = sourcefolder.getParent();

        boolean success = new File(sourceFolder + "\\out").mkdir();

        String targetFolder = sourceFolder + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {

            String line = br.readLine();
            while (line != null) {

                String[] splitLine = line.split(";");
                String name = splitLine[0];
                double price = Double.parseDouble(splitLine[1]);
                int quantity = Integer.parseInt(splitLine[2]);

                Product product = new Product(name, price, quantity);
                products.add(product);

                line = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFolder))) {
                for (Product product : products) {
                    bw.write(product.toString());
                    bw.newLine();
                }
                System.out.println(targetFolder + " CREATED!");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
