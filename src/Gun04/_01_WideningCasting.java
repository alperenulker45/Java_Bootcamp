package Gun04;

public class _01_WideningCasting {
    public static void main(String[] args) {
//        byte -> short -> char -> int -> long -> float-> double; otomatik donusum.

        int sayi=9;
        double oran=3.2;

        oran=sayi; // int turundeki 9 degeri double turundeki alana atildi.
        // bu tip donusume genisletilme yonunde oldugu icin widening casting denilir.
        // diger adiyla herhangi bir ekstra islem yapmadigimiz icin automatic donusum de denilir.

        System.out.println("oran=" + oran); // oran=9.0 , veri kaybi olmadi
    }
}
