import java.util.Scanner;

public class ArraySearch {
    public static void main(String args[]) {
        int a[] = {5, 7, 8, -2, 3, 4, 10};
        int searchElement, choice;

        SearchMethod searchMethod = new SearchMethod();

        System.out.println("Enter the search Element");
        Scanner input = new Scanner(System.in);


        searchElement = input.nextInt();

        System.out.println("Select a choice:\n1.LinearSearch\n2.Binary Search");

        choice = input.nextInt();

        if (choice == 1)
            searchMethod.linearSearch(a, a.length, searchElement);
        else if (choice == 2)
            searchMethod.binarySearch(a, a.length, searchElement);

        else {
            System.out.println("Wrong option Entered");
        }

    }
}

class SearchMethod {
    void linearSearch(int a[], int size, int searchElement) {
        int k = 5;
        for (int i = 0; i < size; i++) {
            if (a[i] == searchElement) {
                k = 0;
            }

        }

        if (k == 0) {
            System.out.println("Yes " + searchElement + " is present in the Array");
        } else {
            System.out.println("Nope not here");
        }

    }


    void binarySearch(int a[], int size, int searchElement) {

        for (int i = 0; i < size; i++) {

            {
                for (int j = 1; j < size - i; j++) {
                    if (a[j - 1] > a[j]) {
                        int temp = a[j];
                        a[j] = a[j - 1];
                        a[j - 1] = temp;
                    }
                }
            }

        }

        int first = 0, last = size - 1, middle = (first + last) / 2;

        while (first <= last) {
            if (a[middle] < searchElement)
                first = middle + 1;
            else if (a[middle] == searchElement) {
                System.out.println("Yes " + searchElement + " is present in the Array");
                break;

            } else
                last = middle - 1;

            middle = (first + last) / 2;

        }

        if (first > last) {
            System.out.println("Nope Not here");
        }
    }


}