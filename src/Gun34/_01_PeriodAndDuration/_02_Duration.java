package Gun34._01_PeriodAndDuration;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _02_Duration {
    //time, DateTime arasindaki fark
    public static void main(String[] args) {
        //time farki

        LocalTime gece = LocalTime.of(0,0);
        LocalTime oglen = LocalTime.of(13, 34, 45, 7);

        Duration fark = Duration.between(gece, oglen);
        System.out.println("fark = " + fark);

        System.out.println("fark.toHours() = " + fark.toHours());//farkin toplam saat hali;
        System.out.println("fark.toMinutes() = " + fark.toMinutes());//farkin toplam dakika hali;
        System.out.println("fark.toSeconds() = " + fark.toSeconds());//farkin toplam saniye hali;

        System.out.println("********************");

        System.out.println("fark.toHoursPart() = " + fark.toHoursPart());//farktaki sadece dakikayi gosterir.
        //toplam dakika degil sadece 1 saat 3 dakika gbi 3 u gosterir.
        System.out.println("fark.toMinutesPart() = " + fark.toMinutesPart());
        System.out.println("fark.toSecondsPart() = " + fark.toSecondsPart());

        System.out.println("****2 Zaman Farki - Date Time****");

        LocalDateTime from = LocalDateTime.of(2020, 10, 4, 10, 20, 55);
        LocalDateTime to = LocalDateTime.of(2020, 10, 10, 10, 21, 1);

        Duration farkZaman = Duration.between(from, to);
        System.out.println("farkZaman.toDays() = " + farkZaman.toDays());

        System.out.println("farkZaman.toDays() = " + farkZaman.toDays());
        System.out.println("farkZaman.toHours() = " + farkZaman.toHours());
        System.out.println("farkZaman.toMinutes() = " + farkZaman.toMinutes());


    }
}
