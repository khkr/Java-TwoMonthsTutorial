
public class StringTricks {

    public static void main(String args[]){
        String number="25";
        int n=30;
        number =number +n;
        System.out.println(number);
        double x=4.56;
        number=number+x;
        System.out.println(number);

        /**
         * Method to store an integer in a string
         */
        number = String.valueOf(n);


        System.out.println(number);

        /**
         * Method to store a String in an integer
         */
        n = Integer.parseInt(number);

        System.out.println(n);


    }
}
