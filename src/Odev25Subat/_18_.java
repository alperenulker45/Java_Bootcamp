package Odev25Subat;

public class _18_ {
    public static void main(String[] args) {
        //18-Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        //$ işaretlerini kaldırın ve sayıları toplayın.
        //Sayıların toplamını yazdırın.

        String [] dizi= {"$12", "$23", "$10", "$2", "$5", "$2"};
        int toplam=0;
        String str="";
        for (int i=0; i< dizi.length; i++)
        {
            if (dizi[i].contains("$"))
            {
            str=dizi[i].replace("$", "");
            toplam+=Integer.parseInt(str);
            }
        }
        System.out.println("toplam= " + toplam);
    }
}
