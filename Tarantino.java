import java.util.Scanner;

public class Tarantino {

    public static void main(String args[])
    {
        //We need T,n,may be a double array or a single array in another form

        Scanner in = new Scanner(System.in);

        //Boolean array to display yes or no

        boolean answer[] = new boolean[100];

        //Chapter array to store sequence of chapters

        int chapters[] = new int[500];

        // Number of test cases input;

        int T = in.nextInt();

        if (T>0&&T<=100)
        {

            //This loop is for number of test cases
            for(int j=0;j<T;j++)
            {   answer[j]=true;
                //Number of chapters
                int N = in.nextInt();

                if(N>=2&&N<=100)
                {
                    //We need to enter  chapter series

                    for (int i = 0; i <N; i++) {
                        chapters[i] = in.nextInt();
                        /**
                         * condition 1
                         * checking chapter no should less than no.of chapters
                         */
                        if (chapters[i]>N)
                           answer[j]=false;

                    }
                    /**
                     * condition 2
                     * checking duplicates
                     */
                    for(int i=0;i<N;i++){
                        for (int k=i+1;k<N;k++)
                        {
                            if(chapters[k]==chapters[i])
                                answer[j]=false;

                        }
                    }

                    /**
                     * condition 3
                     * check whether array is in sorted manner
                     */
                    int temp=0;
                    for (int k=0;k<N;k++)
                    {
                        if(chapters[k]==k+1)
                            temp++;
                    }
                    if(temp==N)
                        answer[j]=false;


                }

            }
        }

        for (int i=0;i<T;i++)
        {
            if(answer[i])
                System.out.println("yes");
            else
                System.out.println("no");


        }




    }
}
