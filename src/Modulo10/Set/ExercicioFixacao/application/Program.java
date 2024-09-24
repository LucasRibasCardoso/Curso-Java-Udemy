package Modulo10.Set.ExercicioFixacao.application;

import Modulo10.Set.ExercicioFixacao.entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Student> students = new HashSet<>();

        for (int i = 1; i <= 3; i++) {
            char course = (char) (i + 'A' - 1);
            System.out.print("How many students for the course " + course + "? ");
            int n = sc.nextInt();

            for (int j = 0; j < n; j++) {
                System.out.print("Student ID: ");
                int studentID = sc.nextInt();
                students.add(new Student(studentID));
            }
        }

        System.out.println("Total students: " + students.size());
        sc.close();
    }
}
