import java.util.Scanner;

public class PositionSearch {
public static void main(String args[])
{
    /**
     * Input:
     * In this program we take
     * n = number of integers in the array
     * a[n] = n integers are inserted
     * s = search element
     *
     * Output:
     * current position of the search element
     * sorted array
     * new position of the search element in the sorted array
     */
    Scanner in=new Scanner(System.in);

    int a[]=new int[100];

    int n,i,j,s ='\0',temp,count = 0;
    n=in.nextInt();
    for (i=0;i<n;i++)
    {
        a[i]=in.nextInt();
    }


    /**
     * The label is used so that we can searchElement again if the previous searchElement was not in the array
     */
    searchAgain:for (int k=0;k<=1;k++) {
        s = in.nextInt();
        for (i = 0; i < n; i++) {
            if (s == a[i]) {
                count = i + 1;
                break;
            }
        }

        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("Enter a search element present in the array:");
            continue searchAgain;
        }
    }





    for (i=1;i<n;i++)
    {
        j=i;
        while(j>0&&a[j]<a[j-1])
        {
            temp=a[j];
            a[j]=a[j-1];
            a[j-1]=temp;
            j--;
        }

    }
    for(i=0;i<n;i++)
    {
        System.out.print(a[i]+"\t");
    }
    System.out.println();
    //binary search


    int first=0,last=n-1,middle=(first+last)/2;
    while (first<=last)
    {
        if(s<a[middle])
        {
            last=middle-1;
        }
        else if(s==a[middle])
        {
            System.out.println(middle+1);
            break;

        }
        else
        {
            first=middle+1;

        }

        middle=(first+last)/2;
    }


}
}
