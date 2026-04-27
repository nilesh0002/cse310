package unit4.apir3;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);

        ZonedDateTime zdt1 = ZonedDateTime.of(d, t, ZoneId.of("Europe/London"));
        System.out.println(zdt1);
        

        ZonedDateTime zdt2 = ZonedDateTime.parse("2023-02-20T10:30:00+05:30[Asia/Kolkata]");
        System.out.println(zdt2);

        LocalDate d1 = LocalDate.parse("2023-02-20");
        System.out.println(d1);
        

        System.out.println(d1.plusDays(5));
        System.out.println(d1.plusMonths(2));

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        dt =dt.plusYears(10);
        // System.out.println(dt.minusYears(10));
        System.out.println(dt);

    }
}