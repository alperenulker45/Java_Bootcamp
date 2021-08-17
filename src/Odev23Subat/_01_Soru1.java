package Odev23Subat;

public class _01_Soru1 {
    public static void main(String[] args) {
        //1- 1’den 10’a kadar olan sayıların karelerini ve karelerinin ortalamasını veren programı yaziniz

       int sum=0;

       for (int i=1; i<=10; i++)
       {
           int karesi= (int) Math.pow(i, 2);
           System.out.println(i + " karesi " + " = " + karesi);
           sum= (int) (sum+Math.pow(i, 2));


       }
       double ortalama= (double) sum/10;
        System.out.println("ortalama = " + ortalama);
    }
}
