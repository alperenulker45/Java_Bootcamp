package Gun41.JavaPolymorphism.Soru;

public class Ogrenci extends Okul{
    private String sube;

    public Ogrenci(String ad, String soyad, String gorev, String sube) {
        super(ad, soyad, gorev);
        this.sube=sube;
    }

    public String getSube() {
        return sube;
    }

    public void setSube(String sube) {
        this.sube = sube;
    }
}
