package EcommercePaymentSystem;

public class Checkout {
    private PaymentGateway gateway;

    public Checkout(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public void processPayment(double amount) {
        gateway.pay(amount);
    }

    public void processRefund(double amount) {
        gateway.refund(amount);
    }
}
