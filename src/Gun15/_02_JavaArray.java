package Gun15;

public class _02_JavaArray {
    public static void main(String[] args) {
        int sayi; // daha once 1 degiskeni bu sekilde tanimliyorduk.
        int [] dizi1= new int[5]; //0, 1, 2, 3, 4, indexli 5 adet yer actik.

        System.out.println("dizi1.length" + dizi1.length);

        for (int i=0; i<dizi1.length; i++)
        {
            System.out.println("dizinin "+i+ ".Elemani "+dizi1[i]);
        }

        System.out.println("dizi1[4]= " + dizi1[4]);// dizinin 3. elemanini yazdirdik. su an dizinin
        //icine tanimli olmadigi icin 0 degeri veriyor.
    }
}
