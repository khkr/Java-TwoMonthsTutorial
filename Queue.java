import java.util.*;

class QueueImplement
{
	 int size,front=0;
	 int index=-1;
	 int queue[]; 
	

	

	QueueImplement(int m) {

		size = m;
		queue = new int[size]; 
	}

	
    void enqueue(int element)
	{


		queue[++index]=element;


	}
	 void dequeue()
	{
		front++;
	}

	 void display()
	{
		if(index>-1)
		{
		for(int i=front;i<=index;i++)
		{
			System.out.print(queue[i]+"\t");
		}
		System.out.println();
	}
	}

}

public class Queue{
public static void main(String[] args) {
	
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the size of queue");
	int size= scan.nextInt();

	QueueImplement q1 = new QueueImplement(size);

	int choice =1;
	do
	{System.out.println("1.enqueue\n2.dequeue \n3.display \n4.exit");
	choice =scan.nextInt();

	switch(choice)
	{
		case 1:
		  q1.enqueue(scan.nextInt());
		  break;

		 case 2:
		 q1.dequeue();
		 break;

		 case 3:
		 q1.display();
		 break;
		 case 4:
		 break;
		 default:
		 System.out.println("enter a valid number");
		 break;
    }

	}while(choice!=4);


}

}

