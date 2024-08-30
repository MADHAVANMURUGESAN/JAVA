class statics{
    String str1 = null;
    static int num ;
   // String str2 = null;
public  void message(){
    System.out.println("str1: "+str1+"  "+"num: "+num);
}
}
public class StaticVariable {
    public static void main(String[] args) {
        statics obj1 = new statics();
        obj1.num=1;
        obj1.str1="Java";
        obj1.message();
        statics obj2 = new statics();
        obj2.num=1;
        obj2.str1="Python";
        statics.num = 3;
        obj2.num=1;
        obj1.message();
        obj2.message();
    }
}
