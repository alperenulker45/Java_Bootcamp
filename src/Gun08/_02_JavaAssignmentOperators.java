package Gun08;

public class _02_JavaAssignmentOperators {
    public static void main(String[] args) {
        int a=10;
        int b=2;

        a=a+5;
        a+=5;//yukaridaki islemle ayni sonucu verir. a'yi 5 arttir demektir.
        //diger bir deyimle a'nin artis degeri=5'tir.

        a=a-5;
        a-=5;//a'nin eksilme degeri 5'tir. bir ustteki islemle aynidir. a'yi 5 azalt komutudur.
        //diger bir deyimle a'nin azalis degeri 5'tir.

        a=a/5;
        a/=5; //a'yi 5'e bol komutudur. bir ustteki islemle aynidir.

        a=a*5;
        a*=5; //a yi 5 ile carpma komutudur. bir ustteki islemle ayni sonucu verir.

    }
}
