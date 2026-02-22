package com.paymentz;

public abstract class Payment {
    private String transactionId;
    private double amount;

    public Payment(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public abstract void processPayment();

    public void printReceipt() {
        System.out.println("Receipt for: " + transactionId + " | Amount: " 
        + amount);
    }
}
