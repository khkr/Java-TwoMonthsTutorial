import java.util.Scanner;

public class InputArray {
    public static void main(String[] args){
        int x[]= new int[100];
        Scanner s= new Scanner(System.in);
        System.out.println("enter no of elements");
        int n;
        n=s.nextInt();
        System.out.println("enter the elemnts");
        for(int i=0;i<n;i++)
            x[i]=s.nextInt();

        System.out.println("Displaying the entered elements");
        for(int i=0;i<n;i++)
            System.out.println(x[i]);
    }
}
