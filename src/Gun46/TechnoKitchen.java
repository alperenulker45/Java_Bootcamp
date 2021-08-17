package Gun46;

import java.util.ArrayList;
import java.util.Scanner;

public class TechnoKitchen {

    public static void siparisal () {
        ArrayList<IFood> orders = new ArrayList<>();
        ArrayList<Integer> adet = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int secim;
        do {
            showMenu();
            secim= sc.nextInt();
            switch (secim) {
                case 1 : AdanaKebap adana = new AdanaKebap();
                    System.out.println("Kac Adet Istersiniz?");
                    adet.add(sc.nextInt());
                    orders.add(adana);
                    break;
                case 2: Lahmacun lahmac = new Lahmacun();
                    System.out.println("Kac Adet Istersiniz?");
                    adet.add(sc.nextInt());
                    orders.add(lahmac);
                    break;
                case 3: Borsh borsh = new Borsh();
                    System.out.println("Kac Adet Istersiniz?");
                    adet.add(sc.nextInt());
                    orders.add(borsh);
                    break;
                case 4: Palov palov = new Palov();
                    System.out.println("Kac Adet Istersiniz?");
                    adet.add(sc.nextInt());
                    orders.add(palov);
                    break;
            }
        }while (secim!=0 && secim<5);

        System.out.println("****Alinan Siparisler****");
        for (int i=0; i<adet.size(); i++) {
            System.out.println(adet.get(i) +" " + orders.get(i).getClass().getSimpleName());
        }

        System.out.println("******************************");
        for (IFood f : orders) {
            if (f instanceof AdanaKebap) {
                System.out.println(f.getClass().getSimpleName());
                ((AdanaKebap) f).marinade();
                ((AdanaKebap) f).grill();
                f.taste();
                System.out.println("******************************");
            }

            if (f instanceof Lahmacun) {
                System.out.println(f.getClass().getSimpleName());
                ((Lahmacun) f).dough();
                ((Lahmacun) f).addmeat();
                ((Lahmacun) f).bake();
                f.taste();
                System.out.println("******************************");
            }

            if (f instanceof Borsh) {
                System.out.println(f.getClass().getSimpleName());
                ((Borsh) f).boil();
                ((Borsh) f).eattomorrow();
                f.taste();
                System.out.println("******************************");
            }

            if (f instanceof Palov) {
                System.out.println(f.getClass().getSimpleName());
                ((Palov) f).fry();
                ((Palov) f).boil();
                f.taste();
                System.out.println("******************************");
            }
        }
        int toplamucret=0;
        for (int i=0; i<adet.size(); i++) {
            toplamucret+= adet.get(i)*orders.get(i).ucret();
        }

        System.out.println("toplamucret = " + toplamucret + "TL");

    }

    public static void showMenu () {
        System.out.println("""
                ****Menü****
                1-Adana Kebap (5)
                2-Lahmacun (3)
                3-Borsh (3)
                4-Palov (4)
                0-Tamam""");
    }
    
}
