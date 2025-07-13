package EcommercePaymentSystem;

public  class CreditCard implements PaymentGateway {
    public void pay(double amount) {
        System.out.println(" Paid ₹" + amount + " using Credit Card.");
    }

    public void refund(double amount) {
        System.out.println(" Refunded ₹" + amount + " to Credit Card.");
    }
}
