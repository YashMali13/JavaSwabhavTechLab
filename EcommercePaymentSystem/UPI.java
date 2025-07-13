package EcommercePaymentSystem;

public class UPI implements PaymentGateway {
    public void pay(double amount) {
        System.out.println(" Paid ₹" + amount + " using UPI.");
    }

    public void refund(double amount) {
        System.out.println(" Refunded ₹" + amount + " to UPI account.");
    }

}

