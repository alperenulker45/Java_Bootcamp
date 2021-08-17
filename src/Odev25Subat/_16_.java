package Odev25Subat;

public class _16_ {
    public static void main(String[] args) {
        //16-int Array oluşturun ve elemanları : 12,2,5,15,8
        //En büyük değeri yazdırınız.
        int [] dizi={12,2,5,15,8};
        int max=dizi[0];

        for (int i : dizi)
        {
            if (i>max) max=i;
        }
        System.out.println("max = " + max);
    }
}
