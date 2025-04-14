public class BuilderDesignPattern {
    public static void main(String[] args) {
        Vehicles car = new Vehicles.VehicleBuilder(2, 4).setAirBags(2).build();
        System.out.println(car.getEngine());
        System.out.println(car.getAirBag());
        System.out.println(car.getWheel());
    }
}

class Vehicles {
    private int engine;
    private int wheel;
    private int airBag;

    public int getEngine() {
        return engine;
    }

    public int getWheel() {
        return wheel;
    }

    public int getAirBag() {
        return airBag;
    }

    private Vehicles(VehicleBuilder vehicleBuilder) {
        this.engine = vehicleBuilder.engine;
        this.airBag = vehicleBuilder.airBag;
        this.wheel = vehicleBuilder.wheel;
    }

    public static class VehicleBuilder {
        private int engine;
        private int wheel;
        private int airBag;

        public VehicleBuilder(int engine, int wheel) {
            this.engine = engine;
            this.wheel = wheel;
        }

        public VehicleBuilder setAirBags(int airBag) {
            this.airBag = airBag;
            return this;
        }

        public Vehicles build() {
            return new Vehicles(this);
        }
    }
}
