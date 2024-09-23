package Modulo10.Generics.application;

import Modulo10.Generics.entities.Product;
import Modulo10.Generics.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String path = "C:\\Users\\lucas\\OneDrive\\Documentos\\GitHub\\CursoJavaNelioAlves\\src\\Modulo10\\Generics\\application\\products";

        List<Product> list = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String readedLine = br.readLine();
            while (readedLine != null) {
                String[] fields = readedLine.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                readedLine = br.readLine();
            }

            Product item = CalculationService.max(list);
            System.out.print("Most expensive: ");
            System.out.println(item);

        }
        catch (IOException e) {
            System.out.println("Error");
        }
        finally {
            sc.close();
        }
    }
}
