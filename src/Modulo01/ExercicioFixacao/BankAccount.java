package Modulo01.ExercicioFixacao;

import java.util.Scanner;

public class BankAccount {

    private int number;            // numero da conta
    private String holder; // nome titular
    private double balance;        // saldo atual
    private final double RATE = 5.00; // taxa de juros saque

    // Construtores
    public BankAccount(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public BankAccount(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    // Funcionalidades
    public void printData() {
        System.out.println("--------------------------------------------");
        System.out.println("Accout Data");
        System.out.print(String.format("Account %d, Holder: %s, Balance: $%s\n".
                formatted(this.number, this.holder, this.balance)));
        System.out.println("--------------------------------------------");
    }

    // Deposito
    public void deposit(Double value) {
        this.balance += value;
    }

    // Saque
    public void Withdrawal(Double value) {
        // valor do saque + taxa de juros
        double withdrawalValue = value + RATE;

        if (!(withdrawalValue > this.balance)) {
            this.balance -= (value + RATE);
        }
        else {
            System.out.println("Value unavailable for withdrawal");
        }
    }

    // Ler numero da conta
    public static int readAccountNumber(Scanner scanner) {
        System.out.print("Enter account number: ");
        return scanner.nextInt();
    }

    // Ler nome do titular
    public static String readAccountHolder(Scanner scanner) {
        System.out.print("Enter account holder: ");
        return scanner.next();
    }

    // Ler valor do deposito
    public static double readDepositValue(Scanner scanner) {
        System.out.print("Enter a deposit value: ");
        return scanner.nextDouble();
    }

    // Ler valor do saque
    public static double readWithdrawalValue(Scanner scanner) {
        System.out.print("Enter a withdrawal value: ");
        return scanner.nextDouble();
    }

    // Ler opção de depósito
    public static String readDepositOption(Scanner scanner) {
        System.out.print("Is there na initial deposit (y/n)? ");
        return scanner.next().toUpperCase();
    }
}
