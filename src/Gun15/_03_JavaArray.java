package Gun15;

public class _03_JavaArray {
    public static void main(String[] args) {
        //dizileri asagidaki sekilde tanimlayabiliriz.

        int[] dizi1= new int[5]; // int sayi; yapar gibi. su an ici bos 5 elemanlik bir int dizi degiskeni
        //tanimlandi. defaul deger olarak 0 verir.

        int[] dizi2= {5,7,4,286,-34,0,-1,456,789,}; //burada int=5, int=7, gibi tanimlama yaptik. dizinin
        //icini doldurduk.

        String[] dizi3= new String[5]; // string tipinde ici bos 5 elemanli dizi tanimlandi.
        // defaul deger olarak null verir.

        boolean[] dizi4= new boolean[6]; // boolean tipinde 6 elemanli dizi tanimlandi. default false verir

        double[] dizi5= new double[5]; // double cinsinden 5 elemanli dizi tanimlandi.

        for (int i=0; i<dizi1.length; i++)
            System.out.println("dizi1(int)= " + dizi1[i]);

        for (int i=0; i<dizi2.length; i++)
            System.out.println("dizi2(int)= " + dizi2[i]);

        for (int i=0; i<dizi3.length; i++)
            System.out.println("dizi3(String)= " + dizi3[i]);

        for (int i=0; i<dizi4.length; i++)
            System.out.println("dizi1(boolean)= " + dizi4[i]);

        for (int i=0; i<dizi5.length; i++)
            System.out.println("dizi1(double)= " + dizi5[i]);





    }
}
