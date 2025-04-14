public class WrapperConvertion {
    public static void main(String[] args) {
        //Boxing: convert primitive to wrapper
        int primitive = 5;
        Integer integerPrimitive = Integer.valueOf(primitive);//explicit boxing
        System.out.println("integerPrimitive: " + integerPrimitive);
        //Autoboxing: primitive to wrapper data
        int radiosValue = 24;
        System.out.println("radiusValue: " + radiosValue);
        Integer wrapperInteger = radiosValue; //Autoboxing
        System.out.println("wrapperInteger: " + wrapperInteger);

        //Unboxing: wrapper to primitive data
        Integer integer1 = Integer.valueOf(10);
        System.out.println("integer1: " + integer1);
        int primitiveExpValue = integer1.intValue();//explicit unboxing
        System.out.println("primitiveExpValue: " + primitiveExpValue);
        //Autounboxing: wrapper to primitive data
        int primitiveAutoValue = integer1;
        System.out.println("primitiveAutoValue: " + primitiveAutoValue);

        //Primitive to String
        String strInteger = Integer.toString(primitiveAutoValue);
        System.out.println("strInteger: " + strInteger);
        //String to Primitive
        int parseInt = Integer.parseInt(strInteger);
        System.out.println("parseInt: " + parseInt);
    }
}
