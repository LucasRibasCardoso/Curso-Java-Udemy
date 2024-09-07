package Modulo05.ClassesAbstratas.Exercicio01.Application;

import Modulo05.ClassesAbstratas.Exercicio01.Entities.Circle;
import Modulo05.ClassesAbstratas.Exercicio01.Entities.Color;
import Modulo05.ClassesAbstratas.Exercicio01.Entities.Retangle;

/**
 * Fazer um programa para ler os dados de N figuras (N fornecido
 * pelo usuário), e depois mostrar as áreas destas figuras na
 * mesma ordem em que foram digitadas.
 */

public class Program {
    public static void main(String[] args) {

        Circle circle = new Circle(Color.BLACK, 2.0);
        Retangle retangle = new Retangle(Color.RED, 3.0, 3.0);

        System.out.println(circle.area());
        System.out.println(retangle.area());
    }
}
