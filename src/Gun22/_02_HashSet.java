package Gun22;

import java.util.HashSet;
import java.util.Iterator;

public class _02_HashSet {
    public static void main(String[] args) {

        HashSet <String> renkler= new HashSet<>();
        renkler.add("Red");
        renkler.add("Blue");
        renkler.add("reD");
        renkler.add("Green");
        renkler.add("Red");

        //1. Yontem ekrana yazdirma

        System.out.println("renkler = " + renkler);

        //2. yontem for each yontemi;

        for (String s: renkler) // s yerine bu ornekte renkler de denilebilir
        {
            System.out.println("renk = " + s);
        }

        //3. yontem - gosterge/isaret (iterator) yontemi ile

        Iterator gosterge= renkler.iterator();//renkler isimli hashsetin basina gosterge koyduk.
        while (gosterge.hasNext())//gostergenin sonraki elemani var ise;
        {
            //System.out.println("Sonraki Eleman= " + gosterge.next());
            System.out.println("Sonraki Eleman = " + gosterge.next());
            if (gosterge.next()=="Blue")
                gosterge.remove();//o anda gosterdigi elemani siler.
        }

        renkler.remove("Red");//bir elemani siler. red silindi.
        System.out.println("Red remove sonrasi = " + renkler);

        renkler.clear(); // Seti temizler
        System.out.println("renkler = " + renkler); // tum set temizlendikten sonra

    }
}
