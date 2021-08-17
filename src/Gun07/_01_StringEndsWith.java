package Gun07;

public class _01_StringEndsWith {
    public static void main(String[] args) {
        // endswith=.... ile bitiyor mu onu kontrol eder. Sonucu boolean olarak verir.

        String text="Hello World";
        System.out.println("finishes with ld? = " + text.endsWith("ld")); //true
        System.out.println("finishes with rld? = " + text.endsWith("rld"));//true
        System.out.println("finishes with orld? = " + text.endsWith("orld"));//true
        System.out.println("finishes with wo? = " + text.endsWith("wo"));//false
        System.out.println("finishes with lo? = " + text.endsWith("lo"));//false

    }
}
