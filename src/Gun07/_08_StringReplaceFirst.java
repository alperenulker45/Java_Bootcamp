package Gun07;

public class _08_StringReplaceFirst {
    public static void main(String[] args) {
        //ReplaceFirst = replace ile ayni komuttur. Sadece ilk bulunan karakter(leri) degistirir.

        String text="Hello World";
        System.out.println("Orijinal = " + text);
        System.out.println("ilk o --> e = " + text.replaceFirst("o", "e"));
        //sadece ilk buldugu o karakterini degistirir, normal replace tum karakterleri degistirirdi.

    }
}
