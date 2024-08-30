public class UserDefineException extends Exception {
    public static int[] account_Number = {100, 101, 102, 105};
    public static String[] account_Name = {"madhavan", "vijayasri", "suriyak", "kamalhasan"};
    public static int[] account_Amount = {1000, 101, 1002, 998};

    public UserDefineException(String s) {
        super(s);
    }

   /* public UserDefineException(){

    }*/

    public static void main(String[] args) {
        System.out.println("ACCOUNT" + "\t\t" + "NAME" + "\t" + "AMOUNT");
        try {
            for (int i = 0; i < account_Number.length; i++) {
                System.out.println(account_Number[i] + "\t\t" + account_Name[i] + "\t" + account_Amount[i]);
                if (account_Amount[i] < 1000) {
                   /* UserDefineException exceptionConcept = new UserDefineException("Balance less than 1000");
                    throw exceptionConcept;*/
                    throw new UserDefineException("Balance less than 1000");

                }
            }
        } catch (UserDefineException e) {
            System.out.println("e: " + e.getMessage());
        }
    }
}
