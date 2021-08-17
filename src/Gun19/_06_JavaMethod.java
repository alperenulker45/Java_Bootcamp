package Gun19;

public class _06_JavaMethod {
    public static void main(String[] args) {

        ortalamaBulYaz("Ahmet", 45, 50, 89, 90);
        ortalamaBulYaz("Mehmet", 34, 78, 23, 100);
        ortalamaBulYaz("Ali", 32, 56, 90, 56);
        ortalamaBulYaz("Arif", 43, 51, 89, 67);
        ortalamaBulYaz("Hakan", 45, 33, 89, 78);
    }


    public static void ortalamaBulYaz(String isim, int... notlar)
    {
        int toplam=0;
        for (int not : notlar) {
            toplam += not;
        }

        System.out.println(isim + "=" + toplam/ notlar.length);
    }
}
