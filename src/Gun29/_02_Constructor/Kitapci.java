package Gun29._02_Constructor;

public class Kitapci {
    //// Ayrı bir Book class ı yazınız.fields: name,publishYear,autor.
    //    // 3 adet Consructor ekleyiniz.
    //    // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
    //    // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.

    public static void main(String[] args) {

        Book book1= new Book("Suc ve Ceza", 1878, "Tolstoy");
        Book book2= new Book("Anonim Hikayeler", 1999);
        Book book3= new Book("Kasagi", "Omer Seyfo");

       book1.showInfo();
       book2.showInfo();
       book3.showInfo();

        System.out.println("book1 = " + book1);//hazir bir toString methodu var. onu olusturup bu sekilde direk
        // yazdirma yapabiliyoruz.

        System.out.println("book2 = " + book2);//Book classindan toString methodundan cagirarak her ozelligi yaziyor.
        System.out.println("book3 = " + book3);
    }

}
