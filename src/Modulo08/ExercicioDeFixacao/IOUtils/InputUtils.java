package Modulo08.ExercicioDeFixacao.IOUtils;

import Modulo08.ExercicioDeFixacao.models.execeptions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtils {

private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private static int getContractNumberFromUser(Scanner sc, String message) {

        System.out.print(message);
        while (!sc.hasNextInt()) {
            sc.next();
            throw new InputMismatchException("Error: Number is invalid. Enter a integer value.");
        }
        return sc.nextInt();
    }
    private static void validateContractNumber(Integer number) {

        if (number < 1000) {
            throw new ContractNumberSizeException("Error: contract number must contain at least 4 digits");
        }

        if (number <= 0) {
            throw new ContractNumberTooLowException("Error: contract number must be greater than 0.");
        }
    }
    public static int readContractNumber(Scanner sc, String message) {

        while (true) {
            try {
                int contractNumber = getContractNumberFromUser(sc, message);
                validateContractNumber(contractNumber);
                return contractNumber;
            } catch (ContractNumberSizeException | InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    private static String getContractDateFromUser(Scanner sc, String message){
        System.out.print(message);
        return sc.next();
    }
    private static LocalDate validateContractDate(String date) throws DateTimeParseException {
        try {
            return LocalDate.parse(date, FORMATTER);
        }
        catch (DateTimeParseException e) {
            throw new ContractDateInvalidFormatException("Error: Date format is invalid. Use dd/MM/yyyy.");
        }
    }
    public static LocalDate readContractDate(Scanner sc, String message) {

        while (true) {
            try {
                String contractDate = getContractDateFromUser(sc, message);
                LocalDate validatedDate = validateContractDate(contractDate);
                return validatedDate;
            }
            catch (ContractDateInvalidFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    private static int getQuantityInstallmentsFromUser(Scanner sc, String message) {

        System.out.print(message);
        while (!sc.hasNextInt()) {
            sc.next();
            throw new InputMismatchException("Error: Quantity is invalid. Enter a integer value.");
        }
        return sc.nextInt();
    }
    private static void validateQuantityInstallments(int quantity) {

        if (quantity <= 0) {
            throw new InstallmentTooLowException("Error: Quantity of installments must be greater than 0.");
        }
    }
    public static int readQuantityInstallments(Scanner sc, String message) {

        while (true) {
            try {
                int quantityInstallments = getQuantityInstallmentsFromUser(sc, message);
                validateQuantityInstallments(quantityInstallments);
                return quantityInstallments;
            }
            catch (InstallmentTooLowException | InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    private static double getContractValueFromUser(Scanner sc, String message) {
        System.out.print(message);
        while (!sc.hasNextDouble()) {
            sc.next();
            throw new InputMismatchException("Error: Value is invalid. Enter a double value.");
        }
        return sc.nextDouble();
    }
    private static void validateContractValue(double value) {
        if (value <= 0) {
            throw new ContractValueTooLowException("Error: Value must be greater than $0.");
        }
    }
    public static double readContractValue(Scanner sc, String message) {
        while (true) {
            try {
                double contractValue = getContractValueFromUser(sc, message);
                validateContractValue(contractValue);
                return contractValue;
            }
            catch (ContractValueTooLowException | InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
