interface Printable {
    public void print();
}

interface Scannable {
    public void scan();
}

interface Faxable {
    public void fax();
}

class Printer implements Printable {

    @Override
    public void print() {
        System.out.println("printing document...");
    }
}

class Scanner implements Scannable {

    @Override
    public void scan() {
        System.out.println("scanning document...");
    }
}

class AllInOnePrinter implements Printable, Scannable, Faxable {

    @Override
    public void fax() {
        System.out.println("fax document...");
    }

    @Override
    public void print() {
        System.out.println("printing document...");
    }

    @Override
    public void scan() {
        System.out.println("scanning document...");
    }
}

public class IspPrincipleRealWorldExample {
    public static void main(String[] args) {

        Scannable scannable = new Scanner();
        scannable.scan();

        Printable printable = new Printer();
        printable.print();

        AllInOnePrinter allInOnePrinter = new AllInOnePrinter();
        allInOnePrinter.scan();
        allInOnePrinter.print();
        allInOnePrinter.fax();

    }
}
