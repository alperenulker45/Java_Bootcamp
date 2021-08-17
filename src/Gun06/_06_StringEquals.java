package Gun06;

public class _06_StringEquals {
    public static void main(String[] args) {
        // 2 stringin birbirine esit olup olamdigini kontrol eder.
        // sonuc boolean olarak doner.

        String s1="Merhaba";
        String s2= "MERHABA";

        System.out.println("s1.equals(s2) = " + s1.equals(s2)); // esit mi?//
        System.out.println("s1.equals(Merhaba) = " + s1.equals("Merhaba"));//seklinde de olabilir.
    }
}
