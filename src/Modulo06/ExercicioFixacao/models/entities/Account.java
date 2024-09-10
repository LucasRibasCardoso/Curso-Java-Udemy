package Modulo06.ExercicioFixacao.models.entities;

import Modulo06.ExercicioFixacao.models.exceptions.AccountException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw(Double amount) throws AccountException {
        validateWithdraw(amount);
        this.balance -= amount;
    }

    public void validateWithdraw(Double amount) throws AccountException {
        if (amount > withdrawLimit) {
            throw new AccountException("Withdraw error: The amount exceeds withdraw limit");
        }
        if (amount > balance) {
            throw new AccountException("Withdraw error: Not enough balance");
        }
    }

    public void deposit(Double amount) throws AccountException {
        validateDeposit(amount);
        this.balance += amount;
    }

    public void validateDeposit(Double amount) throws AccountException {
        if (amount < 0) {
            throw new AccountException("Deposit error: Please type a positive value to deposit.");
        }
    }
}
