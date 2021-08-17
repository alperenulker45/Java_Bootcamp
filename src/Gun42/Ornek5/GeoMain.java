package Gun42.Ornek5;

public class GeoMain {
    public static void main(String[] args) {

        Cember c = new Cember();
        System.out.println("c.alan(3) = " + c.alan(3));
        System.out.println("c.cevre(3) = " + c.cevre(3));

        Dikdortgen d = new Dikdortgen();
        System.out.println("d.alan(3,4) = " + d.alan(3, 4));
        System.out.println("d.cevre(3,4) = " + d.cevre(3, 4));

        Kare k = new Kare();
        System.out.println("k.alan(4) = " + k.alan(4));
        System.out.println("k.cevre(4) = " + k.cevre(4));

    }
}
