public class Diamondproblem implements inter1, inter2 {
    public static void main(String[] args) {
        Diamondproblem diamondproblem = new Diamondproblem();
        diamondproblem.show1();
    }

    @Override
    public void show1() {
        System.out.println("show1...");
    }

    @Override
    public void show2() {
        System.out.println("show2...");
    }

    @Override
    public void show() {
        System.out.println("show...");
    }
}

interface inter1 {
    public void show1();

    public void show2();
}

interface inter2 {
    public void show();
}