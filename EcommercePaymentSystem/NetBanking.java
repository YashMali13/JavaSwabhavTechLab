package EcommercePaymentSystem;

public class NetBanking implements PaymentGateway {
    public void pay(double amount) {
        System.out.println(" Paid ₹" + amount + " using Net Banking.");
    }

    public void refund(double amount) {
        System.out.println(" Refunded ₹" + amount + " to Net Banking account.");
    }
}
