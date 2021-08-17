package Gun38.Ornek3;

public class Calisan {

    String isim;
    int maas;
    int maasKatSayisi;

    public Calisan(String isim, int maas, int maasKatSayisi) {
        this.isim = isim;
        this.maas = maas;
        this.maasKatSayisi = maasKatSayisi;
    }

    public int maasHesapla() {
        return this.maas=maas*maasKatSayisi;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "isim='" + isim + '\'' +
                ", maas=" + maas +
                ", maasKatSayisi=" + maasKatSayisi +
                '}';
    }


}
