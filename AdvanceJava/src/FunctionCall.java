import java.util.function.Function;

class FunctionIn implements Function<String, Integer> {

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}

public class FunctionCall {
    public static void main(String[] args) {
        FunctionIn functionIn = new FunctionIn();
        System.out.println(functionIn.apply("hello"));

        Function<String, Integer> integerFunction = (String a) -> a.length();
        System.out.println(integerFunction.apply("rupees"));

        String str = "Javapointer";
        System.out.println("str: " + str);
        char[] ch = str.toCharArray();
        System.out.println("ch:" + ch[0]);
    }
}
