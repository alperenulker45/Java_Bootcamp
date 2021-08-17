package Gun33._01_CreatingAndFormating;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Set;

public class _04_ZonedDateTime {
    public static void main(String[] args) {
        //Baska zaman bolgesinin saat dilimlerini alma

        ZonedDateTime zdtLocal = ZonedDateTime.now();//Local date/time alir.



        //Zonelari sistemden nasil alacagiz?

        Set<String> zamanBolgeleri = ZoneId.getAvailableZoneIds();
            for (String z: zamanBolgeleri) 
            {
                if(z.toLowerCase().contains("honol"))//bulmak istedigimiz zone'u bu sekilde bulabiliriz.
                System.out.println("z = " + z);
            }
            //Istedigim Zone buldum

        //ZonedDateTime zdt= ZonedDateTime.now(ZoneId.of("DateTime Zone adi yazilacak"));
        ZonedDateTime zdt= ZonedDateTime.now(ZoneId.of("Pacific/Honolulu"));
        System.out.println("zdt = " + zdt);

        DateTimeFormatter gosterimSablonu = DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy HH:mm");
        System.out.println("zdt.format(gosterimSablonu) = " + zdt.format(gosterimSablonu));

    }
}
