package Gun13;

import java.util.Scanner;

public class _09_continue {
    public static void main(String[] args) {
        // Kullanıcıdan 5 adet sayı isteyiniz
        // Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        // bu soruyu continue kullanarak çözünüz.

        Scanner sc=new Scanner(System.in);
        int sayi;
        int toplam=0;


        for (int i=0; i<5; i++)
        {
            System.out.print("Sayi Giriniz: ");
            sayi= sc.nextInt();
            if (sayi>=5 && sayi<=10)
            {
                System.out.println("5 ile 10 arasi girdiginiz icin toplama girmeyecek");
                continue;
            }
            toplam=toplam+sayi;
            
        }

        System.out.println("toplam = " + toplam);
    }
}
// sayacı ritmik ilerleyen ve adım sayısı belli ise FOR kullanılır.
// DEĞİLSE While kullanılır, ğer döngüye bir kez mutlaka girilecekse DO_WHILE kullanılır.
