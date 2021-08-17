package Odev24Subat;

import java.util.Scanner;

public class _03_Soru3 {
    public static void main(String[] args) {
        //3-  // içinde negatif de olabilen sayının ve para sembolünün olduğu aşağıdaki gibi
        // 3 tane String okutunuz.
        //// okunan bu 3 string içindeki negaitf de olabilen sayıları toplatın.
        //// Toplam pozitif ise toplamı yazdırın, eğer toplam negatif ise sadece -1 yazdırın.
        //// String num1 = "$15";
        //// String num2 = "$-20";
        //// String num3 = "$30";

        Scanner sc=new Scanner(System.in);
        System.out.println("$15 seklinde 3 kez bakiye girisi yapiniz");
        String num1= sc.nextLine();
        String num2= sc.nextLine();
        String num3= sc.nextLine();
        
        String num1para= num1.substring(1, num1.length());
        String num2para= num2.substring(1, num2.length());
        String num3para= num3.substring(1, num3.length());

        int para1= Integer.parseInt(num1para);
        int para2= Integer.parseInt(num2para);
        int para3= Integer.parseInt(num3para);


        if (para1+para2+para3>=0)
            System.out.println("Toplam Para= " + (para1+para2+para3));
        else System.out.println("-1");
        
    }
}
