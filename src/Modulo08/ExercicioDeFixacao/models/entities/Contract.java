package Modulo08.ExercicioDeFixacao.models.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Contract {
    private Integer number;
    private LocalDate date;
    private Double totalValue;
    private List<Installment> installments;

    public Contract(LocalDate date, Integer number, Double totalValue) {
        this.date = date;
        this.number = number;
        this.totalValue = totalValue;
    }

    public void setInstallments(List<Installment> installments) {
        this.installments = installments;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

    public LocalDate getDate() {
        return date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Installment installment : getInstallments()) {
            sb.append(installment.getDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            sb.append(" - ");
            sb.append(String.format("%.2f", installment.getAmount()) + "\n");
        }

        return sb.toString();
    }
}