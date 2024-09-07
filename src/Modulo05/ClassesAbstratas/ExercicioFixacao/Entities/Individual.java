package Modulo05.ClassesAbstratas.ExercicioFixacao.Entities;

public class Individual extends TaxPayer {

    private Double healthExpenditures;

    public Individual(Double anualIncome, String nome, Double healthExpenditures) {
        super(anualIncome, nome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double tax;

        if (getAnualIncome() < 20000) {
            tax = (getAnualIncome() * 15) / 100;
        }
        else {
            tax = (getAnualIncome() * 25) / 100;
        }

        if (healthExpenditures > 0) {
            tax -= healthExpenditures / 2;
        }

        return tax;
    }
}
