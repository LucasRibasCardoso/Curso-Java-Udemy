package Modulo08.ExercicioInterface.application;

import Modulo08.ExercicioInterface.models.entities.CarRental;
import Modulo08.ExercicioInterface.models.entities.Vehicle;
import Modulo08.ExercicioInterface.models.services.BrazilTaxService;
import Modulo08.ExercicioInterface.models.services.RentalService;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();

        System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);

        System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();

        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());

        rentalService.processInvoice(carRental);

        System.out.println("FATURA: ");
        System.out.println("Pagamento básico: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
        System.out.println("Imposto: " + String.format("%.2f", carRental.getInvoice().getTax()));
        System.out.println("Pagamento total: " + String.format("%.2f", carRental.getInvoice().getTotalPayment()));

        sc.close();
    }
}
