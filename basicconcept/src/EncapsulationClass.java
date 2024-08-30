class EncapClass {
    private int age;
    private String name;

    public void setCap(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }
}

public class EncapsulationClass {
    public static void main(String[] args) {
        EncapClass encapClass = new EncapClass();
        encapClass.setCap(25, "madhavan");
        System.out.println("age: " + encapClass.getAge());
        System.out.println("name: " + encapClass.getName());
    }
}
