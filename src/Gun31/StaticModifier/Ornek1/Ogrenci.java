package Gun31.StaticModifier.Ornek1;

public class Ogrenci {

    String ad;
    String soyad;
    static String okulAd= "Yildirim Lisesi"; //tum ogrenciler ayni okulda olduklari icin bunu classa tanimliyoruz her ogrencide
    //tekrar kullanmamak icin


    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;

    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", okulAd='" + okulAd + '\'' +
                '}';
    }
}
