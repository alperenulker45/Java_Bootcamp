package Gun18;

import java.util.Arrays;
import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        // String şeklinde aralarında boşluklarla girilen bir dizinin
        // enbüyük, enküçük elemanını, bütün elemanların toplamını,
        // sayıların ortalamasını ayrı ayrı metodlarda yapınız.
        // 3 4 12 45 67  gibi giriş yapılacak.

        Scanner sc=new Scanner(System.in);
        System.out.println("Sayilari birer boslukla gir");
        String cumledizi= sc.nextLine();
        String [] strdizi=cumledizi.split(" ");
        int [] intdizi= new int [strdizi.length];

        for (int i = 0; i < strdizi.length ; i++)
        {
            intdizi[i]= Integer.parseInt(strdizi[i]);
        }

        enbuyuk(intdizi);
        enkucuk(intdizi);
        toplam(intdizi);
        ortalama(intdizi);

    }
    public static void enbuyuk (int [] dizi)//ismi yukaridakiyle ayni olmak zorunda degil
    {
        Arrays.sort(dizi);
        System.out.println("enb= " + dizi[dizi.length-1]);
    }

    public static void enkucuk(int [] dizi)
    {
        Arrays.sort(dizi);
        System.out.println("enk= " + dizi[0]);
    }

    public static void toplam (int [] dizi)
    {
        int toplam=0;
        for (int i = 0; i < dizi.length; i++)
        {
            toplam+=dizi[i];
        }
        System.out.println("toplam = " + toplam);
    }

    public static void ortalama (int [] dizi)
    {
        int toplam=0;
        for (int i = 0; i < dizi.length; i++)
        {
            toplam+=dizi[i];
        }

        int ortalama=toplam/ dizi.length;
        System.out.println("ortalama = " + ortalama);
    }
}
