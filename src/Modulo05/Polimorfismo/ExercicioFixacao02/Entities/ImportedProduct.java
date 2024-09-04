package Modulo05.Polimorfismo.ExercicioFixacao02.Entities;

public class ImportedProduct extends Product{
    private Double customsFee; // taxa alfandegária

    public ImportedProduct(Double customsFee) {
        this.customsFee = customsFee;
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public double totalPrice() {
        return getPrice() + customsFee;
    }

    @Override
    public String priceTag() {
        return getName() +
                " $ " +
                String.format("%.2f", totalPrice()) +
                " (Customs fee: $ " +
                String.format("%.2f", customsFee)
                + ")";
    }
}
