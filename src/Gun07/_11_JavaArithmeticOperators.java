package Gun07;

public class _11_JavaArithmeticOperators {
    public static void main(String[] args) {
        // Artırma ve Azaltma Operatörleri
        int a=5;
        int b=2;
        int k=0;

        a++;  // a nın değerini bir artırır => a=a+1 le aynı -> 6
        ++a;  // a nın değerini bir artırır => a=a+1 le aynı -> 7
        // Yukarıdaki işlemlerin bir farkı yok kendi başlarına olunca.

        k= a++; // ++ lar sağda olduğunda, önce atama işlemi yapılır, bittikten sonra a nın değeri bir artar
        // yani k=a; a=a+1;  gibi olur.    k= 7  a= 8
        k= ++a; // ++ lar solda olduğunda, Önce a nın değeri artar sonra atama işlemi yapılır .
        // yani a=a+1 yapılır sonra k=a.   a=9  k=9

        k= a--; // önceki değerler a=9 , k=9, sonraki değerler k=9,  a=8
        k= --a; // önceki değerler k=9, a=8, sonraki değerler a=7, k=7

//        ++ veya -- değişkenin sağındaysa: önce atama işlemini yap,
//        sonra değişkenin değerini 1 artır veya azalt
//
//        ++ veya -- değişkenin SOLUNDAYSA: önce değişkenin
//        kendi değerini 1 artır veya azalt sonra atama işlemlerini yap
    }
}
