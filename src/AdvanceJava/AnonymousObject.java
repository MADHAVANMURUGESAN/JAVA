package AdvanceJava;
class sample{
    public sample(){
        System.out.println("constructor..");
    }
    public void show(){
        System.out.println("show method...");
    }
}
public class AnonymousObject {
    public static void main(String[] args) {
        //sample sam = new sample();// reference object
        new sample(); // anonymous object
        new sample().show(); //anonymous object method call
    }
}
