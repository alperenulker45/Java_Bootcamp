package Gun36;

import java.util.Scanner;

public class _04_ThrowExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("kullanici adi giriniz");
        String username = sc.nextLine();

        // throw ile kendimiz hata oluşturuyoruz.
        // böylece kritelerimize girmeyenler için de
        // catch bloğunua düşürerek, paratik kullanım sağlıyoruz.
        // Burada ayrıca programın devamının çalışmasına gerek olmadığı için,
        // break gibi programın devamının çalışmasını engelliyoruz.
        try
        {

            if (username.length()<6)
            {
                throw new Exception("username 6 karakterden az olamaz");
            }
            if (username.length()>10)
            {
                throw new Exception("Username 10 karakterden fazla olamaz");
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}
