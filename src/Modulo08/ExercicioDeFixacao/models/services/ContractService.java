package Modulo08.ExercicioDeFixacao.models.services;


import Modulo08.ExercicioDeFixacao.models.entities.Contract;
import Modulo08.ExercicioDeFixacao.models.entities.Installment;
import Modulo08.ExercicioDeFixacao.models.execeptions.InstallmentException;
import Modulo08.ExercicioDeFixacao.models.interfaces.OnlinePaymentservice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContractService {

    public void processContract(Contract contract, int quantityInstallments) {

        OnlinePaymentservice onlinePaymentservice = new PaypalService();
        List<Installment> installments = new ArrayList<>();

        double valuePerInstallment = contract.getTotalValue() / quantityInstallments;

        for (int i = 1; i <= quantityInstallments; i++) {
            try {
                LocalDate installmentDate = contract.getDate().plusMonths(i);
                double installmentWithTax = onlinePaymentservice.interest(valuePerInstallment, i);
                double installmentTotalValue = onlinePaymentservice.paymentFee(installmentWithTax);

                Installment installment = new Installment(installmentTotalValue, installmentDate);
                installments.add(installment);
            }
            catch (InstallmentException e) {
                System.out.println("Erro ao processar parcela: ");

        }
    }

        contract.setInstallments(installments);
}
}
