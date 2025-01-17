package org.example.payment;

public class CreditCardPayment implements PaymentStrategy {
    private final String cardNumber;
    private final String cardHolderName;
    private final String expirationDate;
    private final String cvv;

    public CreditCardPayment(String cardNumber, String cardHolderName, String expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    @Override
    public void pay(double amount) {
        if (validateCardDetails()) {
            System.out.println("Paid $" + amount + " with Credit Card.");
        } else {
            System.out.println("Payment failed: Invalid credit card details.");
        }
    }

    private boolean validateCardDetails() {
        return cardNumber != null && cardNumber.matches("\\d{16}") &&
                expirationDate != null && expirationDate.matches("\\d{2}/\\d{2}") &&
                cvv != null && cvv.matches("\\d{3}");
    }
}
