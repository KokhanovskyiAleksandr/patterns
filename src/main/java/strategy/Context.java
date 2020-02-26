package strategy;

import strategy.paymentSystem.PayStrategy;

public class Context {
    private PayStrategy payStrategy;

    Context(PayStrategy payStrategy) {
    this.payStrategy = payStrategy;
    }

    public void pay() {
        payStrategy.pay();
    }
}
