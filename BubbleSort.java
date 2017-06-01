import java.util.Scanner;

public class BubbleSort {

    public static void main(String args[])
    {
        int a[]=new int[50];
        int n,i,j;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no of elements");
        n=in.nextInt();
        for(i=0;i<n;i++)
            a[i]=in.nextInt();
        for(i=0;i<n;i++)
        {
            for (j=1;j<n-i;j++){
                if(a[j-1]>a[j]){
                    int temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }



            }

        }
        System.out.println("The elements after sorting are :");
        for(i=0;i<n;i++)
            System.out.print(a[i]+"   ");
    }
}
