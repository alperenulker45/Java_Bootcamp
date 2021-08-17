package Gun07;

public class _07_StringReplaceAll {
    public static void main(String[] args) {
        //ReplaceAll= replace gibi calisir. farkli olarak kriter (regex) verilebilir.
        //regex=regular expression, duzenli ifade.

        String text="Hello World";
        System.out.println("e,l,o degistir = " + text.replaceAll("[e,l,o]", "_"));
        //e, l ve o karakterlerini bul _ ile degistir.

        System.out.println("Buyuk Harf degistir =" + text.replaceAll("[A-Z]", "_"));
        //buyuk harfleri bulup _ ile degistirir. [a-z] yaparsak kucuk harfleri degistirir.
        //bunun gibi farkli regex komutlar da var.




    }
}
