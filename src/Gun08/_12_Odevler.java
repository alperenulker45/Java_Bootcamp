package Gun08;

import java.util.Scanner;

public class _12_Odevler {
    public static void main(String[] args) {
       //1- Girilen bir sayının birler basamağını ekrana yazdırınız.
        Scanner input=new Scanner(System.in);
        System.out.print("Sayi Giriniz= ");
        int sayi= input.nextInt();
        int birler=sayi%10;
        System.out.println("birler basamagi = " + birler);

        // 2- Girilen bir sayının onlar basamağını ekrana yazdırınız.
        System.out.print("Sayi Giriniz= ");
        int sayi2= input.nextInt();
        int onlar= (sayi2/10)%10;
        System.out.println("onlar basamagi = " + onlar);

        //3- Girilen bir sayının yüzler basamağını ekrana yazdırınız.
        System.out.print("Sayi Giriniz= ");
        int sayi3= input.nextInt();
        int yuzler= (sayi3/100)%10;
        System.out.println("yuzler basamagi = " + yuzler);

        //4- Kullanıcıdan vize ve final notunu alınız. ort = 0.4 * vize + 0.6 * final olarak bulunuz.
        System.out.print("Vize notunu giriniz= ");
        int vize= input.nextInt();
        System.out.print("Final notunu giriniz= ");
        int finalnot= input.nextInt();
        int ortalama= (int) ((vize*0.4) + (finalnot*0.6));
        System.out.println("ortalama = " + ortalama);

        //5- I love java olan bir String oluşturun. Bu cümlenin toplam karakter sayısını yazdırın.

        String text="I Love Java";
        System.out.println("text uzunluk = " + text.length());

        //6- Sprint planning olan bir String oluşturun. Bu dizenin _toplam karakter sayısını_ yazdırın.

        String text2="Sprint planning";
        System.out.println("text2 uzunluk = " + text2.length());

        // 7- paper olan bir String oluşturun.String'i _büyük harfe_ çevirin ve yazdırın.örn: apple > APPLE

        String text3= "paper";
        System.out.println("Upper Case = " + text3.toUpperCase());

        //8- OraNge olan bir String oluşturun. String'i _küçük harfe_ çevirin ve yazdırın. örn: APPLE > apple

        String text4= "OraNge";
        System.out.println("Lower Case = " + text4.toLowerCase());

        //9- New Jersey** olan bir String oluşturun. String'i _büyük harfe_ çevirin ve yazdırın
        String text5="New Jersey**";
        System.out.println("Upper Case = " + text5.toUpperCase());

        //10- apple olan bir String oluşturun.String'in _içinde_ app olup olmadığını doğrula.
        String text6= "apple";
        System.out.println("text 6 Contains 'app'? = " + text6.contains("app"));

        //11- orange kelimesinden oluşan bir String oluşturun. String'in Apple'a _eşit_ olup olmadığını doğrulayın.
        String text7= "orange";
        System.out.println("text7 equals apple? = " + text7.equals("Apple"));

        //12- apple  olan  bir String oluşturun.String'in apple'a _eşit_ olup olmadığını doğrulayın. _
        // Büyük harf veya küçük harf önemli değildir._
        String text8="apple";
        System.out.println("text8 equals 'apple' by ignoring case = " + text8.equalsIgnoreCase("ApPle"));

        //13- Florida kelimesinden bir String oluşturun.Florida kelimesinin içindeki,
        // sadece  'o'  harfinin bulunduğu indexini yazdırın.
        String text9="Florida";
        int o= text9.indexOf("o");
        System.out.println("index o = " + o);

        //14- Thank you olan bir String oluşturun.Thank you içindeki, sadece  'y' harfinin bulunduğu _konumu_ yazdırın.
        String text10="Thank you";
        int y= text10.indexOf("y");
        System.out.println("index y = " + y);

        //15- Mouse değerinde bir String oluştur.Mouse String'inin 3. sırasındaki karakteri_ yazdırın.
        String text11="mouse";
        char ucuncuindex= text11.charAt(3);
        System.out.println("ucuncuindex = " + ucuncuindex);

        //16- str1 ve str2 isimli 2 tane String oluşturulmuştur.
        // Eğer str1, str2'ye _eşit ise_ **"String 1 is equal to String 2"** yazdırınız.
        //Eğer str1, str2'ye _eşit değil ise_ **"String 1 is NOT equal to String 2"** yazdırınız.

        String str1= "Hello World";
        String str2= "Hello world";
        if (str1.equals(str2)) { System.out.println("String 1 is equal to String 2"); }
        if (!str1.equals(str2)) { System.out.println("String 1 is NOT equal to String 2"); }

        //17- "I love coding" olan bir String oluşturun. 'o' yerine 'A' yerleştirin.Sonucu yazdırınız.

        String coding= "I love coding";
        System.out.println("Replace o to A = " + coding.replace("o", "A"));

        //18- "code start here" olan bir String oluşturun.
        // İlk önce gelen **'a'** karakterinin **kaçıncı sırada** olduğunu yazdırın.
        String coding2="code start here";
        System.out.println("index of a = " + coding2.indexOf("a"));

        //19- 2 int oluşturun. int 1 'in değeri 120, int 2'nin değeri 158 olmalı.
        // int 1 'in int 2'den büyük olup olmadığını doğrulayın.
        // (Eğer int1, int2'den **büyükse** konsolda **true** sonucu vermeli.)Cevabı yazdırın.

        int int1= 120;
        int int2= 158;
        System.out.println("int1 int2'den buyuk mu? = " + (int1>int2));

        //20- 2 double oluşturun.İlk double'ın değeri 14.23, ikinci double'ın değeri 19.52 olmalı.
        // Double1'in double2'ye eşit olmadığını doğrulayın.
        // Eğer **eşit değilse** cevap **true** olmalı.Cevabı yazdırınız.

        double dob1= 14.23;
        double dob2= 19.52;
        System.out.println("dob1 dob2'ye esit mi? = " + (dob1!=dob2));

    }
}
