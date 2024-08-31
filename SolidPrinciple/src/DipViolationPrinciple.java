class LightBulb {
    public void turnOn() {
        System.out.println("turn on light...");
    }

    public void turnOff() {
        System.out.println("turn off light...");
    }
}

class Switch {
    private LightBulb lightBulb;

    Switch(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    public void flip(boolean on) {
        if (on)
            lightBulb.turnOn();
        else
            lightBulb.turnOff();
    }
}

public class DipViolationPrinciple {
    public static void main(String[] args) {
        LightBulb lightBulb = new LightBulb();
        Switch lightSwitch = new Switch(lightBulb);
        lightSwitch.flip(true);
        lightSwitch.flip(false);
    }
}
