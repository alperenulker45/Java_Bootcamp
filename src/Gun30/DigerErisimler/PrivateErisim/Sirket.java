package Gun30.DigerErisimler.PrivateErisim;

public class Sirket {
    public static void main(String[] args) {

        Calisan isci = new Calisan();
        isci.id=1;
        isci.name="Ali";
        isci.surName="Demir";
        //isci.password="1234";//bu su an public oldugu icin herkesin gorunumune acik olur. bu yuzden private yapip
        //sinirli erisim vermemiz gerekir. Ayrica sifre belirlemede kullaniciya tamamen serbestlik birakmak
        //guvenlik acigi olusturur. O yuzden en az 8 karakter vb. sartlar koymak gerekir.

        isci.sifreBelirle("1a4Uf_67dgh");
        //isci.password yapamiyoruz cunku o private. Bir metod uzerinden belli sartlarla sifreyi giriyor kullanici.

        isci.sifreGoster();
    }
}
