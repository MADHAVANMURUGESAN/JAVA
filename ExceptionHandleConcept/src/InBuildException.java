public class InBuildException {
    public static void main(String[] args) {
        try {
            int a = 1;
            int b = 0;
            int[] inta = {1, 2, 3};
            String str = null;
            //System.out.println("inta[8]: " + inta[8]);
            //System.out.println("str.chartAt(8): " + str.charAt(8));
          //  int num = Integer.parseInt ("akki") ;
            if (a / b == 0) {
                System.out.println("successfully...");
            }

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e + "\n" + "e.getMessage(): " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e + "\n" + "e.getMessage(): " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e + "\n" + "e.getMessage(): " + e.getMessage());
        }
    }
}
