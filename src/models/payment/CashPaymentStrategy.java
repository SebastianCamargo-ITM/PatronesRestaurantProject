package models.payment;

import interfaces.PaymentStrategy;

public class CashPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Cash");
    }
}