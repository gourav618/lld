package questions.interfaces;

// create an interface of payment gateway service
// int getOrderId();
// double pgOpenTime();
// Boolean processPayment(int orderId);


// concrete class -> razorpay, juspay, cashfree


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// write a program that finds the pg with least pg opentime
// and creates and process payment with that
public class MakePayment {
    public static void main(String[] args){
        //this approach not good
        //since no modularity , if we have new payment gateway we have to change this code
        PaymentGateway razor = new RazorPay();
        PaymentGateway jusPay = new JusPay();
        PaymentGateway cashFree = new CashFree();

        if (razor.pgOpenTime() < jusPay.pgOpenTime() && razor.pgOpenTime() < cashFree.pgOpenTime()){
            razor.processPayment(razor.getOrderId());
        }
        else if (jusPay.pgOpenTime() < razor.pgOpenTime() && jusPay.pgOpenTime() < cashFree.pgOpenTime()){
            jusPay.processPayment(jusPay.getOrderId());
        }
        else{
            cashFree.processPayment(cashFree.getOrderId());
        }

        //this approach is good

        //since we are using complete abstraction
        //we are not dependent on any concrete class
        //if we have new payment gateway we don't have to change this code
        List<PaymentGateway> pgs = Arrays.asList(new RazorPay(), new JusPay(), new CashFree());
        PaymentGateway minTimePg = null;
        double minTime = Double.MAX_VALUE;
        //update minTimePg and minTime with the pg with least pgOpenTime
        for (int i=0; i< pgs.size(); i++){
            if (minTime > pgs.get(i).pgOpenTime()){
                minTime = pgs.get(i).pgOpenTime();
                minTimePg = pgs.get(i);
            }
        }
        //process payment with the pg with least pgOpenTime
        if (minTimePg != null) {
            minTimePg.processPayment(minTimePg.getOrderId());
        }

    }
}
