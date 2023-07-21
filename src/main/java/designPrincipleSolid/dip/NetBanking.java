package designPrincipleSolid.dip;

public class NetBanking implements PaymentProcessor{
    @Override
    public void processPayment(int productId, int customerId) {
        System.out.println("Process payment using Net Banking of customer: " + customerId + " for product: " + productId);
    }
}
