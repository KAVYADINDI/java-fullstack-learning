package com.paymentz;

public class WalletPayment extends Payment {
    
    public String walletName;

    public WalletPayment(String transactionId, double amount, String walletName) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.walletName = walletName;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing WALLET payment of $" + amount + " via " + walletName);
    }
    
}
