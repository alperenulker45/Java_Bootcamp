package Gun41.JavaPolymorphism.Soru;

public class Calisan extends Okul{

    private String departman;

    public Calisan(String ad, String soyad, String gorev, String departman) {
        super(ad, soyad, gorev);
        this.departman=departman;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
}
