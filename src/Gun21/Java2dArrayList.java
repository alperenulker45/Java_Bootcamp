package Gun21;

import java.util.ArrayList;
import java.util.Scanner;

public class Java2dArrayList {
    public static void main(String[] args) {

        /*******************/
        int sayi = 5; // tek bir rakam saklayabilen değişken
        int[] dizi = new int[5]; // 5 adet rakam saklayabilen değişken.
        int[][] tablo = new int[5][5]; // 5x5 lik 25 adet rakam saklayabilen değişken

        ArrayList<Integer> liste = new ArrayList<>(); // istenildiği kadar rakam eklenebilen değişken
        /*******************/

        int[][] tablo2 = new int[5][5]; //5x5 lik 25 adet rakam saklayabilen değişken

        ArrayList<ArrayList<Integer>> notlarListesi = new ArrayList<>(); // Listelerin listesi


        String[] dersler = new String[3];
        dersler[0] = "Matematik";
        dersler[1] = "Türkçe";
        dersler[2] = "Kimya";

        ArrayList<Integer> matNotlar = new ArrayList<>(); // bu bir liste
        matNotlar.add(90);
        matNotlar.add(80);
        matNotlar.add(70);

        ArrayList<Integer> turNotlar = new ArrayList<>(); // bu bir liste
        turNotlar.add(95);
        turNotlar.add(85);
        turNotlar.add(75);

        ArrayList<Integer> kimNotlar = new ArrayList<>(); // bu bir liste
        kimNotlar.add(60);
        kimNotlar.add(50);
        kimNotlar.add(40);
        kimNotlar.add(30);

        notlarListesi.add(matNotlar);
        notlarListesi.add(turNotlar);
        notlarListesi.add(kimNotlar);

        for (int i = 0; i < matNotlar.size(); i++) {
            System.out.println("matNotlar = " + matNotlar.get(i));
        }

        // tüm notlar
        for (int i = 0; i < notlarListesi.size(); i++) {
            System.out.println(dersler[i]);
            for (int j = 0; j < notlarListesi.get(i).size(); j++) {
                System.out.println((i + 1) + ".yapraktaki, " + (j + 1) + ".Not = " +
                        notlarListesi.get(i).get(j));  //satır sütun yapısı tablo[i][j]
            }

        }

        //Soru-1-Kullanıcıdan alınan ders nosuna göre ekrana Notların Listesini bir fonksiyonda
        //yazdırınız.

        Scanner sc=new Scanner(System.in);
        System.out.println("Ders No Listesi: 0-Mat, 1-Tur, 2-Kim");
        int dersNo= sc.nextInt();

        dersnotlariyazdir(notlarListesi, dersNo);

        System.out.print("Ortalamasini Istediginiz Ders No Giriniz: ");
        int ortalamano= sc.nextInt();
        int dersortalama = ortalamayazdir(notlarListesi, ortalamano);
        System.out.println("dersortalama = " + dersortalama);

        int tumortalama=tumdersortalama(notlarListesi);
        System.out.println("tumortalama = " + tumortalama);

        System.out.print("Ortalamasini Istediginiz Sinav No Giriniz: ");
        int sinavno= sc.nextInt();
        int sinavortalama=sinavlarinortalamasi(notlarListesi, sinavno);
        System.out.println("sinavortalama = " + sinavortalama);


    }

    public static void dersnotlariyazdir (ArrayList<ArrayList<Integer>> notlar, int dersNo)
    {
        System.out.println(notlar.get(dersNo));
    }

    public static int ortalamayazdir (ArrayList<ArrayList<Integer>> notlar, int ortalamaNo)
    {
        int toplam=0;
        for (int i=0; i<notlar.get(ortalamaNo).size(); i++)
        {
         toplam=toplam+notlar.get(ortalamaNo).get(i);
        }
        int ortalama=toplam/notlar.get(ortalamaNo).size();
        return ortalama;
    }

    public static int tumdersortalama(ArrayList<ArrayList<Integer>> notlar)
    {
        int toplam=0;
        int notsayisi=0;

        for (int i=0; i<notlar.size(); i++)
        {
            for (int j = 0; j < notlar.get(i).size(); j++)
            {
                toplam += notlar.get(i).get(j);
                notsayisi++;
            }
        }
        return toplam/notsayisi;
    }

    public static int sinavlarinortalamasi(ArrayList<ArrayList<Integer>> notlar, int sinavno)
    {
        int toplam=0;
        for (int i=0; i<notlar.size(); i++)
        {
            if (sinavno<notlar.get(i).size())
            toplam+=notlar.get(i).get(sinavno);
        }
        return toplam/notlar.size();
    }



}
