import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringConcept {
    public static void main(String[] args) {
        String strValue1 = new String("Hello world");
        //or
        String strValue2 = "Hello world";
        String strValue3 = new String("Hello world");
        System.out.println("strValue1: " + strValue1);
        System.out.println("strValue1: " + System.identityHashCode(strValue1));
        System.out.println("strValue2: " + strValue2);
        System.out.println("strValue2: " + System.identityHashCode(strValue2));
        System.out.println("strValue3: " + strValue3);
        System.out.println("strValue3: " + System.identityHashCode(strValue3));
        System.out.println("strValue3: " + strValue2 == strValue1);
        System.out.println("strValue3: " + strValue2.equals(strValue1));

        strValue2 = strValue2 + "s";
        System.out.println("strValue2: " + strValue2);
        System.out.println("strValue2: " + System.identityHashCode(strValue2));
        strValue1.concat("java");//immutable class
        System.out.println("strValue1: " + strValue1);

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("java");
        System.out.println("stringBuffer: " + stringBuffer);
        System.out.println("stringBuffer: " + System.identityHashCode(stringBuffer));
        stringBuffer.append("s");
        System.out.println("stringBuffer: " + stringBuffer);
        System.out.println("stringBuffer: " + System.identityHashCode(stringBuffer));


        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Teacher..");
        System.out.println("stringBuilder: " + stringBuilder);

        //StringTokenizer
        System.out.println("...token1...");
        StringTokenizer token1 = new StringTokenizer("Hello world java");
        while (token1.hasMoreTokens())
            System.out.println(token1.nextToken());

        System.out.println("...token2...");
        StringTokenizer token2 = new StringTokenizer("Hello, world, java", ", ");
        while (token2.hasMoreTokens())
            System.out.println(token2.nextToken());

        System.out.println("...token3...");
        StringTokenizer token3 = new StringTokenizer(" Hello : world : java", ":", true);
        while (token3.hasMoreTokens())
            System.out.println(token3.nextToken());

        //string joiner
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("kk");
        arrayList.add("ll");
        arrayList.add("pp");
        System.out.println("...Stringjoiner...");
        StringJoiner joiner1 = new StringJoiner(",");
        System.out.println("joiner1: " + joiner1);
        joiner1.setEmptyValue("Not available");
        System.out.println("joiner1: " + joiner1);
        joiner1.add("AA");
        joiner1.add("BB");
        joiner1.add("CC");
        System.out.println("joiner1: " + joiner1);
        StringJoiner joiner2 = new StringJoiner(":");
        joiner2.add(arrayList.get(0)).add(arrayList.get(1));
        System.out.println("joiner2: " + joiner2);
        joiner1.merge(joiner2);
        System.out.println("joiner1.merge(joiner2): " + joiner1);
        System.out.println("joiner1.length(): " + joiner1.length());
        System.out.println("joiner1.merge(joiner2): " + joiner1.toString());
    }
}
