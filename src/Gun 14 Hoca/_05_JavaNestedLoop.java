package Gun17;

public class _05_JavaNestedLoop {
    public static void main(String[] args) {
        // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *****    1.Satırda 5
        // ****     2.Satırda 4
        // ***      3.Satırda 3
        // **       4.Satırda 2
        // *        5.Satırda 1

       for(int satir=5; satir>0;satir--)
       {
           for(int sutun=1;sutun<=satir;sutun++)
               System.out.print("*");

           System.out.println();
       }





    }
}
