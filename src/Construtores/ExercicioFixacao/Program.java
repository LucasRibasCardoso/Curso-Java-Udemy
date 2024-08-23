package Construtores.ExercicioFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        BankAccount account;

        System.out.println("========================");
        System.out.println("CREATE JAVA BANK ACCOUNT");
        System.out.println("========================");


        int accountNumber = BankAccount.readAccountNumber(scanner);

        String cardHolderName = BankAccount.readAccountHolder(scanner);

        String optionDeposit = BankAccount.readDepositOption(scanner);

        if (optionDeposit.equals("Y")) {
            double initialDeposit = BankAccount.readDepositValue(scanner);
            account = new BankAccount(accountNumber, cardHolderName, initialDeposit);
        }
        else {
            account = new BankAccount(accountNumber, cardHolderName);
        }
        account.printData();

        double depositValue = BankAccount.readDepositValue(scanner);
        account.deposit(depositValue);
        account.printData();

        double withdrawalValue = BankAccount.readWithdrawalValue(scanner);
        account.Withdrawal(withdrawalValue);
        account.printData();

        scanner.close();
    }
}
