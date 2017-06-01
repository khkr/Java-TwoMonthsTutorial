
public class SelectionSort {
public static void main(String[] args)
{
    int a[]={55,66,34,88,11,5,-1};
    int n=a.length,i,j,position;
    /**
     * Selection sort
     */
    for (i=0;i<n-1;i++)
    {

        position =i;
        for(j=i+1;j<n;j++)
        {
            if (a[i]>a[j]&&a[position]>a[j])
            {
                position = j;
            }
        }
        if(position !=i)
        {
            int temp = a[i];
            a[i] = a[position];
            a[position]=temp;
        }
    }

    System.out.println("Sorted array is:");

    for (i=0;i<n;i++)
    {
        System.out.print(a[i]+"\t");
    }
    System.out.println();



}
}
