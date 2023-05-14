package AdvanceJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class method/* implements Comparable<method>*/{
    int num;
    String str;

    public method(int num,String str){
        this.num = num;
        this.str = str;
    }

   /* @Override
    public int compareTo(method mm) {
        if(mm.num == mm.num)
            return 0;
        else if (mm.num > mm.num)
            return 1;
        else
            return -1;
    }
    public String toString(){
        return "method [age = "+num+", str = "+str+" ]";
    }*/
}
public class comparablemethod {
    public static void main(String[] args) {
       //Normal list and sort
       /* ArrayList<Integer> ll = new ArrayList<Integer>();
        ll.add(5);
        ll.add(9);
        ll.add(7);
        System.out.println("ll1: "+ll);
        Collections.sort(ll);
        System.out.println("ll2: "+ll);*/

        // without lambda sort
       /*Comparator<Integer> com = new Comparator<Integer>() {
           @Override
           public int compare(Integer o1, Integer o2) {
               if(o1 > o2)
               return 1;
               else
                   return -1;
           }
       };
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(23);
        al.add(22);
        al.add(34);
        System.out.println("al1: "+al);
        Collections.sort(al,com);
        System.out.println("al2: "+al);*/

        List<method> al = new ArrayList<>();
        al.add(new method(23,"madhu"));
        al.add(new method(28,"Ravi"));
        al.add(new method(25,"karthi"));
        al.add(new method(45,"sankar"));
        System.out.println("Before: ");
        for (method ob: al)
        System.out.println(ob.num +" "+ob.str);
        System.out.println("After: ");
        //sort without Lambda
      /*  Collections.sort(al, new Comparator<method>() {
            @Override
            public int compare(method o1, method o2) {
                return o1.num - o2.num;
            }
        });
        for (method ob: al)
            System.out.println(ob.num +" "+ob.str);*/

        //sort with lambda
        al.sort((method m1,method m2)-> m1.num - m2.num);
        al.forEach(method -> System.out.println(al));
    }
}
