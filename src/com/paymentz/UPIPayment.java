package com.paymentz;

public class UPIPayment extends Payment{
    

    public String upiId;

    public UPIPayment(String transactionId, double amount, String upiId) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.upiId = upiId;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing UPI payment of $" + amount + " to " + upiId);
    }
}
