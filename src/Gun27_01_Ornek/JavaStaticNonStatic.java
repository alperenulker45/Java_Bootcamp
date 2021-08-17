package Gun27_01_Ornek;

public class JavaStaticNonStatic {
    public static void main(String[] args) {
        // Benim bütün programlarımda kullanacağım tip dönüşümleri için metodlara ihtiyacım var.
        // mesala int to string , string to int, vs. vs.. bunları yapan bir sinif yazınız.
        // ve bunları main de kullanarak gösteriniz.

        //1.yöntem : Javanın kendi metodlarıyla yapılan çevirme işlemleri

        int sayi=345;
        String strRakam=String.valueOf(sayi);
        int intRakam=Integer.parseInt(strRakam);

        //2. Yontem : Kendi sinifimi yazayim ve ordan getireyim. getString(), getInt(), getDouble();
        Utility util=new Utility();//metodlari cagirabilmek icin Utility sinifindan yeni nesne olusturduk.

        strRakam = util.getString(sayi);
        intRakam= util.getInt(strRakam);

        System.out.println("strRakam = " + strRakam);
        System.out.println("intRakam = " + intRakam);

        //3. Yontem : static bir method olusturarak new olusturmadan direk kullanim.
        //bir random bir sayi olusturmak icin Math.random() kullaniyorduk. Aslinda javada tanimli olan bir classi
        //new olusturmadan kullanabiliyoruz. biz de static bir method olusturarak kullanabiliriz.

        Math.random();

        strRakam = Utility.getsString(sayi);
        intRakam = Utility.getsInt(strRakam);



    }
}
