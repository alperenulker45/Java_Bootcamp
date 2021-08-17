package Gun10;

public class _05_JavaRandom {
    public static void main(String[] args) {
        //0 ile 6 arasinda random sayi ureten programi yapiniz.

        double doublesayi= Math.random() *10;//random 0-1 arasi random sayi verir. 10 la carpinca 0-10 arasi verir.
        //10 dahil degildir. 10 u katmak icin +1 gerekir. random sayi double turunde verir.
        System.out.println("sayi = " + doublesayi);
        
        int tamsayi= (int) doublesayi; //double aldigimiz random sayiyi int e donusturduk.
        System.out.println("tamsayi = " + tamsayi);

        int tamsayi2= (int) (Math.random()*100);// dogrudan random olarak 0-100 arasi sayi aldik.
        System.out.println("tamsayi2 = " + tamsayi2);
        
    }
}
