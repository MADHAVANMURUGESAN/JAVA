package AdvanceJava;

@FunctionalInterface
interface a {
    //void show();
    //void show(int i, int j);
    int show(int i,int j);
}

/*class samp implements a {   //method1
    public void show() {
        System.out.println("show method...");
    }
}*/

public class functionInterface {
    public static void main(String[] args) {
        /*a ob = new samp();  //method1
        ob.show();*/
        /*--------------------*/

        /*a obj=new a(){        //method2

            @Override
            public void show() {
                System.out.println("show...");
            }
        };
        obj.show();*/
        /*--------------------*/

        //lambda expression in java
       /* a obj = () -> {              //method3
            System.out.println("show...");
        };
        obj.show();*/
        /*--------------------*/

       /* a obj =(i,j)-> {
            System.out.println(i+j);
        };
        obj.show(3,5);*/
        /*--------------------*/

        a obj =(i,j)-> i+j;
        System.out.println(obj.show(10,17));
    }

}
