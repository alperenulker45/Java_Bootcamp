package Gun41.JavaPolymorphism.Soru;

public class OkulMain {
    public static void main(String[] args) {

       Ogrenci ogrenci = new Ogrenci("furkan", "simsek", "baskan yrd.", "8-a");
        Calisan calisan = new Calisan("Ragip", "Bey", "CEO", "Pazarlama");

       // Okul ogrenci = new Ogrenci("furkan", "simsek", "baskan yrd.", "8-a");
       // Okul calisan = new Calisan("Ragip", "Bey", "CEO", "Pazarlama");

        //Yukaridaki de olur.

        Okul.kimlikYaz(ogrenci);
        Okul.kimlikYaz(calisan);

    }
}
