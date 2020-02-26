package strategy.paymentSystem;

public class Cash implements PayStrategy {
    @Override
    public int totalAmountOfMoney() {
        return 10;
    }

    @Override
    public void pay() {
        System.out.println("pay with cash");
    }
}
