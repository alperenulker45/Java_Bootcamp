package Gun37.Ornekler.Sorular.Soru1;

public class Ogrenci {

    private int okulNo;
    private String ad;
    private String soyad;
    private int yas;

    private static int ID = 1;

    public Ogrenci(String ad, String soyad, int yas) {
        setOkulNo();
        setAd(ad);
        setSoyad(soyad);
        setYas(yas);
    }

    public int getOkulNo() {
        return okulNo;
    }

    private void setOkulNo() {
        this.okulNo = ID++;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if(yas>15) throw new RuntimeException("Ogrenci Yasi 15'ten buyuk olamaz");
        else this.yas = yas;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "okulNo=" + okulNo +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }
}
