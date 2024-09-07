package Modulo05.ClassesAbstratas.ExercicioFixacao.Application;

import Modulo05.ClassesAbstratas.ExercicioFixacao.Entities.Company;
import Modulo05.ClassesAbstratas.ExercicioFixacao.Entities.Individual;
import Modulo05.ClassesAbstratas.ExercicioFixacao.Entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int numberOfTaxPayers = sc.nextInt();

        List<TaxPayer> taxPayers = new ArrayList<>();

        for (int i = 1; i <= numberOfTaxPayers; i++) {
            System.out.println("Tax payer #" + i + " Data:");

            System.out.print("Individual or Company? (i/c): ");
            char typeOfTaxPayer = Character.toUpperCase(sc.next().charAt(0));

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.next();

            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            switch (typeOfTaxPayer) {
                case 'C':
                    System.out.print("Number of employees: ");
                    int numOfEmployees = sc.nextInt();
                    taxPayers.add(new Company(anualIncome, name, numOfEmployees));
                    break;

                case 'I':
                    System.out.print("Health expenditures: ");
                    double healthExpenditures = sc.nextDouble();
                    taxPayers.add(new Individual(anualIncome, name, healthExpenditures));
                    break;
            }
        }
        System.out.println();
        System.out.println("TAXES PAID:");

        double totalTaxPaid = 0.0;
        for (TaxPayer taxPayer : taxPayers) {
            totalTaxPaid += taxPayer.tax();
            System.out.println(taxPayer);
        }

        System.out.println();
        System.out.print("TOTAL TAXES: " + String.format("%.2f", totalTaxPaid));

    }
}

