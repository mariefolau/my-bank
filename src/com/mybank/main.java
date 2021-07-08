package com.mybank;

import com.mybank.account.CheckingAccount;
import com.mybank.account.InsufficientFundsException;
import com.mybank.account.SavingsAccount;

public class Main {

    public static void main(String[] args) {
        CheckingAccount one = new CheckingAccount(
                "customer one",
                "customer one account",
                100.0,
                "c1"
        );

        SavingsAccount two = new SavingsAccount(
                "saver two",
                "saver two account",
                100.0,
                "s2"
        );

        try {
            one.transfer(two, 5.0);
            two.withdraw(3.0);
        } catch (IllegalArgumentException | InsufficientFundsException | UnsupportedOperationException e) {
            System.out.println(e);
        }
    }
}
