package Gun06;

public class _02_StringCharAt {
    public static void main(String[] args) {
        //istenen noktadaki karakteri verir.
        //karakterlerin sirasi sifirdan (0) baslar. buna index denir.

        String kelime="Merhaba dunya";

        System.out.println("3. harf =" + kelime.charAt(2));

        char ilkHarf=kelime.charAt(0);
        System.out.println("ilkHarf = " + ilkHarf);

    }
}
