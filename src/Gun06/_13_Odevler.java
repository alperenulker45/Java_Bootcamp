package Gun06;

import java.util.Scanner;

public class _13_Odevler {
    public static void main(String[] args) {
        //1- Create a string which is city where you live
        //   Create a String which is you born.
        //   Verify first string equal to second string or not.
            String cityLived= "istanbul";
            String cityBorn= "Balikesir";
            boolean is= cityLived.equals(cityBorn);
        System.out.println("equals = " + is);
        
        //2- Create a String which is INLINE CODE
        //   Create a String which is inline CODE
        //   verify is the first is equal to  second string
        Scanner input= new Scanner(System.in);
        System.out.print("String Giriniz");
        String str1= input.nextLine();
        System.out.print("String Giriniz");
        String str2= input.nextLine();
        boolean equals= str1.equals(str2);
        System.out.println("equals = " + equals);

        
        //3- Create a String which is INLINE CODE
        //   Create a String which is inline CODE
        //   verify is the first is equal to second string
        //   Note: ignore the case upper case or lower case
        Scanner input3= new Scanner(System.in);
        System.out.print("String Giriniz");
        String str3= input3.nextLine();
        System.out.print("String Giriniz");
        String str4= input3.nextLine();
        boolean isequals= str3.equalsIgnoreCase(str4);
        System.out.println("equals = " + isequals);
        
        
        //4-  Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,  
        // ad ayrı soyad ayrı şekilde ekrana yazdırınız.
        Scanner input4= new Scanner(System.in);
        System.out.print("Ad Soyad Giriniz");
        String adSoyad= input4.nextLine();
        int bosluk=adSoyad.indexOf(" ");
        String adi= adSoyad.substring(0, bosluk);
        String soyadi= adSoyad.substring(bosluk+1);
        System.out.println("adi = " + adi);
        System.out.println("soyadi = " + soyadi);
        
        
        //5-  Kullanıcıdan alacağınız 3 kelimelik ismin her kelimesini ayırarak ayrı ayrı yazdırınız. Örn: Ahmet Emin Yıldız
        System.out.print("3 kelimeli isim giriniz=");    
        String isimuclu= input.nextLine();
        int ilkbosluk= isimuclu.indexOf(" ");
        String ilkad= isimuclu.substring(0, ilkbosluk);
        int ikincibosluk= isimuclu.lastIndexOf(" ");
        String ikinciisim= isimuclu.substring(ilkbosluk, ikincibosluk);
        String ucuncuisim= isimuclu.substring(ikincibosluk);
        System.out.println("ilkad = " + ilkad);
        System.out.println("ikinciisim = " + ikinciisim);
        System.out.println("ucuncuisim = " + ucuncuisim);
        
        //6-  Kullanıcıdan alacağını bir stringde boşulk karakterinin olup olmadığını kontrol ediniz.
        System.out.print("String Giriniz=");
        String random= input.nextLine();
        System.out.println("bosluk var mi? = " + random.contains(" "));
        
        //7-  Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi  Örn. Ahmet Emin Yılmaz -> A.E.Y. formatıyla yazdırınız.
        System.out.print("3 kelimeli isim giriniz=");
        String ad3lu= input.nextLine();
        char ilkharf= ad3lu.charAt(0);
        int ilkbosyer= ad3lu.indexOf(" ");
        char ikinciharf= ad3lu.charAt(ilkbosyer+1);
        int sonbosyer= ad3lu.lastIndexOf(" ");
        char ucuncuharf= ad3lu.charAt(sonbosyer+1);
        System.out.println("Adin Bas Harfleri = " + ilkharf+"."+ikinciharf+"."+ucuncuharf+".");


        
    
    }
}
