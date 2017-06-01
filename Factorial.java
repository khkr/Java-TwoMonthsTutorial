import java.io.*;
import java.util.*;

public class Factorial {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.*/
        Scanner in =new Scanner(System.in);
        int n =in.nextInt();
        if(n>=2 && n<=12)
            {
           
        int f;
        f=factorial(n);
        System.out.println(f);
        }
        
    }
  static  int factorial (int n)
  {   
      
      if(n==0)
          return 1;
          else
              {
      int f = n*factorial(n-1);
              return f;
      
          }
      }
  
      
      
  }
    
    
    
    

