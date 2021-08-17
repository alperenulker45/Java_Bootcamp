package Gun07;

public class _13_Odevler {
    public static void main(String[] args) {
        // 1- Crete a String which is :  "made to order" change the e to K   ,  print the result
        String text="made to order";
        System.out.println("text.replace(\"e\", \"K\") = " + text.replace("e", "K"));

        //2- Create a String which is : London
        // Make the String upper case, Print the String.
        String city="London";
        System.out.println("city.toUpperCase() = " + city.toUpperCase());

        //3- Create a String which is : NEW YORK
        // Make the String lower case,  Print the String.
        String city2= "NEW YORK";
        System.out.println("city2.toLowerCase() = " + city2.toLowerCase());

        //4- Create a String which is $52.00
        // remove $ sign , print the String.
        String money= "$52.00";
        System.out.println("money.replace(\"$\", \"\") = " + money.replace("$", ""));

        //5- Create a String which is :"     Techno Stuu    dyy       "
        //   remove the spaces from the beginning and end of the string
        //   print the string.
        String text2= "     Techno Stuu    dyy       ";
        System.out.println("text2.trim() = " + text2.trim());

    }
}
