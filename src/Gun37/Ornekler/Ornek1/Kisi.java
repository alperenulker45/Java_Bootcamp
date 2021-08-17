package Gun37.Ornekler.Ornek1;

public class Kisi {

    String ad;
    String soyad;
    private int yas;

    //degiskene direkt erisimi kapatip bir metod ile korumali setleme islemine encapsulation denir.

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }

    public int getYas() { //yazdirmak icin
        return yas;
    }

    public void setYas(int yas) { //yas fieldina atama yapmak icin
        this.yas =Math.abs(yas); //mutlak degerini aldik ki kullanici yanlislikla - girse de + ya cevirsin.
    }
}
