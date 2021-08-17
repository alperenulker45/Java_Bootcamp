package Gun29._03_Constructor;

public class Banka {

    String name;
    int kurulus;
    int subeSayi;

    public Banka(String name, int kurulus, int subeSayi) {
        this.name = name;
        this.kurulus = kurulus;
        this.subeSayi = subeSayi;
    }

    public Banka(String name, int kurulus) {
        this.name = name;
        this.kurulus = kurulus;
    }

    public Banka(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Banka{" +
                "name='" + name + '\'' +
                ", kurulus=" + kurulus +
                ", subeSayi=" + subeSayi +
                '}';
    }
}
