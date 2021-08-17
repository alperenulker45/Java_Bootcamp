package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _04_ {
    public static void main(String[] args) {
         /*
      Bir veya daha fazla öğe iceren int array verildiğinde, arraydeki en büyük
      ve en küçük öğeler arasındaki farkı return edin.
      Not: the built-in    Math.min(v1, v2) ve   Math.max(v1, v2) methodları
      en küçük ve en büyük öğeleri return eder.

    bigDiff([10, 3, 5, 6]) → 10-3 result = 7
    bigDiff([7, 2, 10, 9]) → 10-2 result = 8
    bigDiff([2, 10, 7, 1]) → 10-1 result = 9

    return tipi  int dir
     */

        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();

        String[] strArr = myStr.split(" "); // 4 5 12 24

        int[] useThisArray = new int[strArr.length];

        for(int i = 0 ; i< strArr.length ; i++){
            useThisArray[i] =Integer.parseInt(strArr[i]);
        }
        // useThisArray[i] 4 5 12 34
        // Kodlamaya burdan başla.Bu satırdan önceki satırlarda hiçbirşeyi kaldırma ve degiştirme.
        // Kullanacağın array 27.ci satırda  --> useThisArray


        System.out.println("dizi= " + Arrays.toString(useThisArray));//girilen diziyi yazdirdik.

        //1. yontem-sort ile yapmak
        
        Arrays.sort(useThisArray);//int dizi kucukten buyuge siralandi.
        int fark=useThisArray[useThisArray.length-1]-useThisArray[0];//en son elemandan yani en buyukten ilk elemani yani
        //en kucugu cikararak dizinin en buyuk ve en kucuk degerleri arasindaki farki bulduk.
        System.out.println("fark = " + fark);
        
        //2. yontem. min max value//bu yontemi kullanmak icinde diziyi sort etmemiz gerekiyor.
        
        int max= Math.max(useThisArray[0], useThisArray[useThisArray.length-1]);
        System.out.println("max = " + max);
        int min= Math.min(useThisArray[0], useThisArray[useThisArray.length-1]);
        System.out.println("min = " + min);
        
        int fark2=max-min;
        System.out.println("fark2 = " + fark2);

        //3. yontem for dongusu icine if kullanarak. bu cozumde diziyi sort etmemize gerek yok

        int enb=useThisArray[0];
        int enk=useThisArray[0];

        for(int i=0; i<useThisArray.length;i++)
        {
            if (enk > useThisArray[i])  // enk=Math.Min(enk, useThisArray[i])
                enk=useThisArray[i];

            if (enb < useThisArray[i]) // enb=Math.Max(enb, useThisArray[i])
                enb=useThisArray[i];
        }

        System.out.println("enb-enk = " + (enb-enk));

    }
}
