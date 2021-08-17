package Gun20;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_ArrayListOrnekSoru {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız, ve
        // ortalamayı geçen öğrenci sayısını bulunuz.

        ArrayList<Integer> notlar= new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);

        String devamMi;

        do {

            System.out.print("Not: ");
            int ogrNot= sc.nextInt();
            System.out.println("Devam mi? E/H");
            devamMi= sc2.nextLine();

        }while (devamMi.equalsIgnoreCase("E"));

        //ortalama bulma

        int toplam=0;

        for (int i = 0; i <notlar.size() ; i++) {

            toplam=toplam+notlar.get(i);
        }

        int ortalama= toplam/notlar.size();

        //Ortalamayi gecenlerin sayisi

        int ortalmGecenSayi=0;
        for (int i = 0; i < notlar.size() ; i++) {

            if (notlar.get(i)> ortalama)
                ortalmGecenSayi++;
            
        }

        System.out.println("ortalama = " + ortalama);
        System.out.println("ortalmGecenSayi = " + ortalmGecenSayi);
        
    }
}
