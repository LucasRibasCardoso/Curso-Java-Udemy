package Modulo05.ClassesAbstratas.Exercicio01.Entities;

public class Retangle extends Shape{
    private double width;
    private double height;

    public Retangle(Color color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return width * height;
    }
}
