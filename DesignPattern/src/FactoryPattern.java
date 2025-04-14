public class FactoryPattern {
    public static void main(String[] args) {
        Vehicle bike = FactoryVehicle.getInstance("Car", 4);
        System.out.println(bike);
    }
}

class Bike extends Vehicle {
    int wheel;

    Bike(int wheel) {
        this.wheel = wheel;
    }

    @Override
    public int getWheel() {
        return this.wheel;
    }
}

class Car extends Vehicle {
    int wheel;

    Car(int wheel) {
        this.wheel = wheel;
    }

    @Override
    public int getWheel() {
        return this.wheel;
    }
}

abstract class Vehicle {
    public abstract int getWheel();

    public String toString() {
        return "Wheeled: " + this.getWheel();
    }
}

class FactoryVehicle {
    public static Vehicle getInstance(String obj, int wheel) {
        if ("Car".equals(obj)) {
            return new Car(wheel);
        } else if ("Bike".equals(obj)) {
            return new Bike(wheel);
        }
        return null;
    }
}