import java.util.Calendar;

public class CalenderApi {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar: " + calendar.getTime());
        System.out.println("calendar.get(Calendar.MONTH): " + calendar.get(Calendar.MONTH));
        System.out.println("calendar.get(Calendar.DAY_OF_MONTH): " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("calendar.get(Calendar.YEAR): " + calendar.get(Calendar.YEAR));
        calendar.set(Calendar.YEAR, 1997);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        System.out.println(calendar.getTime());
    }
}
