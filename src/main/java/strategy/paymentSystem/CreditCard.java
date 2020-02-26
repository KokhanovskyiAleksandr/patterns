package strategy.paymentSystem;

public class CreditCard implements PayStrategy {
    @Override
    public int totalAmountOfMoney() {
        return 0;
    }

    @Override
    public void pay() {
        System.out.println("pay with credit card");
    }
}
