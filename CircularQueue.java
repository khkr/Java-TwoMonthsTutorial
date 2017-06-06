import java.util.*;

class CircularQueueImplement
{
	 int size,front=0,rear=0;
	 int index=-1;
	 int queue[]; 
	
	CircularQueueImplement(int m) {

		size = m;
		queue = new int[size]; 
	}

	
    void enqueue(int element)
	{
		if(rear<size)
		{
		queue[rear]=element;
		rear++;

		
	}
	else if (rear>size-1)
	{
		if(front>0){
			rear =0;
			queue[rear++] = element;
			
		}
	}

	}
	 void dequeue()
	{
		front++;
	}

	 void display()
	{
		if(rear>front)
		{
			for(int i=front;i<=rear-1;i++)
			System.out.print(queue[i]+"\t");
		}
		else 
		{
			for(int i=front;i<size;i++)
			System.out.print(queue[i]+"\t");

		    for(int i=0;i<=rear;i++)
			System.out.print(queue[i]+"\t");


		}
		
		System.out.println();
	    
	}
	boolean isFull()
	{
		if((front==0 && rear ==size)|| rear==front-1)
		{
			return true;
		}
		return false;
	}
	boolean isEmpty()
	{
		if(front==rear-1)
			return true;

		return false;
	}

}

public class CircularQueue{
public static void main(String[] args) {
	
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the size of queue");
	int size= scan.nextInt();

	CircularQueueImplement q1 = new CircularQueueImplement(size);

	int choice =1;
	do
	{System.out.println("1.enqueue\n2.dequeue \n3.display \n4.exit");
	choice =scan.nextInt();

	switch(choice)
	{
		case 1:
		if (!q1.isFull()) {
			
		
		  q1.enqueue(scan.nextInt());
		}
		else
			System.out.println("Queue is full cannot input");
		  break;

		 case 2:
		 if (!q1.isEmpty()) {
		 	
		 
		 q1.dequeue();
		}
		else
			System.out.println("Queue is empty ");
		 break;

		 case 3:
		 if(!q1.isEmpty())
		 q1.display();

		 else
		 	System.out.println("Queue is empty nothing to display");
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