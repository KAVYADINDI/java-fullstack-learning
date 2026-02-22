package com.paymentz;

public class CreditCardPayment extends Payment {
   
    private String cardNumber;

    public CreditCardPayment(String transactionId, double amount, String cardNumber) {
        super(transactionId, amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing CREDIT CARD payment on card " + cardNumber);
    }   
}
