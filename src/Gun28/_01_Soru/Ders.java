package Gun28._01_Soru;

public class Ders {

    String dersAdi;
    int dersCredit;

    public static Ders dersOlustur (String dersAdi, int dersCredit)
    {
        Ders ders=new Ders();
        ders.dersAdi=dersAdi;
        ders.dersCredit=dersCredit;

        return ders;
    }
}
