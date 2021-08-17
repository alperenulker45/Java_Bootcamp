package Gun17;

public class _02_Matris_Array {
    public static void main(String[] args) {
        ////  {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}  int 2D arrayini  olustur
        //        //   2D arrayinden max number print et
        
        int [][] tablo= {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}};
        int enb=tablo[0][0];

        for (int i = 0; i <4 ; i++) //i<4 yerine tablo.length dersem bu toplam satir uzunlugunu verir.
        {
            for (int j = 0; j <3; j++) //j<3 yerine tablo[i].length dersek her satirin (yani sutunun) uz. verir
            {
                if (tablo[i][j]>enb)
                    enb=tablo[i][j];
            }
        }

        System.out.println("enb = " + enb);

        //diger bir yol max=Math.max(max,arrRay[i][j]);
    }
}
