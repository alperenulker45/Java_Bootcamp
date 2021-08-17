package Gun17;

public class _03_ {
    public static void main(String[] args) {
        int [][] tablo= {
                {1,2},
                {1},
                {5,5,5,6,8,9},
                {2,10,3}
        };
        //yukarida duzensiz bir tablo var, her satirin eleman sayisi farkli. buna duzensiz dizi deniyor

        System.out.println("tablo satir sayisi= " + tablo.length);//bu bize tablonun satir sayisini verir.
        System.out.println("1. satirin eleman sayisi= " + tablo[0].length);//1. satirin eleman sayisi
        System.out.println("2. satirin eleman sayisi= " + tablo[1].length);//2. satirin eleman sayisi
        System.out.println("3. satirin eleman sayisi= " + tablo[2].length);//3. satirin eleman sayisi
        System.out.println("4. satirin eleman sayisi= " + tablo[3].length);//4. satirin eleman sayisi

        for (int satir = 0; satir < tablo.length ; satir++)
        {
            for (int sutun = 0; sutun <tablo[satir].length ; sutun++)
            {
                System.out.print(tablo[satir][sutun]+" ");
            }
            System.out.println();
        }
    }
}
