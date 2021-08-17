package Gun18;

import java.util.Scanner;

public class _05_JavaMethodOrnekSoru {

    public static void main(String[] args) {
        // Kullanıcıya aşağıdaki gibi bir menü çıkartarak sürekli değişkenleri alınız ve
// her bir menü elemanını değer alan fonksiyon olarak yazınız.
        /*  1-toplama
            2-çıkarma
            3-çarpma
            4-bolme
            5-Faktöryel
            6-Çıkış
        Bir işlem seçiniz */

        Scanner sc=new Scanner(System.in);

        int secim;
        do {
            menuYaz();
            secim= sc.nextInt();
            islem(secim);
        }while (secim<6);
    }
    public static void menuYaz()
    {
        System.out.println("*********MENU**********");
        System.out.println("1- TOPLAMA");
        System.out.println("2- CIKARMA");
        System.out.println("3- CARPMA");
        System.out.println("4- BOLME");
        System.out.println("5- FAKTORIYEL");
        System.out.println("6- CIKIS");
        System.out.println("SECIMINIZ: ");

    }
    public static void islem(int secim)
    {
        Scanner giris=new Scanner(System.in);
        switch (secim)
    {
        case 1:
            System.out.println("Toplama islemi icin 2 sayi giriniz");
            toplama(giris.nextInt(), giris.nextInt());
            break;

        case 2:
            System.out.println("Cikarma islemi icin 2 sayi giriniz");
            cikarma(giris.nextInt(), giris.nextInt());
            break;

        case 3:
            System.out.println("Carpma islemi icin 2 sayi giriniz");
            carpma(giris.nextInt(), giris.nextInt());
            break;

        case 4:
            System.out.println("Bolme islemi icin 2 sayi giriniz");
            bolme(giris.nextInt(), giris.nextInt());
            break;

        case 5:
            System.out.println("Faktoriyelini almak istediginiz sayiyi giriniz");
            faktoriyel(giris.nextInt());
            break;

    }

    }

    public static void toplama(int s1, int s2)
    {
        System.out.println("toplam ="+ (s1+s2));
    }

    public static void cikarma(int s1, int s2)
    {
        System.out.println("fark= " + (s1-s2));
    }

    public static void carpma (int s1, int s2)
    {
        System.out.println("carpim = " + (s1*s2));
    }

    public static void bolme (int s1, int s2)
    {
        System.out.println("bolum =" + (s1/s2));
    }

    public static void faktoriyel (int s1)
    {
        int faktor=1;
        for (int i = s1; i>0 ; i--)
        {
            faktor=faktor*i;
        }
        System.out.println("faktor = " + faktor);
    }

}
