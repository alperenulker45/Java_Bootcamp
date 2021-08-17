package Gun38.Ornek3;

public class Firma {
    public static void main(String[] args) {

        Calisan calisan = new Calisan("Mesut", 2500, 2);

        System.out.println("calisan.toString() = " + calisan.toString());
        System.out.println("calisan.maasHesapla() = " + calisan.maasHesapla());

        GenelMudur gm = new GenelMudur("Alperen", 4000, 2, 1000);
        System.out.println("gm.toString() = " + gm.toString());
        System.out.println("gm.maasHesapla() = " + gm.maasHesapla());
    }
}
