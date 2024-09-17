package Modulo08.ExercicioDeFixacao.IOUtils;

import Modulo08.ExercicioDeFixacao.models.execeptions.ContractException;
import Modulo08.ExercicioDeFixacao.models.execeptions.InstallmentException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtils {

    public static int readContractNumber(Scanner sc, String message) {

        while (true) {
            System.out.print(message);
            try {
                return sc.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Error: Contract number is invalid. Enter an integer value.");
                sc.nextLine();
            }
        }
    }

    public static LocalDate readContractDate(Scanner sc, String message) {

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        while (true) {
            System.out.print(message);
            try {
                sc.nextLine();
                return LocalDate.parse(sc.nextLine(), pattern);
            }
            catch (Exception e) {
                System.out.println("Error: Date format is invalid. Use dd/MM/yyyy.");
            }
        }
    }



    public static int getQuantityInstallmentsFromUser(Scanner sc, String message) {
        System.out.print(message);
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println("Error: Quantity of installments is invalid. Enter an integer value.");
            System.out.print(message);
        }
        return sc.nextInt();
    }

    public static void validateQuantityInstallments(int quantity) {
        if (quantity < 1) {
            throw new InstallmentException("Error: Quantity of installments must be greater than 1.");
        }
    }

    public static int readQuantityInstallments(Scanner sc, String message) {

        int quantityInstallments;
        while (true) {
            quantityInstallments = getQuantityInstallmentsFromUser(sc, message);
            try {
                validateQuantityInstallments(quantityInstallments);
                return quantityInstallments;
            }
            catch (InstallmentException e) {
                System.out.println
                        (e.getMessage());
            }
        }
    }



    public static double getContractValueFromUser(Scanner sc, String message) {
        System.out.print(message);
        while (!sc.hasNextDouble()) {
            System.out.println("Error: Invalid input. Please enter a numeric value.");
            sc.nextLine(); // Limpa a entrada inválida
            System.out.print(message);
        }
        return sc.nextDouble();
    }

    public static void validateContractValue(double value) throws ContractException {
        if (value < 1) {
            throw new ContractException("Error: Value must be greater than 1.");
        }
    }

    public static double readContractValue(Scanner sc, String message) {
        double contractValue;
        while (true) {
            contractValue = getContractValueFromUser(sc, message); // Lê o valor
            try {
                validateContractValue(contractValue); // Valida o valor
                return contractValue; // Se válido, retorna o valor
            } catch (ContractException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
