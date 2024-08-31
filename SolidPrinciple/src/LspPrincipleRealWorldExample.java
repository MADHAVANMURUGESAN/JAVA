abstract class Payment {
    public abstract void processPayment(double amt);
}

class CreditCard extends Payment {

    @Override
    public void processPayment(double amt) {
        System.out.println("CreditCard process payment: $" + amt);
    }
}

class DebitCard extends Payment {

    @Override
    public void processPayment(double amt) {
        System.out.println("DebitCard process payment: $" + amt);
    }
}

public class LspPrincipleRealWorldExample {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        creditCard.processPayment(230.23);
        DebitCard debitCard = new DebitCard();
        debitCard.processPayment(864.00);
    }
}
