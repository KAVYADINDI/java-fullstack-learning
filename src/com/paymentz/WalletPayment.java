package com.paymentz;

public class WalletPayment extends Payment {
    
    private String walletName;

    public WalletPayment(String transactionId, double amount, String walletName) {
       super(transactionId,amount);
        this.walletName = walletName;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing WALLET payment via " + walletName);
    }
    
}
