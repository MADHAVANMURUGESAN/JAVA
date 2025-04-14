import java.util.Comparator;
import java.util.concurrent.Callable;

public class FunInterfaceWithLambda {
    public static void main(String[] args) {
        FunctionalWithLambda functionalWithLambda = (a) -> System.out.println("Message display: " + a);
        functionalWithLambda.messageSend("madhavan...");
    }
}

interface FunctionalWithLambda {
    void messageSend(String chatMessage);
}