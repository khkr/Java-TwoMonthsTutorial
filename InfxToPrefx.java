import java.util.Scanner;

public class InfxToPrefx
{
    static int max = 50;
    static char stack[] =new char[max];
    static int top =-1;

    static int pr(char elem)
    {
        switch(elem)
        {
            case '#':
                return 0;


            case ')' :
                return 1;


            case '+':
            case'-':
                return 2;


            case '*' :
            case '/' :
                return 3;

        }
        return 0;
    }

    static char pop()
    {
        return stack[top--];
    }

    static void push(char elem)
    {
        top++;
        stack[top] = elem;
    }

    public static void main(String[] args)
    {
        char infixChar[] = new char[50];
        char tempChar[];
        char prefix[] = new char[50];

        int i=0,k=0;

        char ch,elem ;

        push('#');

        Scanner in = new Scanner(System.in);
        System.out.println("Enter infix expression");
        String temp1 = in.nextLine();



        temp1 =new StringBuilder(temp1).reverse().toString();

        tempChar = temp1.toCharArray();//Reverse of infix

        for(i=0;i<tempChar.length;i++)
        {
            infixChar[i] = tempChar[i];
        }

        System.out.println(infixChar);


        while(infixChar[i]!='\0') {

            ch = infixChar[i];
            i++;
            if (ch == ')')
                push(ch);
            else if (Character.isDigit(ch)) {
                prefix[k++] = ch;

            } else
                if (ch == '(')

            {
                while (stack[top] != ')') {
                    prefix[k++] = pop();

                }
                elem = pop();

            } else {

                while (pr(stack[top]) > pr(ch)) {
                    prefix[k++] = pop();
                }
                push(ch);
            }
            System.out.println(i);
        }

            while(stack[top]!='#')
            {
                prefix[k++]=pop();

            }
            prefix[k]='\0';

            System.out.println(prefix);
            //reverse(infixChar);
            temp1 =new StringBuilder(temp1).reverse().toString();
            infixChar = temp1.toCharArray();//Reverse of infix

            //reverse(prefix);

            String temp2 = new String(prefix);

            temp2 =new StringBuilder(temp2).reverse().toString();
            prefix = temp2.toCharArray();//Reverse of infix

            System.out.println(prefix);



        }





    }














