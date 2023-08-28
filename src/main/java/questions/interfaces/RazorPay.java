package questions.interfaces;

public class RazorPay implements PaymentGateway{

    @Override
    public int getOrderId() {
        return 1;
    }

    @Override
    public double pgOpenTime() {
        return 1;
    }

    @Override
    public boolean processPayment(int orderId) {
        return true;
    }
}
