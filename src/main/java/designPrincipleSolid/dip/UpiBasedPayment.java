package designPrincipleSolid.dip;

public class UpiBasedPayment implements PaymentProcessor{
    @Override
    public void processPayment( int productId, int customerId) {
        System.out.println("Process payment using UPI of customer: " + customerId + " for product: " + productId);
    }
}
