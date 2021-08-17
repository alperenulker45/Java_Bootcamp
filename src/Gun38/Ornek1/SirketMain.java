package Gun38.Ornek1;

public class SirketMain {
    public static void main(String[] args) {
        Yonetici mudur = new Yonetici();
        mudur.maas = 3000;
        mudur.departman="Destek Birimi";

        System.out.println(mudur.getMaas());
        mudur.ZamYap(20);

        Personel guvenlik = new Personel();
        guvenlik.maas=1500;
        System.out.println(guvenlik.getMaas());
    }
}
