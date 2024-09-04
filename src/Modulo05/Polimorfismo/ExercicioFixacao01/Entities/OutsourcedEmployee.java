package Modulo05.Polimorfismo.ExercicioFixacao01.Entities;

public class OutsourcedEmployee extends Employee {
    private double additionalCharge;

    public OutsourcedEmployee() {
    }

    public OutsourcedEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + additionalCharge * 1.1;
    }
}
