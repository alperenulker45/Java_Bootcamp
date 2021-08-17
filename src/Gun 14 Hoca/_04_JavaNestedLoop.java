package Gun17;

public class _04_JavaNestedLoop {
    public static void main(String[] args) {
        // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *        1.Satırda 1 yıldız
        // **       2.satırda 2 yıldız
        // ***      3.satırda 3 yıldız
        // ****     4.satırda 4 yıldız
        // *****    5.satırda 5 yıldız


        for(int satir=1;satir<=5;satir++)
        {

            for(int sutun=1;sutun<=satir;sutun++)
                System.out.print("*");

            System.out.println();
        }
    }
}
