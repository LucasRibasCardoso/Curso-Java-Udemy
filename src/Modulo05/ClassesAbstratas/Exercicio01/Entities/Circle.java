package Modulo05.ClassesAbstratas.Exercicio01.Entities;

public class Circle extends Shape{
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * (radius * radius);
    }
}
