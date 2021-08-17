package Odev23Subat;

public class _03_Soru3 {
    public static void main(String[] args) {
        //3- 0 ile 100 arasındaki bütün çift sayıları yazdırabileceğiniz bir kod yazınız. (for ile)

        // 1. yontem
        for (int i=1; i<100; i+=2)
        {
            System.out.println(i);
        }

        //2. yontem

        for (int k=1; k<100; k++)
        {
            if (k%2!=0)
                continue;
            System.out.println(k);
        }

        //3. yontem

        for (int j=1; j<100; j++)
        {
            if (j%2==0) System.out.println(j);
        }

    }
}
