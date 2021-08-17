package Gun27_01_Ornek.Gun27_02_Ornek;

public class Soru {
// Math sınıfndaki metodlarıdan 5 tanesini kendi isimlendirmenizle
    // ayrı bir sınıfta yazarak,
    // (kendi metodunuzun içinde Math.fonksiyonlarını kullanabilirsiniz)
    // mainden nesne oluşturmadan direk kullanılmasını sağlatacak örnek
    // kullanımlarını yazınız.

    public static void main(String[] args) {

        //31 e kadar Random bir num
        System.out.println("random = " + MyMath.getRandom(31));

        //Max sayiyi getir
        System.out.println("maxnum = " + MyMath.getMax(5, 90));
        
        //Min sayiyi getir
        System.out.println("minnum = " + MyMath.getMin(54, 67));
        
        //3 un 3 uncu kuvvetini al
        System.out.println("pow = " + MyMath.getPow(3, 3));
        
        //4 un karekokunu al.
        System.out.println("sqrt = " + MyMath.getSqrt(4));

        //Sayinin mutlak degerini al
        System.out.println("MyMath.getAbs(-34) = " + MyMath.getAbs(-34));

        int [] dizi = {1,2,3,4,7,9,34,2};
        System.out.println("Toplam = " + MyMath.diziTopla(dizi));
        
    }

}
