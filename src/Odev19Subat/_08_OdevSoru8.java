package Odev19Subat;

public class _08_OdevSoru8 {
    public static void main(String[] args) {
        //8-# do while loop kullanınız
        //> 0 ile 30 arasındaki bütün çift sayıları yazdırınız.

        int sayi=0;

        do {
            System.out.println(sayi);
            sayi+=2;
        }
        while (sayi<=30);
    }
}
