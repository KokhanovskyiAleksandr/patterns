package strategy;

import strategy.paymentSystem.Cash;
import strategy.paymentSystem.CreditCard;

public class Main {
    public static void main(String[] args) {
        int payAmount = 3;

        CreditCard creditCard = new CreditCard();
        Cash cash = new Cash();

        int moneyOnCard = creditCard.totalAmountOfMoney();
        int moneyCash = cash.totalAmountOfMoney();

        if (moneyOnCard >= payAmount) {
            new Context(creditCard).pay();
        } else if (moneyCash >= payAmount) {
            new Context(cash).pay();
        } else {
            System.out.println("Call the police");
        }
    }
}
