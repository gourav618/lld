package designPrincipleSolid.dip;

public class EmailNotification implements NotificationSender{
    @Override
    public void sendNotification(int productId, int customerId) {
        System.out.println("Send notification using Email of customer: " + customerId + " for product: " + productId);
    }
}
