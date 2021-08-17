package Gun18;

import java.util.Scanner;

public class _05_JavaMethodOrnekHocaCozm {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int secim=0;

        do{
            menuYaz();
            secim=oku.nextInt();
            islemYap(secim);
        }while (secim<6);

    }

    public static void menuYaz(){
        System.out.println("****** Menü *******");
        System.out.println("1-toplama");
        System.out.println("2-çıkarma");
        System.out.println("3-çarpma");
        System.out.println("4-bölme");
        System.out.println("5-faktöryel");
        System.out.println("6-Çıkış");
        System.out.print("Seçiminiz=");
    }

    public static void islemYap(int secim)
    {
        Scanner oku=new Scanner(System.in);

        // okuma işlemi , kullanıcıdan veri alındı
        int sayi1=0;
        int sayi2=0;
        switch (secim)
        {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.print("1.Sayı = ");
                sayi1 = oku.nextInt();
                System.out.print("2.Sayı = ");
                sayi2 = oku.nextInt();
                break;

            case 5:
                System.out.print("1.Sayı = ");
                sayi1 = oku.nextInt();
                break;
        }

        // işlem yapma bölümü
        switch (secim)
        {
            case 1:toplama(sayi1,sayi2);break;
            case 2:cikarma(sayi1,sayi2);break;
            case 3:carpma(sayi1,sayi2);break;
            case 4:bolme(sayi1,sayi2);break;
            case 5:faktoryel(sayi1);break;
        }
    }

    public static void toplama(int a, int b){
        System.out.println((a+b));
    }
    public static void cikarma(int a, int b){
    }
    public static void carpma(int a, int b){
    }
    public static void bolme(int a, int b){
    }
    public static void faktoryel(int a){
    }
}
