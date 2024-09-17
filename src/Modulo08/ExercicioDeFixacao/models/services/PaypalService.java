package Modulo08.ExercicioDeFixacao.models.services;

import Modulo08.ExercicioDeFixacao.models.interfaces.OnlinePaymentservice;

public class PaypalService implements OnlinePaymentservice {

    @Override
    public double interest(double amount, Integer month) {
        return amount + ((amount * month) / 100);
    }

    @Override
    public double paymentFee(double amount) {
        return amount + ((amount * 2) / 100);
    }
}
