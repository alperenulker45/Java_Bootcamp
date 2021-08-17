package Gun37.Ornekler.Sorular.Soru1;

import java.util.ArrayList;

public class Okul {

    private String okulAdi;
    private int maxOgrenciSayisi;
    private ArrayList<Ogrenci> ogrenciler = new ArrayList<>();

    public Okul(String okulAdi, int maxOgrenciSayisi) {
        setOkulAdi(okulAdi);
        setMaxOgrenciSayisi(maxOgrenciSayisi);
    }

    public String getOkulAdi() {
        return okulAdi;
    }

    public void setOkulAdi(String okulAdi) {
        this.okulAdi = okulAdi;
    }

    public int getMaxOgrenciSayisi() {
        return maxOgrenciSayisi;
    }

    public void setMaxOgrenciSayisi(int maxOgrenciSayisi) {
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }

    public ArrayList<Ogrenci> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(ArrayList<Ogrenci> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }

    @Override
    public String toString() {
        return "Okul{" +
                "okulAdi='" + okulAdi + '\'' +
                ", maxOgrenciSayisi=" + maxOgrenciSayisi +
                ", ogrenciler=" + ogrenciler +
                '}';
    }
}
