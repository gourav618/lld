package designPrincipleSolid.dip;

public interface PaymentProcessor {
    void processPayment(int productId, int customerId);
}
