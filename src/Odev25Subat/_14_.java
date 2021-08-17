package Odev25Subat;

public class _14_ {
    public static void main(String[] args) {

        //14- int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        //Arraydaki en büyük 2. elemanı yazdıran bir program yazın.

        int [] dizi={15 , 25, 22, 18, 30};
        int max=dizi[0];
        int max2=dizi[1];
        
        for (int i=0; i< dizi.length; i++) 
        {
            if (dizi[i]>max)
            {
                max2=max;
                max=dizi[i];
            }
            else if (dizi[i]>max2)
                max2=dizi[i];
        }

        System.out.println("max = " + max2);
        
    }
}
