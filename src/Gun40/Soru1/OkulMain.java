package Gun40.Soru1;

import java.util.ArrayList;

public class OkulMain {
    public static void main(String[] args) {

        ArrayList<Ogrenci> lise = new ArrayList<>();
        ArrayList<Ogrenci> ilk = new ArrayList<>();

        Ogrenci lise1 = new Ogrenci("Ali", "lise");
        Ogrenci lise2= new Ogrenci("Alper", "lise");
        Ogrenci ilk1 = new Ogrenci("Ahmet", "ilk");

        lise.add(lise1);
        lise.add(lise2);

        ilk.add(ilk1);

        System.out.println(lise);
        System.out.println(ilk);

        liseOgr ogr1= new liseOgr("Necdet", "Lise");
        ilkOgr ogr2 = new ilkOgr("Veli", "ilk");

        System.out.println(ogr1);
        System.out.println(ogr2);

    }
}
