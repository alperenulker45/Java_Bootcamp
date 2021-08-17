package Gun07;

public class _06_StringReplace {
    public static void main(String[] args) {
        //replace komutu= string icindeki istenen karakter(leri)
        // verilen yeni ifade ile degistirir.

        String text="Hello World";
        System.out.println("orijinal hali = " + text);
        System.out.println("Replace edilmis hali = " + text.replace("World", "Earth"));
        System.out.println("o harfini a ya cevir = " + text.replace("o","a"));
        //string icindeki tum "o" karakterlerini degistirir.

        //replace komutunu silme icinde kullanabiliriz. ornek;
        System.out.println("World silinmis hali = " + text.replace("World", ""));

    }
}
