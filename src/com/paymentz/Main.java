package com.paymentz;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
    CreditCardPayment ccPayment = new CreditCardPayment("TXN123", 100.0, "4111-1111-1111-1111");
    WalletPayment walletPayment = new WalletPayment("TXN124", 50.0, "PayPal");
    UPIPayment upiPayment = new UPIPayment("TXN125", 75.0, "user@upi");

 ArrayList<Payment> payments = new ArrayList<>();
    payments.add(ccPayment);    
    payments.add(walletPayment);
    payments.add(upiPayment);

    System.out.println("\nProcessing all payments:");

   for (Payment p : payments) {
      p.processPayment();
      p.printReceipt();
   }
  
}

}
