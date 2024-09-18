package Modulo08.ExercicioDeFixacao.models.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        sb.append(" - ");
        sb.append(String.format("%.2f", amount));

        return sb.toString();
    }
}
