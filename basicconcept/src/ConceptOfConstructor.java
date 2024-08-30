class kitch {
    {
        System.out.println("kitch methods...");
    }

    kitch() {
        this(6);
        System.out.println("default kitch constructor...");
    }

    kitch(int a) {
        System.out.println("parameter kitch constructor:" + a);
    }
}

class KitMeth extends kitch{
    int a;

    {
        System.out.println("Init first...");
    }

    KitMeth() {

        System.out.println("called by default constructor...");
    }

    {
        System.out.println("Init second...");
    }

    KitMeth(int a) {
        this.a = a;
        System.out.println("a: " + a);
    }

    KitMeth(KitMeth kitMeth) {
        super();
        System.out.println(kitMeth.a);
    }
}

public class ConceptOfConstructor {
    public static void main(String[] args) {
        new KitMeth();
        KitMeth k = new KitMeth(2);
        new KitMeth(k);
    }
}
