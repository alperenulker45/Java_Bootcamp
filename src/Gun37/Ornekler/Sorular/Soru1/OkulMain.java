package Gun37.Ornekler.Sorular.Soru1;

import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args)  {

        Okul okul = new Okul("Fatih Lisesi", 4);
        Scanner sc = new Scanner(System.in);
        Scanner intsc= new Scanner(System.in);

        int ogrenciSayisi=1;
        do{
            System.out.print(ogrenciSayisi+".Öğrenci Adı=");
            String ogrAd=sc.nextLine();

            System.out.print(ogrenciSayisi+".Öğrenci Soyadı=");
            String ogrSoyad=sc.nextLine();

            System.out.print(ogrenciSayisi+".Öğrenci Yaşı=");
            int ogrYas=intsc.nextInt();

            try {
                Ogrenci ogr = new Ogrenci(ogrAd, ogrSoyad, ogrYas);
                okul.getOgrenciler().add(ogr);
                ogrenciSayisi++;
            }
            catch (Exception ex)
            {
                System.out.println(ex.getMessage());
                System.out.println("Lütfen tekrar giriniz");
            }

        }while(ogrenciSayisi <= okul.getMaxOgrenciSayisi() );

        System.out.println(okul);

    }
}
