package Modulo05.ClassesAbstratas.ExercicioFixacao.Entities;


public abstract class TaxPayer {
    private String name;
    protected Double anualIncome;

    public TaxPayer(Double anualIncome, String name) {
        this.anualIncome = anualIncome;
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public abstract double tax();

    @Override
    public String toString() {
        return name + ": $" + String.format("%.2f", this.tax());
    }
}
