package Gun30.DigerErisimler.Protected.Iki;

import Gun30.DigerErisimler.Protected.Bir.Doktor;

public class HastaneIstanbul {
    public static void main(String[] args) {
        //Burasi farkli bir paket bu yuzden ilk paketteki protected kisimlara erisim saglayamiyoruz.

        //Doktor dr=new Doktor();
        //dr.ad bunu goremiyor. cunku o ozellik protected.

        Doktor dr2=new Doktor("Semih");//bunu kullanabiliyoruz cunku public.
    }
}
