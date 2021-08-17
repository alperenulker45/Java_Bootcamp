package Gun18;

public class _02_JavaMethod {
    public static void main(String[] args) {

        merhabayaz();
        ismemerhaba("alperen"); //asagidaki methodda isim adinda bir String tanimladik. o yuzden "" icine yazdk.
        ismemerhaba("huzur");


    }

    public static void merhabayaz()
    {
        System.out.println("Merhaba");
    }

    public static void ismemerhaba(String isim) //parametreyi tanimlama
    {
        System.out.println("Merhaba " + isim.toUpperCase());//biz kucuk bile yazsak mainde buyuk cikaracak.
    }


}
