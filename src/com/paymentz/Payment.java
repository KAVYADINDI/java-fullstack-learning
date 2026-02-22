package com.paymentz;

public abstract class Payment {
    public String transactionId;
    public double amount;

    public abstract void processPayment();

    public void printReceipt() {
        System.out.println("Receipt for: " + transactionId + " | Amount: " + amount);
    }
}
