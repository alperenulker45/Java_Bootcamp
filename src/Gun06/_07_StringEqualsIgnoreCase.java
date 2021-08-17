package Gun06;

public class _07_StringEqualsIgnoreCase {
    public static void main(String[] args) {
        //Burada stringleri esitlerken buyuk kucuk harf hassasiyetini dikkate almiyor.

        String s1= "Merhaba";
        String s2= "MERHABA";

        System.out.println("s1.equalsIgnoreCase(s2) = " + s1.equalsIgnoreCase(s2));
        System.out.println("s1.equals() = " + s1.equalsIgnoreCase("MerHaba"));
    }
}
