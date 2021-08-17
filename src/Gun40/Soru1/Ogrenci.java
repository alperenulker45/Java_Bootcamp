package Gun40.Soru1;

public class Ogrenci {

    private String isim;
    private String tipi;
    private String id;

    private static int idmaker=0;

    public Ogrenci(String isim, String tipi) {
        this.isim = isim;
        this.tipi = tipi;
        this.id = String.valueOf(idmaker++);
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "isim='" + isim + '\'' +
                ", tipi='" + tipi + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
