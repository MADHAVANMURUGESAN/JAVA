public class InitThrgMethod {
    public static void main(String[] args) {
        //way of instance creation
        Initthroughmethods obj1 = new Initthroughmethods(), obj2 = new Initthroughmethods();
        obj1.insertValue(21, "hari");
        obj1.display();
        obj2.insertValue(45,"Narayana");
        obj2.display();

        // way of instance creation
        new Initthroughmethods().fact(5); //calling a anonymousn obj


    }
}

class Initthroughmethods {
    int rollNo;
    String name;

    void insertValue(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display() {
        System.out.println("rollNo: " + rollNo + " name: " + name);
    }

    void fact(int a) {
        int fac = 1;
        for (int i = 1; i <= a; i++) {
            fac *= i;
        }
        System.out.println("fact: " + fac);
    }
}
