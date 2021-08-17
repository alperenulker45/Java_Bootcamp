package Gun04;

public class _02_NarrowingCasting {
    public static void main(String[] args) {
        double oran=3.2;
        int sayi=5;

        // sayi=oran; bu sekilde hata verir. cunku inti double'a atiyoruz. o yuzden bunu bilincli yapmak icin

        sayi=(int) oran;
        // bu tip donusume daraltma yonunde oldugu icin narrowing casting denir.
        // diger adiyla ekstra islem de yaptigimizdan manuel donusum de denir.

        System.out.println("sayi="+ sayi); // sayi=3 yazdirdi. yani veri kaybi olcu



    }
}
