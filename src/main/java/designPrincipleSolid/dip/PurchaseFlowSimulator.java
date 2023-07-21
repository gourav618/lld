package designPrincipleSolid.dip;

public class PurchaseFlowSimulator {
    public static void main(String[] args){
        PurchaseFlowManager purchaseFlowManager = new PurchaseFlowManager(new NetBanking(), new SmsNotification());
        purchaseFlowManager.triggerPurchaseFlow(1, 2);
        System.out.println("--------------------------------------------------");
        PurchaseFlowManager purchaseFlowManager1 = new PurchaseFlowManager(new UpiBasedPayment(), new EmailNotification());
        purchaseFlowManager1.triggerPurchaseFlow(1, 2);
    }
}
