import java.util.Scanner;
import java.lang.*;

public class PageNumber
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int p = scan.nextInt();

		if(p>=1&&p<=n)
		{
			if(n>=1&&n<=100000)
			{
				if(p-1<n-p)
		{
			double n1 = n;
			double p1 = p;
			int sol = (int) Math.ceil((p1-1)/2);
			System.out.println(sol);
		}
		else
		{
			double n1 = n;
			double p1 = p;
			if(n%2==1)
			int sol = (int) Math.floor((n1-p1)/2);
		else
			int sol = (int) Math.ceil((n1-p1)/2);
			
			System.out.println(sol);
		

		}
			}
		}

		
	}
}