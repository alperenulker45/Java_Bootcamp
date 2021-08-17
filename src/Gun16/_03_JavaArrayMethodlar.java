package Gun16;

import java.util.Arrays;

public class _03_JavaArrayMethodlar {
    public static void main(String[] args) {
        //Arrays.toString(dizi); --> diziyi direkt yazdirir.

        String [] isimler= {"ahmet", "alperen", "rana", "huzur", "sena"};
        System.out.println("  .toString():" + Arrays.toString(isimler));

        //Arrays.sort(dizi) --> diziyi alfabetik veya numerik olarak siralar.

        Arrays.sort(isimler);
        System.out.println("  .sort= " + Arrays.toString(isimler));


        //Arrays.equals(dizi1, dizi2); //butun elemamlarin sirasi ile birbirine esit olup olmadigina bakar

        int [] a= {1,2,3};
        int [] b= {1,2,3};
        int [] c= {2,1,3};

        System.out.println("a==b? " + Arrays.equals(a,b)); //true, false ciktisi verir.
        System.out.println("a==c? " + Arrays.equals(a,c));

        //Arrays.fill(dizi, deger): -->butun elemanlari girilen deger ile doldurur.
        // tum elemanlara ayni degeri atar.

        int [] numbers= new int[6];
        System.out.println("deger atamadan once = " + Arrays.toString(numbers));

        Arrays.fill(numbers, 7); //dizinin tum elemanlarina 7 degeri atandi.
        System.out.println("deger atamadan sonra = " + Arrays.toString(numbers));

        //Arrays.BinarySearch(dizi, deger) -->
        //degeri siralanmis olan dizi icinde arar. bulabilirse indexi verir.
        //bulamazsa -bir deger verir.-->bu komutun calismasi icin dizinin siralanmis, yani sort olmasi gerekir

        int [] rakamlar= {2,7,4,6,23,5,6};
        System.out.println("8 in indexi= " + Arrays.binarySearch(rakamlar, 8)); //dizide 8 yok ve dizi sirali deil
        System.out.println("23 un indexi = " + Arrays.binarySearch(rakamlar, 23));//23 var ama sort deil hata
        Arrays.sort(rakamlar);
        //siraladiktan sonra cikti alma
        System.out.println("sıralama sonrası = " +  Arrays.toString(rakamlar));
        System.out.println("önce : 8 in indexi  = " + Arrays.binarySearch(rakamlar, 8));
        System.out.println("önce : 23 in indexi  = " + Arrays.binarySearch(rakamlar, 23));
        System.out.println("önce : 6 in indexi  = " + Arrays.binarySearch(rakamlar, 6));
        // iki tane 6 var. ilk 6 yi buluyor.

    }
}
