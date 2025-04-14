import java.util.Random;

public class EnumsMethods {
    public static void main(String[] args) {
        //Direction direction = Direction.EAST;
        Direction direction = getRandomEnum(Direction.class);
        Random random1 = new Random();
        System.out.println("random.nextInt(): " + random1.nextInt());
        System.out.println("random.nextDouble(): " + random1.nextDouble());
        System.out.println("random.nextInt(10): " + random1.nextInt(10)); //0-9
        int a = (int) (Math.random() * 10);//0-9
        System.out.println("integer value: " + a);
        switch (direction) {
            case EAST -> System.out.println("east side direction");
            case WEST -> System.out.println("west side direction");
            case NORTH -> System.out.println("north side direction");
            case SOUTH -> System.out.println("south side direction");
            default -> System.out.println("Not present a direction");

        }
    }

    //method1
    public static <T extends Enum<?>> T getRandomEnum(Class<T> enumClass) {
        Random random2 = new Random();
        T[] enumArray = enumClass.getEnumConstants();
        return enumArray[random2.nextInt(enumArray.length)];
    }

    //method2
    public static Direction getDirectionStatus(Direction direction) {
        Direction[] direction1 = Direction.values();
        Random random3 = new Random();
        return direction1[random3.nextInt(direction1.length)];
    }
}
