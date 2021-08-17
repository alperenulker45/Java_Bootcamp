package Gun12;

public class _01_WhileLoop {
    public static void main(String[] args) {
        //ekrana 5 kez merhaba yazdiriniz.

        int count=0;

        while (count<5) {
            System.out.println("Merhaba");
            count++;//count=count+1 yerine kullandik. count+=1 de yapilabilir.
        }
    }
}
