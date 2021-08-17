package Gun17;

public class _05_projedensoru {
    public static void main(String[] args) {
         /*
        String 2D array oluştur

       {{"$12" , "$22" , "5$"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}

       String de $ varsa 3.2 ile çarp

       String de € varsa 4.2 ile çarp

       double return et
          */
        
        String [][] tablo= {{"$12" , "$22" , "5$"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}};
        String str;
        double toplam=0;

        for (int i = 0; i < tablo.length; i++) 
        {
            for (int j = 0; j <tablo[i].length ; j++)
            {
                if(tablo[i][j].contains("$"))
                {
                    str=tablo[i][j].replace("$", "");
                    toplam=+toplam+Integer.parseInt(str)*3.2;
                }

                else
                    {
                        str=tablo[i][j].replace("€", "");
                        toplam=+toplam+Integer.parseInt(str)*4.2;
                    }
            }
        }

        System.out.println("toplam = " + toplam);

    }
}
