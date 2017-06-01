import java.util.Scanner;

public class NewString {

    //int
    //float
    //byte
    //long
    //double
    //boolean
    //char

    public static void main(String args[])
    {

        /**
         * String is a derived data type
         * **/

        String hi = "This is awesome";

        System.out.println(hi);

        /**
         * Appending the hi string i.e. adding text to the string
         */
        hi= hi+ " and I know it";

        /**
         * Printing out the appended string
         */
        System.out.println(hi);



        /**
         * Getting String from user
         */

        String great;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a line:");
        great = in.nextLine();
        System.out.println(great);



    }




}
