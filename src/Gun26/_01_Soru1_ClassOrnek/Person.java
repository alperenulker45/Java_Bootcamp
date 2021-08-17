package Gun26._01_Soru1_ClassOrnek;

public class Person {

    String name;
    String surname;
    int age;

    public void bilgiYazdir() {
        System.out.println("kisi.name = " + name);
        System.out.println("kisi.surname = " + surname);
        System.out.println("kisi.age = " + age);
    }

    public void getBirthYear()
    {
        System.out.println(name +" " + (2021-age));
    }

    public void getInitials ()
    {
        System.out.println(name.toUpperCase().charAt(0)+"."+surname.toUpperCase().charAt(0));
    }


}

