package Gun19;

public class _03_JavaMethod {
    public static void main(String[] args) {
        //method overloading

        int s1=4;
        int s2=5;
        int s3=6;

        int sonuc1= toplam(s1, s2);
        int sonuc2=toplam(s1, s2, s3);

        String ad="Alperen";
        String soyad="Ulker";
        String tamAd=toplam(ad, soyad);
        kullaniciBilgiYaz("Alperen Ulker", 31);


        //metodlara ayni isimleri verebiliriz. yeterki parametre sayilari ve tipleri farkli olsun.
        //asagida toplam isimli 3 method girdik. birincisi int tipi 2 parametreli, ikincisi int tipi
        //3 parametreli ucuncusu String tipi. Java hangi islem icin hangi methodu kullanacagini
        //parametre sayisindan ve veri tipinden ayirt edebilir.

    }

    public static int toplam(int s1, int s2)
    {
        return s1+s2;
    }

    public static int toplam(int s1, int s2, int s3)
    {
        return s1+s2+s3;
    }

    public static String toplam(String ad, String soyad)
    {
        return ad+soyad;
    }

    public static String kullaniciBilgiYaz(String ad, int yas)
    {
        System.out.println(ad+ " " +yas);
        return ad+" "+yas;
    }
}
