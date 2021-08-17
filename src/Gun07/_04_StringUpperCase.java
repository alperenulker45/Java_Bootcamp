package Gun07;

import java.util.Locale;

public class _04_StringUpperCase {
    public static void main(String[] args) {
        // ToUpperCase= Stringin tum harflerini buyuk harfe cevirir.

        String text="Hello World";
        System.out.println("orijinal hali = " + text);
        System.out.println("Buyuk Harfle Yazimi = " + text.toUpperCase());
        System.out.println("Text 'HEL' ile mi basliyor = " + text.toUpperCase().startsWith("HEL"));
        System.out.println("text.toUpperCase().substring(0, 7).charAt() = "
                + text.toUpperCase().substring(0, 7).charAt(6));

    }
}
