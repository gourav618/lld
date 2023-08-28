package questions.interfaces;


// create an interface of payment gateway service
// int getOrderId();
// double pgOpenTime();
// Boolean processPayment(int orderId);


// concrete class -> razorpay, juspay, cashfree


// write a program that finds the pg with least pg opentime
// and creates and process payment with that
public interface PaymentGateway {
    int getOrderId();
    double pgOpenTime();
    boolean processPayment(int orderId);
}
