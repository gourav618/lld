package designPrincipleSolid.dip;

public class SmsNotification implements NotificationSender{
    @Override
    public void sendNotification(int productId, int customerId) {
        System.out.println("Send notification using SMS of customer: " + customerId + " for product: " + productId);
    }
}
