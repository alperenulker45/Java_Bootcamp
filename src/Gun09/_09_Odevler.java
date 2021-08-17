package Gun09;

import java.util.Scanner;

public class _09_Odevler {
    public static void main(String[] args) {
        //1-İki tane int oluşturun. Birinci (1.) int 35. İkinci (2.) int 23.
        // Eğer (if) Birinci int, İkinci int'den _büyükse_ "int 1 is greater than 2" yazdırın.
        //Eğer (if) Birinci int, İkinci int'den _küçükse_ "int 1 is smaller than 2" yazdırın.

        int int1= 35;
        int int2= 23;
        if (int1>int2) { System.out.println("int1 is greater than 2"); }
        if (int1<int2) { System.out.println("int1 is smaller than 2"); }

        //2-İki tane int oluşturun. Birinci (1.) int 26. İkinci (2.) int 35.
        //Eğer (if) Birinci int, İkinci int'den _büyükse_ "int 1 is greater than int 2" yazdırın.
        //Eğer (if) Birinci int, İkinci int'den _küçükse_ "int 1 is smaller than int 2" yazdırın.

        int sayi1= 26;
        int sayi2= 35;
        if (sayi1>sayi2) { System.out.println("sayi1 ise greater than 2"); }
        if (sayi1<sayi2) { System.out.println("sayi 1 is smaller than 2"); }

        //3-//str1 ve str2 isimli 2 tane String oluşturulmuştur.
        //Eğer str1, str2'ye _eşit ise_ "String 1 is equal to String 2" yazdırınız.
        //Eğer str1, str2'ye _eşit değil ise_ "String 1 is NOT equal to String 2" yazdırınız.

        Scanner giris= new Scanner(System.in);
        System.out.print("Str1 Giriniz= ");
        String str1= giris.nextLine();
        System.out.print("Str2 Giriniz= ");
        String str2= giris.nextLine();
        if (str1.equals(str2)) { System.out.println("String 1 is equal to String 2"); }
        else { System.out.println("String 1 is NOT equal to String 2"); }

        System.out.println(str1.equals(str2)? "String1 is equal to String 2" : "Not Equal");

        //4-double1 ve double2 isimli iki tane double oluşturulmuştur.
        //Eğer double1, double2'dan _büyük_ ise "double 1 is greater than double 2" yazdırınız.
        //Eğer double1, double2'dan _küçük_ ise "double 1 is smaller than double 2" yazdırınız.

        Scanner input= new Scanner(System.in);
        System.out.print("Double1 Giriniz= ");
        double duble1= giris.nextDouble();
        System.out.print("Double2 Giriniz= ");
        double duble2= giris.nextDouble();
        if (duble1 > duble2) { System.out.println("double 1 is greater than double 2"); }
        else { System.out.println("double 1 is smaller than double 2"); }
        //or
        System.out.println(duble1>duble2? "double 1 is greater than double 2" : "double 1 is smaller than double 2");

        //5-int number 8. satırda.
        // Eğer, int number ikiye bölündüğünde geri kalanı 0'a _eşit ise_ "number is a EVEN number" yazdırın.
        //Eğer, int number ikiye bölündüğünde geri kalanı 0'a _eşit değil ise_ "number is a ODD number" yazdırın.

        Scanner sayigirisi= new Scanner(System.in);
        System.out.print("Sayi Giriniz= ");
        int girilensayi= giris.nextInt();
        if (girilensayi%2==0) { System.out.println("number is an even number"); }
        else { System.out.println("number is an odd number"); }
        System.out.println(girilensayi%2==0? "number is an even number" : "number is an odd number");

        //6-33 değerinde bir int oluşturun.
        //Eğer, 33'ü 4'e böldüğünüzde kalan 3'e eşit ise "Reminder is 3" yazdırınız.
        //Eğer, 33'ü 4'e böldüğünüzde kalan 2'e eşit ise "Reminder is 2" yazdırınız.
        //Eğer, 33'ü 4'e böldüğünüzde kalan 1'e eşit ise "Reminder is 1" yazdırınız.
        //Aksi halde (else) "Reminder is 0" yazdırınız.

        int boluneceksayi= 33;
        if (boluneceksayi%4==3) { System.out.println("Reminder is 3"); }
        if (boluneceksayi%4==2) { System.out.println("Reminder is 2"); }
        else {
            if (boluneceksayi%4==1) {
                System.out.println("Reminder is 1"); }
            else {
                System.out.println("Reminder is 0");
            }
        }

        //Eğer String null (0) değilse ve String uzunluğu 14 ise ve String "i love java" yı kapsıyorsa
        //"String is i love java and 14 character." yazdırınız.
        //Eğer String null(0) değilse ve karakter biçimini (büyük, kücük harf) görmezden gelirse,
        //"String is I love java" yazdırın.

        Scanner cumle=new Scanner(System.in);
        System.out.println("String Giriniz");
        String sentence= giris.nextLine();
        if (sentence != null && sentence.length()==14 && sentence.contains("i love java")) {
            System.out.println("String is I love Java and 14 character");
        }

       // 8- String number oluşturulmuştur.
        // Eğer String € karakterini kapsıyorsa "This is euro" yazdırın.
        //Eğer String $ karakterini kapsıyorsa "This is dollar" yazdırın. Aksi halde (else) "no money" yazdırın.

        String para= cumle.nextLine();
        if (para.contains("€")) {
            System.out.println("This is euro");
        }
        else if (para.contains("$")) {
            System.out.println("This is dollar");
        }
        else {
            System.out.println("no money");
        }

        //9-45 değerinde bir double oluşturun.
        //Eğer double 5'e bölününce kalan 0 ise ve double 8'e bölününce kalan 0 ise
        // "able to divide by 5 and 8" yazdırınız.
        //Eğer double 10'a bölününce kalan 5 ise ve double 9'a bölününce kalan 0 ise
        //"able to divide by 9 and divide by 10 reminder is 5" yazdırınız.

        double kirkbes= 45;
        if (kirkbes%5==0 && kirkbes%8==0) {
            System.out.println("able to divide 5 and 8");
        }
        else if (kirkbes%10==5 && kirkbes%9==0); {
            System.out.println("able to divide by 9 and divide by 10 reminder is 5");
        }

    }
}
