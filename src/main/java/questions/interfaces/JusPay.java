package questions.interfaces;

public class JusPay implements PaymentGateway{
    @Override
    public int getOrderId() {
        return 1;
    }

    @Override
    public double pgOpenTime() {
        return 2;
    }

    @Override
    public boolean processPayment(int orderId) {
        return true;
    }
}
