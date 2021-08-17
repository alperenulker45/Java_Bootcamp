package Gun31.FinalModifier.Ornek1;

public class Ornek {
    // bir Class da sabit bir şekilde
    // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
    // bir dakikadaki saniye sayısını tanımlayınız.
    // mainde verilen saat, dakika ve saniyeyi alarak toplam
    // saniyeyi bulunuz.
    public static void main(String[] args) {
        int day=23;
        int hour=7;
        int minute=25;

        int saniyecinsinden= day*Sabitler.hourInday*Sabitler.minuteInHour*Sabitler.secondInMinute
                +
                hour*Sabitler.minuteInHour*Sabitler.secondInMinute
                +
                minute*Sabitler.secondInMinute;

        System.out.println("saniyecinsinden = " + saniyecinsinden);
    }



}
