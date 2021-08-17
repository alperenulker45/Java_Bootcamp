package Gun07;

public class _02_StringStartWith {
    public static void main(String[] args) {
        //startwith=.... ile baslayip baslamadigini kontrol eder. Sonucu boolean olarak verir.

        String text="Hello World";
        System.out.println("Starts with H? = " + text.startsWith("H")); //true
        System.out.println("Starts with h? = " + text.startsWith("h")); //false
        System.out.println("Starts with Hel? = " + text.startsWith("Hel"));//true
        System.out.println("Starts with HEL? = " + text.startsWith("HEL"));//false
        System.out.println("Starts with Hell? = " + text.startsWith("Hell"));//true
        System.out.println("Starts with Hello W? = " + text.startsWith("Hello W"));//true



    }
}
