package Modulo05.ClassesAbstratas.Exercicio01.Entities;

public abstract class Shape {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract double area();
}
