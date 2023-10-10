// PaymentProcessor interface defines the contract
interface PaymentProcessor {
    void processPayment(double amount);
}

// Implementing class for PaymentProcessor
class SecurePaymentProcessor implements PaymentProcessor {
    // The actual implementation is hidden from clients
    public void processPayment(double amount) {
        // Secure payment processing logic
        System.out.println("Processing payment of $" + amount + " securely.");
    }
}

public class DoPayment {
    public static void main(String[] args) {
        // Client code uses the interface, not the implementation details
        PaymentProcessor processor = new SecurePaymentProcessor();
        processor.processPayment(100.0);
    }
}

/*
In the Main class, we create an instance of SecurePaymentProcessor through the interface PaymentProcessor.
Clients of the PaymentProcessor interface only need to know that they can call processPayment, but they don't need
to know the details of how the payment is processed securely.

By using interfaces in this way, you achieve the security of the payment processing implementation because clients
only interact with the interface and are not exposed to the internal implementation details. This separation of concerns
helps maintain code security and makes it easier to change or update the implementation without affecting the clients of
the interface.
 */
