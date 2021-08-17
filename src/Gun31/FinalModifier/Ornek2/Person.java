package Gun31.FinalModifier.Ornek2;

public class Person {

    String isim;
    final int tcNo;
    static int sayac=0;

    public Person(String isim) {
        this.isim = isim;
        this.tcNo = ++sayac;
    }

    @Override
    public String toString() {
        return "Person{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}
