import java.util.Scanner;

public class InsertionInput {
public static void main(String[] args)
{
    Scanner in=new Scanner(System.in);
    int arr[]=new int[100];
    int i,j,n,temp;
    System.out.println("enter number of elements");
    n=in.nextInt();
    for(i=0;i<n;i++)
    {
        arr[i]=in.nextInt();
    }
    for(i=1;i<n;i++)
    {
        j=i;
        while(j>0&&arr[j]<arr[j-1])
        {
            temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            j--;
        }


    }
    System.out.println("Sorted array ia");
    for (i=0;i<n;i++)
    System.out.print(arr[i]+"\t");
}
}
