package designPrincipleSolid.dip;

public class PurchaseFlowManager {

    private final PaymentProcessor paymentProcessor;
    private final NotificationSender notificationSender;

    /**
     * Dependency Injection
     * @param paymentProcessor payment processor
     * @param notificationSender notification sender
     */
    public PurchaseFlowManager(PaymentProcessor paymentProcessor, NotificationSender notificationSender) {
        this.paymentProcessor = paymentProcessor;
        this.notificationSender = notificationSender;
    }

    public void triggerPurchaseFlow(int productId, int customerId) {
        paymentProcessor.processPayment(productId, customerId);
        notificationSender.sendNotification(productId, customerId);
    }
}
