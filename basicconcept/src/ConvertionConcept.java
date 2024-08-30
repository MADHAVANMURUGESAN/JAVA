import java.util.Arrays;
import java.util.List;

public class ConvertionConcept {
    public static void main(String[] args) {
        String strNmae = "madhavan";
        System.out.println("strName: " + strNmae);
        //string to Array conversion
        char[] ch = strNmae.toCharArray();
        System.out.println("ch: " + ch);
        System.out.println("Arrays.toString(ch): " + Arrays.toString(ch));

        //Array to string conversion
        String str_Name = String.valueOf(ch);
        System.out.println(str_Name);

        //array values assign to list
        List<Integer> list_Integer1 = Arrays.asList(new Integer[]{2, 3, 4, 52, 4});
        System.out.println("list_Integer1: " + list_Integer1);
        Integer[] valueInt = new Integer[]{2, 4, 6, 34, 356, 67, 3};
        System.out.println("valueInt: " + Arrays.toString(valueInt));
        List<Integer> list_Integer2 = Arrays.asList(valueInt);
        System.out.println("list_Integer2: " + list_Integer2);
    }
}
