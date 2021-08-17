package Gun38.Ornek3;

public class GenelMudur extends Calisan {

    int tazminat;

    public GenelMudur(String isim, int maas, int maasKatSayisi, int tazminat) {
        super(isim, maas, maasKatSayisi);
        this.tazminat=tazminat;
    }

    @Override
    public int maasHesapla() {
        return super.maasHesapla()+tazminat;
    }

    @Override
    public String toString() {
        return super.toString()+"\n" +"tazminat= " + tazminat;
    }
}
