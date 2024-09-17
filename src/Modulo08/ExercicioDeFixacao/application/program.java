package Modulo08.ExercicioDeFixacao.application;


import Modulo08.ExercicioDeFixacao.IOUtils.InputUtils;
import Modulo08.ExercicioDeFixacao.models.entities.Contract;
import Modulo08.ExercicioDeFixacao.models.services.ContractService;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("---DATA OF CONTRACT---");

        int contractNumber = InputUtils.readContractNumber(sc, "Number: ");
        LocalDate contractDate = InputUtils.readContractDate(sc, "Date: ");
        double contractValue = InputUtils.readContractValue(sc, "Total Value: ");
        int quantityInstallments = InputUtils.readQuantityInstallments(sc, "Quantity of installments: ");

        Contract contract = new Contract(contractDate, contractNumber, contractValue);
        ContractService contractService = new ContractService();

        contractService.processContract(contract, quantityInstallments);

        System.out.println();
        System.out.println("---INSTALLMENTS---");
        System.out.println(contract);
    }
}
