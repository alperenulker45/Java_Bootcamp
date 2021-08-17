package Gun07;

public class _12_JavaArithmeticOperators {
    public static void main(String[] args) {
        int a=10;

        int sonuc = a +   ++a   +   a++   +   --a   -    a--;
        //           10      11       11         10         10 => 32
        // sonuc =  10  +    11   +   11    +    10  -      10

        System.out.println("sonuc = " + sonuc); // ? 32
        System.out.println("a = " + a); // 10
        
        int sonuc2= a + ++a;
        System.out.println("sonuc2 = " + sonuc2);
        
        int sonuc3= a + a++;
        System.out.println("sonuc3 = " + sonuc3);
        System.out.println("a = " + a);
    }
}
