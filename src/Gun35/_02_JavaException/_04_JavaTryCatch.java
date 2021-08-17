package Gun35._02_JavaException;

public class _04_JavaTryCatch {
    public static void main(String[] args) {

        String str = "";
        int a = 5;
        int b = 0;
        int c = 0;

        //Catch bloklarindan hangi hata once geliyorsa ona uygun hata adi yazilir, genel Exception en sona yazilir.

        try {
            System.out.println("1.Adim");
            char ilkharf = str.charAt(0);//burda hata olusacak.
            System.out.println("2. Adim");
            c = a / b;//
            // burda aritmetik hata verecek ama try icinde ilk hata yukarda oldugundan artik burasi zaten calismaz.
            //Bu hatayi da ayrica almak icin bunu ayri try icine almak lazim.
            System.out.println("3. Adim");
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("4.adim");
            System.out.println("Hata : String Dizisi Asildi");
        } catch (ArithmeticException ex) {

            System.out.println("Aritmetik islem hatasi");
        } catch (Exception ex) // Hangi hata olursa olsun genel Exception ex calisir.
        {
            System.out.println("Hata : Genel Hata Olustu");
        }

        System.out.println("Program Sonu");
    }

}
