import java.text.DateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class dateFormate {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate: " + LocalDate.now());
        System.out.println("localTime: " + LocalTime.now());
        System.out.println("localDateTime: " + LocalDateTime.now());

        LocalDate today = LocalDate.now();
        LocalDate specificDate = LocalDate.of(2023, 12, 1);
        System.out.println("Today: " + today);
        System.out.println("Specific Date: " + specificDate);
        // Period example
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 1, 1);
        Period period = Period.between(startDate, endDate);
        System.out.println("Period: " + period);
        // Duration example
        LocalTime startTime = LocalTime.of(10, 0);
        LocalTime endTime = LocalTime.of(12, 30);
        Duration duration = Duration.between(startTime, endTime);
        System.out.println("Duration: " + duration);

        LocalDate minusDate = localDate.minusDays(2);
        System.out.println("minusDate: " + minusDate);
        LocalDate plusDate = localDate.plusDays(3);
        System.out.println("plusDate: " + plusDate);

        LocalDate lcldate = LocalDate.of(2016, 04, 22);
        System.out.println("lcldate: " + lcldate);
        System.out.println("lcldate.isLeapYear(): " + lcldate.isLeapYear());

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-YYYY-MM HH:mm:ss");
        System.out.println("datetimeformatter : " + LocalDateTime.now().format(dateTimeFormatter));


    }
}
