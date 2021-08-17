package Gun26._03_Ornek;

public class ElektrikHesabi {
    int toplamtuketim;
    double rate=0.7;
    double bill;

    public void tuketimEkle(int ayliktuketim)
    {
        toplamtuketim=toplamtuketim+ayliktuketim;
    }

    public double odenecekRakam()
    {
        bill=(rate*toplamtuketim);
        return bill;
    }

}
