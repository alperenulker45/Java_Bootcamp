package Gun32.Ornek2;

public class Siparis {
    int miktar;
    PizzaSize boyut;

    public Siparis(int miktar, PizzaSize boyut) {
        this.miktar = miktar;
        this.boyut = boyut;
    }

    @Override
    public String toString() {
        return "Siparis{" +
                "miktar=" + miktar +
                ", boyut=" + boyut +
                '}';
    }
}
