public class Conceptofclass {
    int a;
    String ch;

    public static void main(String[] args) {
        //access an inside of class data member
        Conceptofclass conceptofclass = new Conceptofclass();
        conceptofclass.a = 24;
        conceptofclass.ch = "maddy";
        System.out.println("a: " + conceptofclass.a);
        System.out.println("ch: " + conceptofclass.ch);

        //access an outside of class data member
        Defineclass defineclass = new Defineclass();
        defineclass.name = "madhavan";
        defineclass.number = 23;
        System.out.println("number: " + defineclass.number);
        System.out.println("name: " + defineclass.name);
    }
}

class Defineclass {
    int number;
    String name;
}