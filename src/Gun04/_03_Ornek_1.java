package Gun04;

public class _03_Ornek_1 {
    public static void main(String[] args) {
        // 3 farkli tipte (char, int, boolean degisken atayip deger tanimlayiniz ve ekrana yazdiriniz.

        char karakter='w';
        int deger= 78;
        boolean evetmi= true;

        System.out.println(karakter);
        System.out.println(deger);
        System.out.println(evetmi);

        /* char tanimlarken verdigimiz harfi aslinda sayisal karakterle saklar. bunun belirli bir tablosu vardir.
        ornegin char ilkharf=65 yazarsak bunu yazdirdigimda A harfini yazdirir.
         */

        char ilkHarf='A';
        System.out.println(ilkHarf); // bunu yazdirdigimizda A harfini yazdiracak

        char sonHarf=37;
        System.out.println(sonHarf); // bunu yazdirdigimizda % isareti cikar.

        //char ilkHarf=A dedik buna +32 yaparsak kucuk a harfini verir.

        //char kucukharf= ilkHarf + 32; //-> burada integer olarak tanimlama yapar ve 97 yazdirir.
        // bu yuzden bunun char oldugunu belirtmemiz gerekir. kucukharf= (char)(ilkHarf+32)

        char kucukHarf= (char) (ilkHarf+32);
        System.out.println(kucukHarf);









    }
}
