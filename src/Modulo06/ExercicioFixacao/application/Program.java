package Modulo06.ExercicioFixacao.application;

import Modulo06.ExercicioFixacao.models.entities.Account;
import Modulo06.ExercicioFixacao.models.exceptions.AccountException;

import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");

        System.out.print("Number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Holder: ");
        sc.next();
        String accountHolder = sc.nextLine();

        System.out.print("Initial balance: ");
        double initialBalance = sc.nextDouble();

        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        Account account = new Account(accountNumber, accountHolder, initialBalance, withdrawLimit);
        System.out.println();

        System.out.print("Enter amount for withdraw: ");
        double amountForWithdraw = sc.nextDouble();

        try {
            account.withdraw(amountForWithdraw);
            System.out.println("Balance: " + account.getBalance());
        }
        catch (AccountException e) {
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
        }
    }
}
