package Gun41.JavaPolymorphism.Anlatim;

import java.util.HashSet;
import java.util.Set;

public class CiftlikMain {
    public static void main(String[] args) {
        Kopek kopek = new Kopek("karabas");
        Kedi kedi = new Kedi("kopuk");

        kopek.ses();
        kedi.ses();

        kopek.kokladi();

        HashSet hs = new HashSet();
        Set hs1 = new HashSet();

        //Hashset --> Nesne Tipi
        //Set --> Class Tipi ..
        //Set hs1 = new HashSet(); --> burada Set clasiindan bir hashset tanimliyoruz.

        Hayvan kopek2 = new Kopek("kurt");//Hayvan classindan bir kopek nesnesi tanimladik.
        Hayvan kedi2 = new Kedi("Pamuk");//Hayvan classindan bir kedi nesnesi tanimladik.

        Hayvan.HayvanSesi(kopek2);// Hayvan sinifinda tek bir metod yaparak hem kedi hem kopek
        Hayvan.HayvanSesi(kedi2);// icin kullandik tek metodu.. buna polymorphism denir.

        //bunu yapabilmek icin nesneler ayni classtan olusturulmali ve ayni override methodlara sahip olmalilar.

    }
}
