package Modulo05.ClassesAbstratas.ExercicioFixacao.Entities;

public class Company extends TaxPayer{

    private int numberOfEmployees;

    public Company(Double anualIncome, String nome, int numberOfEmployees) {
        super(anualIncome, nome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        double tax;

        if (numberOfEmployees > 10) {
            tax = (getAnualIncome() * 14) / 100;
        }
        else {
            tax = (getAnualIncome() * 16) / 100;
        }

        return tax;
    }
}
