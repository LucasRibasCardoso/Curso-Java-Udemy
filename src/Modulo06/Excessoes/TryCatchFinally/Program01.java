package Modulo06.Excessoes.TryCatchFinally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("type a name: ");
            String[] vect = sc.nextLine().split(" ");

            System.out.println("type a position of vector: ");
            int position = sc.nextInt();

            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indalid position");
        }
        catch (InputMismatchException e) {
            System.out.println("Input error");
        }

        sc.close();
    }
}
