package Odev25Subat;

public class _17_ {
    public static void main(String[] args) {
        //17-String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        //Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        //Eğer aitse "true" çevirin.
        //Loops (döngüler) kullanın.

        String [] dizi= {"Apple", "Orange", "Banana", "Pineapple"};

        for (int i=0; i< dizi.length; i++)
        {
            if (dizi[i]=="Apple") System.out.println(true);
        }

    }
}
