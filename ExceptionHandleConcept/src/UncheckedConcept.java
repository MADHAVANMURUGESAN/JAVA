public class UncheckedConcept {
    public static void main(String[] args) {
        try {
            System.out.println("Unchecked Exception...");
           /* if (1 / 0 == 0) {
                throw new IllegalStateException("This is IllegalStateException");
            }*/
        } catch (IllegalStateException e) {
            System.out.println("e: " + e);
            System.out.println("e.getMessage(): " + e.getMessage());
        } catch (Exception e) {
            System.out.println("e: " + e);
            System.out.println("e.getMessage(): " + e.getMessage());
        } finally {
            System.out.println("I am final block...");
        }
    }
}
