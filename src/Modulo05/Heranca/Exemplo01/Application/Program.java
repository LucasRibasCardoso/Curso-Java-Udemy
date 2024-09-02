package Modulo05.Heranca.Exemplo01.Application;

import Modulo05.Heranca.Exemplo01.Entities.BusinessAccount;

public class Program {
    public static void main(String[] args) {

        BusinessAccount businessAccount = new BusinessAccount(
                1823,
                "Lucas",
                1000.0,
                500.0
        );

        System.out.println(businessAccount.getBalance());
    }
}
