package Gun15;

public class _06_JavaArray {
    public static void main(String[] args) {

        //// 5 elemanlı bir dizi tanımlayınız, 10 a kadar olan sayılardan Random atayarak
        // doldurunuz.Sonrasında ayrı bir döngü ile yazdırınız.

        int [] dizi=new int[5];

        for (int i=0; i< dizi.length; i++)
        {
            dizi[i]= (int) (Math.random()*10);
        }

        for (int i=0; i< dizi.length; i++)
        {
            System.out.println(dizi[i]);
        }

    }
}
