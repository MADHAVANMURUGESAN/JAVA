abstract class CarClass {
    public abstract void stopCall();
}
abstract class ChainClass{
     void starCall(){
         System.out.println("hello,,,");
     }
}

class HondaClass extends CarClass {

    @Override
    public void stopCall() {
        System.out.println("stop a honda car...");
    }
}

public class AbstractClassConcept extends ChainClass {
    public static void main(String[] args) {
        HondaClass hondaClass = new HondaClass();
        hondaClass.stopCall();
        CarClass carClass = new HondaClass();
        carClass.stopCall();

        CarClass carClass1 = new CarClass() {
            @Override
            public void stopCall() {
                System.out.println("Internal main call...");
            }
        };
        carClass1.stopCall();

    }
}
