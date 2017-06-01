
public class InsertionSort {
    public static void main(String[] args)
    {
        int arr[]={44,65,11,22,87};

        //WE are going to sort it in Insertion sort manner

        int i,j,k,n,temp;

        n = arr.length;

        for (i = 1;i<n; i++) {

            j=i;

            while (j > 0 && arr[j]<arr[j-1]) {

                //swap those numbers

                temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }


        }

        System.out.println("sorted array");
        for (i=0;i<n;i++)
            System.out.print(arr[i]+"\t");
        System.out.println();


    }
}
