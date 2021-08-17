package SubatAyinSorulari;

public class _02_ {
    public static void main(String[] args) {
        //Bir top 220m yükseklikten atılmaktadır. Atıldıktan sonra,
        // atıldığı yüksekliğin ¾ ü kadar yerden yukarı doğru zıplamaktadır.
        // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
        // Bu ana kadar aldığı yolu ve yere vurma sayısını bulunuz.

        double yukseklik=220;
        double toplam=0;
        int vurus=0;

        while (yukseklik>1)
        {
            toplam+=2*(yukseklik*3/4);
            yukseklik=yukseklik*3/4;
            vurus++;
        }
        toplam=toplam+220;
        System.out.println("vurus = " + vurus);
        System.out.println("toplam = " + toplam);

    }
}
