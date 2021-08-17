package Gun06;

public class _09_StringisEmpty {
    public static void main(String[] args) {
        //Stringin bos olup olmadigini boolean olarak gosterir.
        String s1="Merhaba";
        System.out.println("s1.isEmpty() = " + s1.isEmpty());

        String s2="";
        System.out.println("s2.isEmpty() = " + s2.isEmpty()); //bos string..

        String s3=" ";
        System.out.println("s3.isEmpty = " + s3.isEmpty()); // burada bosluk karakteri var ve bos degil gosterir

    }
}
