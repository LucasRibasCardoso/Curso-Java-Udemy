package Modulo08.ExercicioDeFixacao.models.interfaces;

public interface OnlinePaymentservice {

    double paymentFee(double amount);

    double interest(double amount, Integer months);
}
