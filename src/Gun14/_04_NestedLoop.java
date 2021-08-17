package Gun14;

public class _04_NestedLoop {
    public static void main(String[] args) {
// Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *
        // **
        // ***
        // ****
        // *****

        for (int satir=1; satir<=5; satir++)
        {
            for (int sutun=1; sutun<=satir; sutun++)
                System.out.print("*");

            System.out.println();

        }

    }
}
