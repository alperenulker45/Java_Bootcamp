package Odev25Subat;

public class _15_ {
    public static void main(String[] args) {
        //15-int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        //En küçük (minimum) sayıyı yazdırınız.

        int [] dizi={14 , 19 , 5 , 21};
        int min=dizi[0];

        for (int i : dizi)
        {
            if (i<min) min=i;
        }
        System.out.println("min = " + min);
    }
}
