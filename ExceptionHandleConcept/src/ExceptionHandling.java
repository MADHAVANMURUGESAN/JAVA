public class ExceptionHandling {
    // pre defined exception
    public static void main(String[] args) {
        try{
            int value = 10;
            //System.out.println(value/0); // without try compiler will terminate here
            checkException(17);
        }catch (Exception e){
            System.out.println(" Ex :: "+ e);
            System.out.println(" Ex :: "+ e.getMessage());
        } finally {
            System.out.println(" we have error but it not terminated here");
        }

    }
    private static String checkException(int inAge){
        if (inAge < 18){
            throw new ArithmeticException("Age is not valid");
        }
        return "works";
    }
}

class UserDefinedException extends Exception{
    String msg;
UserDefinedException(String inMsg){
   //setMsg(inMsg);
    super(inMsg);
}
    private void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
class Test{
    private static void checkError(int inAge) throws UserDefinedException{

        if (inAge > 10){
            throw new UserDefinedException("Madhavan rocking");
        }else {
            System.out.println("valid age");
        }

    }
    public static void main(String[] args) {
        try {
            checkError(20);
        }catch (UserDefinedException ex){
            System.out.println("error :: "+ ex.getMessage());
            System.out.println("error :: "+ ex);
        }
    }
}

