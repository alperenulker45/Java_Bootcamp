package Gun37.Ornekler.Ornek2;

public class ArabaMain {
    public static void main(String[] args) {

        Araba araba = new Araba();

        araba.setModel ("bmw");
        araba.setRenk ("kirmizi");
        araba.setMotor (1.6);
        araba.setKapisSayisi(9);

        System.out.println("araba = " + araba);

        Araba araba2 = new Araba("merso", "beyaz", 3.0, 5);
        System.out.println("araba2 = " + araba2);
    }
}
