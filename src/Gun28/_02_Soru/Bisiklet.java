package Gun28._02_Soru;

import java.util.Scanner;

public class Bisiklet {
    int hiz;
    int vites;

    public static Bisiklet bisikletolustur ()
    {
        Bisiklet bisiklet = new Bisiklet();
        bisiklet.hiz=0;
        bisiklet.vites=1;

        return bisiklet;
    }


    public void hizDegistir (int yeniHiz)
    {
        hiz=yeniHiz;
        System.out.println("hiz = " + hiz);
    }

    public void vitesArtir ()
    {
        vites++;
        System.out.println("vites = " + vites);
        if (vites>5) {
            System.out.println("Vites 5'ten buyuk olamaz");
            vites=5;
        }

    }

    public void vitesAzalt ()
    {
        vites--;
        System.out.println("vites = " + vites);
        if (vites<1){
            System.out.println("Vites 1 den kucuk olamaz");
            vites=1;
        }
    }
    
    public void durumGoster() 
    {
        System.out.println("hiz = " + hiz);
        System.out.println("vites = " + vites);
    }

    public static void menuYaz ()
    {
        System.out.println("Bisiklet Islem Paneli");
        System.out.println("1 : Yeni Hiz Ver");
        System.out.println("2 : Vites Yukselt");
        System.out.println("3 : Vites Azalt");
        System.out.println("4 : Durum Goster");
        System.out.print("Secim : ");


    }

    public static void islemYap (Bisiklet bisiklet, int secim)
    {
       Scanner sc=new Scanner(System.in);
        switch (secim)
        {
            case 1 :
                System.out.println("Yeni Hizinizi Giriniz");
                bisiklet.hizDegistir(sc.nextInt());
                break;
            case 2 : bisiklet.vitesArtir();
                break;
            case 3 : bisiklet.vitesAzalt();
                break;
            case 4 : bisiklet.durumGoster();
                break;
        }
    }
}
