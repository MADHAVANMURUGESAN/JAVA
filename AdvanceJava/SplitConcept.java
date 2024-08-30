package AdvanceJava;

import java.util.Arrays;

public class SplitConcept {
    public static void main(String[] args) {
        String str1 = "madhavan.murugesan.vinitha.senthamarai";
        System.out.println("str1:: " + str1);
        String[] arr1 = str1.split("\\.");
        System.out.println("arr1:: " + Arrays.toString(arr1));

        String str2 = "madhavan-murugesan-vinitha-senthamarai";
        System.out.println("str2:: "+str2);
        String[] arr2 = str2.split("\\-",2);
        System.out.println("arr2:: "+Arrays.toString(arr2));


    }
}
