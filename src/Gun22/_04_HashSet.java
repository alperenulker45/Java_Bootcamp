package Gun22;

import java.util.Arrays;
import java.util.HashSet;

public class _04_HashSet {
    public static void main(String[] args) {
        // Bir HashSet random olarak 10 adet olacak şekilde 1 den 20 e
        // kadar olan sayılarla dolduran fonksiyonu yazınız.
        // Set i main de yazdırınız.

        HashSet <Integer> randomset=new HashSet<>();
        while (randomset.size()<10)
        {
            randomset.add((int) (Math.random()*20+1));
        }

        System.out.println("randomset = " + randomset);

        Integer [] dizi=madeArray(randomset);
        System.out.println("dizi = " + Arrays.toString(dizi));
    }

    /// yukarida olusturulan seti methodda diziye cevirip mainde yazdir.

    public static Integer[] madeArray (HashSet<Integer> setA)
    {
        //1. yontem
        Integer [] dizi= new Integer[setA.size()];
        int index=0;
        for (int i:setA)
        {
            dizi[index]=i;
            index++;
        }
        //2. yontem

        dizi=setA.toArray(new Integer[setA.size()]);
        return dizi;

    }
}
