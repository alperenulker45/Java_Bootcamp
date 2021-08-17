package Gun38.Ornek4;

public class Otobus extends Arac{

    int yolcuSayisi;

    public Otobus(String renk, double motor, String model, int yolcuSayisi) {
        super(renk, motor, model);
        this.yolcuSayisi=yolcuSayisi;
    }

    @Override
    public String toString() {
        return super.toString() + "Yolcu Sayisi = " + yolcuSayisi;
    }
}
