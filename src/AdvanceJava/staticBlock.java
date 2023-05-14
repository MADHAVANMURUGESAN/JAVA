package AdvanceJava;

import static java.lang.Class.forName;

class staticblck{
    String name = null;
    int num ;
    static String book="Java";
    public staticblck(){
        System.out.println("It is by constructor..");
        System.out.println("name: "+name+" "+"num: " +num+"book: "+book);
    }
    static {
        System.out.println("It is by Static method..");
    }
}
public class staticBlock {
    public static void main(String[] args)/* throws ClassNotFoundException*/{
        staticblck obj1 = new staticblck();
        staticblck obj2 = new staticblck();
       /* Class.forName("staticblck");*/

    }
}
