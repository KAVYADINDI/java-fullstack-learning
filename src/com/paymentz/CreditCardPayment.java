package com.paymentz;

public class CreditCardPayment extends Payment {
   
    public String cardNumber;

    public CreditCardPayment(String transactionId, double amount, String cardNumber) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing CREDIT CARD payment of $" + amount + " on card " + cardNumber);
    }   
}
