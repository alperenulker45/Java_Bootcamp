package SubatAyinSorulari;

public class _01_ {
    public static void main(String[] args) {
        //1- Bizim 3 saatimiz vardır.Birinci saatimiz tam doğru çalışmaktadır,
        // ikincisi her 1 saatte  20 dakika geç kalmaktadır.
        // Üçincüsü ise her 1 saatte 15 dakika ileri gitmektedir.
        // Her üçüde saat 3 de çalıştırılmaya başlandığında,
        // kaç saat sonra aynı saati gösterirler.Bu programı yazınız.

        int frstclck=60;
        int scndclck=40;
        int thrdclck=75;
        int smallest= Math.min(frstclck, Math.min(scndclck, thrdclck));
        int ebob=1;
        int ekok;
        for (int i=1; i<=smallest; i++) 
        {
            if (frstclck%i==0 && scndclck%i==0 && thrdclck%i==0)
                ebob=i;
        }
        
        ekok= (frstclck*scndclck*thrdclck)/ebob;
        int hours=ekok/60;
        System.out.println("Clocks come together after" + " " + hours + " "+ "hours");

        int hour= 3 + (hours%12);
        int minute= hours%60;

        System.out.println("Clock shows" + " " + hour + ":" + minute + " when all clocks come together");
    }
}
