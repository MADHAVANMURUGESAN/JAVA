import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ArrayConcept {
    public static void main(String[] args) {
        //declare of array methods
        //array of object
        int[] arr1 = new int[10];
        System.out.println("arr1: " + arr1.length);
        //array literal
        int[] arr2 = new int[]{2, 5, 7, 8, 9};
        System.out.println("arr2: " + arr2.length);
        int[] arr3 = {12, 4, 10, 37, 8, 2, 35, 5};
        System.out.println("arr3: " + Arrays.toString(arr3));
        System.out.println(10 + " found at index = "
                + Arrays.binarySearch(arr3, 10));

        //sorting array
        Arrays.sort(arr3);
        System.out.println("arr3: " + Arrays.toString(arr3));
        System.out.println(10 + " found at index = "
                + Arrays.binarySearch(arr3, 10));

        //array specif feature..
        int[] c = new int[]{2, 4, 6, 8, 9, 7, 5, 3, 1};
        System.out.println("c: " + c.toString());//no use
        System.out.println("c: " + Arrays.asList(c));//no use
        List list = Arrays.asList(c);
        System.out.println("list: " + list);
    }
}
