package Gun33._01_CreatingAndFormating;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _01_JavaLocalDate {
    public static void main(String[] args) {
        //LocalDate sinifi sadece gun/ay/yil bilgisi tutar.

        LocalDate date = LocalDate.now();//su anki tarihi aldi.

        System.out.println("date.getYear() = " + date.getYear());
        System.out.println("date.getMonth() = " + date.getMonth());
        System.out.println("date.getDayOfMonth() = " + date.getDayOfMonth());
        System.out.println("date.getMonthValue() = " + date.getMonthValue());
        System.out.println("date.getDayOfWeek() = " + date.getDayOfWeek());
        System.out.println("date.getDayOfYear() = " + date.getDayOfYear());

        System.out.println("date = " + date);

        System.out.println("date.format(DateTimeFormatter.ISO_DATE) = " + date.format(DateTimeFormatter.ISO_DATE));
        //uluslararasi tarih gosterim sekli.

        System.out.println("date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)) = " +
                date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));//

        System.out.println("date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)) = " +
                date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));//

        System.out.println("date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)) = " +
                date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));//

        System.out.println("date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)) = " +
                date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));//

        System.out.println("date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)) = " +
                date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.KOREAN)));

        System.out.println("date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)) = " +
                date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.FRANCE)));

        System.out.println("date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)) = " +
                date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.ITALIAN)));

        //yerel tarih/saat almak icin
        Locale[] kullanilabilirLokaller = Locale.getAvailableLocales();

        for (Locale l : kullanilabilirLokaller) {
            if (l.getDisplayCountry().toLowerCase().contains("ice"))
                System.out.println("l.getDisplayCountry() = " + l.getDisplayCountry() + l);
            //burda cikan is_IS izlandanin dil-ulke ulusararsi kodu veriyor.

        }

        Locale localIzlanda = new Locale("is","IS");

        System.out.println("date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)) = " +
                date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(localIzlanda)));


        Locale localTurkey = new Locale("tr","TR");

        System.out.println("date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)) = " +
                date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(localTurkey)));

        //is: dil  IS :ülke
        //Uluslararası ülke ve diller
        //bu şekilde kodlanmış
        //en EN -> normal ing.
        //en UK
        //en US
        //tr TR
        //fr CD
        //en CD

        //Kendi istedigin tarihi girerek tarih olusturma.

        LocalDate date1 = LocalDate.of(2020, 03, 29);
        System.out.println("date1 = " + date1);

        LocalDate date2 = LocalDate.of(2020, Month.DECEMBER, 23);
        System.out.println("date2 = " + date2);

        //tarihi istedigin formatta yazma
        DateTimeFormatter ozelformat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("date1.format(ozelformat) = " + date1.format(ozelformat));

        DateTimeFormatter ozelFormat=DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("tarih1 özel format= " + date.format(ozelFormat));

        DateTimeFormatter ozelFormat2=DateTimeFormatter.ofPattern("E d.M.yy");
        System.out.println("tarih1 özel format2= " + date2.format(ozelFormat2));
    }
}