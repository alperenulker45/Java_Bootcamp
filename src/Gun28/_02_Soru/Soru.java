package Gun28._02_Soru;

import java.util.Scanner;

public class Soru {

    // Bir bisiklet sınıfı yazınız . Properties(fields) : hiz, vites
    // metodlari : hizdegistir(int yeniHiz), vitesArtir()-> 1 değer vites artırıyor,
    // vitesAzalt() -> 1 deger vites azaltıyor, durumGoster -> O andaki hızı ve vitesi gösteriyor
    // vites 5 den büyük ve 1 den küçük olamıyor.

    public static void main(String[] args) {

        Bisiklet bisiklet= Bisiklet.bisikletolustur();

        Scanner sc=new Scanner(System.in);
        int secim=0;
        do
            {
                bisiklet.menuYaz();
                secim= sc.nextInt();
                bisiklet.islemYap(bisiklet, secim);
            }while (secim<5);
    }
}
