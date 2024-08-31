interface PaymentProcess {
    public void processPayment(double amount);
}

class DebitCardProcess implements PaymentProcess {

    @Override
    public void processPayment(double amount) {
        System.out.println("Debit Card payment: $" + amount);
    }
}

class PaymentService {
    private PaymentProcess paymentProcess;

    public PaymentService(PaymentProcess paymentProcess) {
        this.paymentProcess = paymentProcess;
    }

    public void payAmount(double amt) {
        paymentProcess.processPayment(amt);
    }
}

public class DipPrincipleRealWorldExample {
    public static void main(String[] args) {
        PaymentProcess debitPaymentProcess = new DebitCardProcess();
        PaymentService paymentService = new PaymentService(debitPaymentProcess);
        paymentService.payAmount(23.97);

    }
}
