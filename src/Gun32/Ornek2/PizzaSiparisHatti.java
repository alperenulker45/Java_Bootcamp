package Gun32.Ornek2;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {
    // Bir pizza sipariş hattı yapılmak isteniyor.
    // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Isleme Al
    // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
    // bir ARRAYLIST e atınız.
    // ISLEME AL (4) ü seçtiğinde her pizzadan kaçar tane sipariş
    // verdiğini bir metodda yazdırınız.

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int secim=0;
        int miktar=0;
        ArrayList<Siparis> siparis = new ArrayList<>();
        do {
            Menu();
            System.out.println("Seciminiz: ");
            secim= sc.nextInt();

            switch (secim)
            {
                case 1 :
                        System.out.println("Miktar Giriniz: ");
                        miktar = sc.nextInt();
                        Siparis siparis1=new Siparis(miktar, PizzaSize.SMALL);
                        siparis.add(siparis1);
                         break;

                case 2 :
                        System.out.println("Miktar Giriniz: ");
                        miktar = sc.nextInt();
                        Siparis siparis2=new Siparis(miktar, PizzaSize.MEDIUM);
                        siparis.add(siparis2);
                        break;

                case 3 :
                        System.out.println("Miktar Giriniz: ");
                        miktar = sc.nextInt();
                        Siparis siparis3=new Siparis(miktar, PizzaSize.LARGE);
                        siparis.add(siparis3);
                        break;

                case 4 :
                        SiparisYaz(siparis);
                    break;
                default:
            }

        }while (secim<5);

    }

    public static void Menu () {
        System.out.println("****PIZZA MENU****\n 1-Small\n 2-Medium\n 3- Large\n 4- Isleme Al\n 5-Cikis");
    }

    public static void SiparisYaz(ArrayList<Siparis> siparisler)
    {
        siparisler.forEach(System.out::println);
    }
}
