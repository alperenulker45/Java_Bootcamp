package Gun38.Ornek1;

//Erisim izni oldugu surece SuperClassin tum field ve methodlarini alir.
public class Yonetici extends Personel{
/*
    String ad;
    String soyad;
    int yas;
    double maas;
    String departman;
    int SicilNo;

    public double getMaas() {
        return maas;
    }

    public void ZamYap (int yuzde) {
        //islemler...
        System.out.println(yuzde + " oraninda zam yapildi");
    }*/
    //bu sekilde ugrasmak yerine personel sinifindan todo extends ile cagirabiliriz. tum field ve methodlari alir
    //uzerine ilave yapabiliriz. ozellikleri aldigimiz classa base class, ya da super class denir.
    //diger sinifa ise sub class denir.

    public void ZamYap (int yuzde) {
        //islemler...
        System.out.println(yuzde + " oraninda zam yapildi");
    }
}
