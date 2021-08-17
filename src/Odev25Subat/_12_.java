package Odev25Subat;

import java.util.Arrays;

public class _12_ {
    public static void main(String[] args) {
        //12-Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array) 
        // ilk ve son elementlerini kapsayan yeni array'e return edin.
        // Oluşturacağınız int array'i =   ([1, 2, 3, 4])
        //Sonuç bu şekilde olmalıdır. [1, 4] 
        
        int [] dizi1= {1,2,3,4};
        int [] dizi2= new int[2];
        
        for (int i=0; i<dizi1.length; i++)
        {
            if (i==0)
            {
                dizi2[0]=dizi1[i];
            }

            if (i==dizi1.length-1)
            {
                dizi2[1]=dizi1[i];
            }

        }
        System.out.println("Arrays.toString(dizi2) = " + Arrays.toString(dizi2));
    }
}
