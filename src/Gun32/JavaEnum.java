package Gun32;

public class JavaEnum {
    //sirali, secenekleri sabit ve belli, bilinen tum degiskenleri tanimlamak icin.
    // ornegn Aylar, haftanin gunleri vb. sirket icindeki pozisyonlar vs. seyler icin
    //Ayni classta veya farkli class acip yapilabilir.

    enum Aylar {
        OCAK, SUBAT, MART, NISAN, MAYIS, HAZIRAN, TEMMUZ, AGUSTOS, EYLUL, EKIM, KASIM, ARALIK,
    }
    public static void main (String[] args) {

        Aylar ay= Aylar.OCAK;

        switch (ay) {

            case OCAK :
                System.out.println(31);
                break;

            case SUBAT :
                System.out.println(31);
                break;

            case MART :
                System.out.println(31);
                break;

            case NISAN:
                System.out.println(31);
                break;

            case MAYIS:
                System.out.println(31);
                break;

            case HAZIRAN :
                System.out.println(31);
                break;

            case TEMMUZ :
                System.out.println(31);
                break;

            case AGUSTOS :
                System.out.println(31);
                break;

            case EYLUL :
                System.out.println(31);
                break;

            case EKIM :
                System.out.println(31);
                break;

            case KASIM :
                System.out.println(31);
                break;

            case ARALIK :
                System.out.println(31);
                break;

            default :
                System.out.println("Hatali Giris");
        }

        System.out.println("ay = " + ay);
        System.out.println("ay.name() = " + ay.name());
        System.out.println("Bu ayin Enum icindeki sirasi = " + ay.ordinal());//3 veriyor cunku index 0'dan basliyor

    }
}
