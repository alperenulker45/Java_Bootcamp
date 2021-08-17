package Gun06;

import java.util.Scanner;

public class _12_Ornek2 {
    public static void main(String[] args) {
        // kullanicindan tek okumada alacaginiz ad ve soyadi ekrana sadece isim basharf.soyisimbasharf.
        //seklinde yazdiriniz. yani ahmet yilmaz --> a.y. olarak yazdiriniz.

        Scanner input= new Scanner(System.in);
        System.out.print("Ad ve Soyadinizi Giriniz=");
        String adSoyad= input.nextLine(); //Ahmet Yilmaz girisi yapacagiz.
        char adilk= adSoyad.charAt(0); // buradan adin ilk harfi "A" yi bulacagiz.
        int boslukindex= adSoyad.indexOf(" ");
        char soyadilk= adSoyad.charAt(boslukindex+1);
        System.out.println("Ad ve Soyad basharfleri = " + adilk + "." + soyadilk + ".");


    }
}
