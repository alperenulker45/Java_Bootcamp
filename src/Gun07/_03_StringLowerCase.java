package Gun07;

import java.util.Locale;

public class _03_StringLowerCase {
    public static void main(String[] args) {
        // ToLowerCase= Stringin tamamini kucuk harfe cevirir.

        String text= "Hello World";
        System.out.println("orijinal hali = " + text);
        System.out.println("kucuk harfle yaz = " + text.toLowerCase());
        System.out.println("text buyuk kucuk harf dikkat etmeden 'he' ile mi basliyor = "
                + text.toLowerCase().startsWith("he"));
        //once kucuk harfe cevirip sonra nasil basladigina bakabiliriz.
        //yani iki ve daha fazla kodu ic ice kullanabiliriz.

    }
}
