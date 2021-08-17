package Gun05;

import java.util.Scanner;

public class _10_Odevler {
    public static void main(String[] args) {

        //1-Bir String oluşturun. Konsol'a isminizi girin.İsminizi yazdırın.
        Scanner inputname= new Scanner(System.in);
        System.out.print("Enter Your Name=");
        String name= inputname.nextLine();
        System.out.println("Your Name = " + name);

        //2- Bir int oluşturun.Konsol'a herhangi bir sayı giriniz.Bu sayıyı yazdırın.
        Scanner inputnumber= new Scanner(System.in);
        System.out.print("Enter a Number=");
        int number= inputnumber.nextInt();
        System.out.println("Your Number = " + number);

        //3- Bir String oluşturun.Konsol'a sevdiğiniz bir meyveyi yazın.O meyveyi yazdırınız.
        System.out.print("Write a fruit you like=");
        String fruit= inputname.nextLine();
        System.out.println("Fruit You Like = " + fruit);

        //4- Bir int oluştur.Konsol'a arabanızdaki kapı sayısını girin.Bu int'i yazdırın.
        System.out.print("How many doors does your car have=?");
        int cardoor= inputnumber.nextInt();
        System.out.println("cardoor = " + cardoor);

        //5- Bir String oluştur.Konsol'a 10 sene önceki yaşadığın şehri yazın.Bu String'i yazdırın.
        System.out.print("Where did you live ten years ago?=");
        String livedCity= inputname.nextLine();
        System.out.println("The City You Lived = " + livedCity);

        //6- Bir string oluşturunuz.Doğum gününüzü konsola giriniz.String'i yazdırınız.
        System.out.print("Enter Your Birthday=");
        String birthday= inputname.nextLine();
        System.out.println("Your Birthday = " + birthday);

        //7- Bir boolean oluşturunuz.Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
        //   Varsa True , yoksa False olarak  konsoldan cevap veriniz.Boolean'ı yazdırınız.
        Scanner inputbank= new Scanner(System.in);
        System.out.print("Do you have a bank account?=");
        boolean bankAccount= inputbank.nextBoolean();
        System.out.println("is bank account = " + bankAccount);

        //8- Bir byte oluşturunuz.Konsola kg cinsinden bir ağırlık yazınız.Byte'ı yazdırınız.
        System.out.print("write your kg=");
        byte weight= inputnumber.nextByte();
        System.out.println("Your Weight = " + weight);

        // 9- Bir float oluşturunuz.Konsola boyunuzu giriniz.Float'ı yazdırınız.
        System.out.print("Write your height=");
        float height= inputnumber.nextFloat();
        System.out.println("Your Height = " + height);

    }
}
