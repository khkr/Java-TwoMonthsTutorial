import java.util.Scanner;

public class GetInput
{
	public static void main(String[] args) {
		
		int a,b;

		
		Scanner s= new Scanner(System.in);

		System.out.println("Enter a number:");

		a = s.nextInt();
		b = s.nextInt();


		System.out.println("The number is :"+a +" "+b);
	}
}