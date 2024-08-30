import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class dateFormate {
    public static void main(String[] args) {
       LocalDate localDate = LocalDate.now();
        System.out.println("localDate: "+ LocalDate.now());
        System.out.println("localTime: "+LocalTime.now());
        System.out.println("localDateTime: "+LocalDateTime.now());
        LocalDate minusDate = localDate.minusDays(2);
        System.out.println("minusDate: "+minusDate);
        LocalDate plusDate = localDate.plusDays(3);
        System.out.println("plusDate: "+plusDate);
        LocalDate lcldate = LocalDate.of(2016,04,22);
        System.out.println("lcldate: "+lcldate);
        System.out.println("lcldate.isLeapYear(): "+lcldate.isLeapYear());

    }
}
