package Gun28._01_Soru;

public class Universite {

    public static void main(String[] args) {


        Ders ders1 = Ders.dersOlustur("Java101", 4);
        Ders ders2 = Ders.dersOlustur("Fiz101", 5);
        Ders ders3 = Ders.dersOlustur("Kim101", 3);

        Ogrenci ogrenci1 = Ogrenci.ogrenciOlustur("Alperen", 10);

        Ogrenci.dersEkle(ogrenci1.dersleri, ders1, ogrenci1.maxCredit);
        Ogrenci.dersEkle(ogrenci1.dersleri, ders2, ogrenci1.maxCredit);
        Ogrenci.dersEkle(ogrenci1.dersleri, ders3, ogrenci1.maxCredit);

        Ogrenci.dersYazdir(ogrenci1.dersleri);

    }

}
