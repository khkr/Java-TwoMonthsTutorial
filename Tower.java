import java.util.Scanner;
public class Tower
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);

		int num=scan.nextInt();
		System.out.println("Enter from tower , intermediate tower and to tower");
		char a=scan.next().charAt(0);
		char b=scan.next().charAt(0);
		char c=scan.next().charAt(0);
		scan.close();
		System.out.println("Hanoi tower series is ");
		Hanoi h=new Hanoi();
		h.hanoi(num,a,b,c);
	}
}
class Hanoi
{

	public void hanoi(int num,char first,char intermediate,char last)
	{
		if(num==1)
		{
			System.out.println("Move disc 1 from "+first+" to "+last);
			return;
		}
		hanoi(num-1,first,last,intermediate);
		System.out.printf("Move disk %d from tower %c to tower %c\n",num,first,last);
		hanoi(num-1,intermediate,first,last);
	}
}