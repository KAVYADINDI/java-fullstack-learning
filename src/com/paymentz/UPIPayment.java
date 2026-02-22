package com.paymentz;

public class UPIPayment extends Payment{
    

    private String upiId;

    public UPIPayment(String transactionId, double amount, String upiId) {
        super(transactionId,amount);
        this.upiId = upiId;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing UPI payment from " + 
        upiId);
    }
}
