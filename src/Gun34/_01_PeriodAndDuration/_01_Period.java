package Gun34._01_PeriodAndDuration;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class _01_Period {
    public static void main(String[] args) {
        //Period 2 Tarih arasindaki gecen zamani yil ay gun olarak verir.
        //DateTime icin kullanilir. Kendisi ayrica belli bir zaman araligini da tutabilir.

        LocalDate dtDogumGunu= LocalDate.of(1989, 4,24);
        LocalDate bugun = LocalDate.now();

        Period fark = Period.between(dtDogumGunu, bugun);
        System.out.println("fark = " + fark);

        LocalDate rndogumgunu = LocalDate.of(1990,8, 8);

        Period farkRn= Period.between(rndogumgunu, bugun);
        System.out.println("farkRn = " + farkRn);

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println(fark.getYears() + " Yil, " + fark.getMonths() + " ay, " + fark.getDays() + " gun " );

        //********

        Period period3gun = Period.ofDays(3); // 3 gunluk sureyi temsil eder.
        Period ceyrekyil = Period.ofMonths(3); // 3 aylik sureyi temsil eder.

        LocalDate ucgunsonra= bugun.plus(period3gun);//bugune 3 gun eklendi.
        LocalDate ucAySonra = bugun.plus(ceyrekyil);//bugune 3 ay eklendi
        LocalDate bugunTekrar = ucAySonra.minus(ceyrekyil);// tekrar 3 ay cikarildi.

        //Ornek - kursun sureleri

        LocalDate kursBaslangic = LocalDate.of(2021, 2, 1);
        Period kursSure = Period.ofMonths(8);
        LocalDate kursBitis = kursBaslangic.plus(kursSure);
        System.out.println("kursBitis.format(DateTimeFormatter.ISO_DATE) ="+kursBitis.format(DateTimeFormatter.ISO_DATE));
        System.out.println("kursBitis.getDayOfWeek() = " + kursBitis.getDayOfWeek());


    }
}
