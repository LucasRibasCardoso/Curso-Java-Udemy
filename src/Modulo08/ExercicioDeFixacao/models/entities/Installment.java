package Modulo08.ExercicioDeFixacao.models.entities;

import java.time.LocalDate;

public class Installment {
    private LocalDate date;
    private Double amount;

    public Installment(Double amount, LocalDate date) {
        this.amount = amount;
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public Double getAmount() {
        return amount;
    }
}
