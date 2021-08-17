package Gun28._01_Soru;

import java.util.ArrayList;

public class Ogrenci {

    String isim;
    int maxCredit;
    ArrayList<Ders> dersleri=new ArrayList<>();

    public static Ogrenci ogrenciOlustur (String isim, int maxCredit)
    {
        Ogrenci ogr=new Ogrenci();
        ogr.isim=isim;
        ogr.maxCredit=maxCredit;

        return ogr;
    }

    public static void dersEkle (ArrayList<Ders> dersleri, Ders ders, int maxCredit)
    {
        if (gettoplamCredit(dersleri)+ders.dersCredit <= maxCredit)
        {
            dersleri.add(ders);
        }
        else System.out.println(ders.dersAdi + " " + "eklenemedi" + ". " + "kredi siniri asildi");
    }

    public static int gettoplamCredit (ArrayList<Ders> dersleri)
    {
        int toplam=0;
        for (Ders d: dersleri)
        {
            toplam+=d.dersCredit;
        }

        return toplam;
    }

    public static void dersYazdir (ArrayList<Ders> dersleri)
    {
        System.out.println("*******Alinan Dersler*******");
        for (Ders d: dersleri)
        {
            System.out.println(d.dersAdi + " " + "eklendi" + " " + d.dersCredit);
        }
    }
}


