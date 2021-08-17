package Gun27_01_Ornek.Gun27_03_Ornek;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    String name;
    int maxcredit;
    ArrayList<Lesson> dersList;
    
    public int totalCredit ()
    {
        int totalcredit=0;
        for ( Lesson ders : dersList)
        {
            totalcredit += ders.credit;
        }
        return totalcredit;
    }

    public void addLesson (Lesson lesson)
    {


        if ((totalCredit() + lesson.credit <= maxcredit))
        {
            dersList.add(lesson);
            System.out.println (lesson.name +" " + "eklendi");
        }
        else System.out.println("maxCredit gecildi" + " " + lesson.name +" " + "eklenemiyor");
    }
}
