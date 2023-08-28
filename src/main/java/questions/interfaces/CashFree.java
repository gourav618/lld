package questions.interfaces;

public class CashFree implements PaymentGateway{
    @Override
    public int getOrderId() {
        return 1;
    }

    @Override
    public double pgOpenTime() {
        return 3;
    }

    @Override
    public boolean processPayment(int orderId) {
        return true;
    }
}
