package Odev25Subat;

public class _13_ {
    public static void main(String[] args) {
        //13-
        //
        //int Array oluşturun ve elemanları : 5,6,8,12,14,19
        //
        //Eğer sayı çiftse topla, tekse çıkar.
        //
        //**Örneğin:**
        //
        // **-5 + 6 + 8 + 12 + 14 - 19 = 16**
        //
        //Toplamlarını yazdırın.

        int [] dizi= {5,6,8,12,14,19};
        int toplam=0;

        for (int j : dizi) {
            if (j % 2 == 0) {
                toplam += j;
            } else toplam -= j;
        }

        System.out.println("toplam = " + toplam);
    }
}
