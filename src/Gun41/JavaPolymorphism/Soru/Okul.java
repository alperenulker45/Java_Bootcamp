package Gun41.JavaPolymorphism.Soru;

public class Okul {

    private String ad;
    private String soyad;
    private String gorev;

    public Okul(String ad, String soyad, String gorev) {
        this.ad = ad;
        this.soyad = soyad;
        this.gorev = gorev;
    }
    public static void kimlikYaz (Okul kisi) {
        System.out.println(kisi.ad);
        System.out.println(kisi.soyad);
        System.out.println(kisi.gorev);

        if (kisi instanceof Ogrenci) {
            System.out.println("Sube : " + ((Ogrenci) kisi).getSube());
        }

        if (kisi instanceof Calisan) {
            System.out.println("Departman : " + ((Calisan) kisi).getDepartman());
        }
    }

}
