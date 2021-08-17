package Gun10;

import java.util.Scanner;

public class _08_JavaRandom {
    public static void main(String[] args) {
        //Kullanicidan alt ve ust deger isteyerek random sayi uretiniz ve uretilen sayiyi ekrana yazdiriniz.
        //formul= (int) (Math.random()*((max-min)+1)+min;

        Scanner read= new Scanner(System.in);
        System.out.print("Alt deger giriniz= ");
        int min= read.nextInt();
        System.out.print("ust deger giriniz= ");
        int max= read.nextInt();

        int numberInRange=(int) (Math.random()*((max-min)+1))+min;
        System.out.println("numberInRange = " + numberInRange);


    }
}
