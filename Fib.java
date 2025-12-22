import java.io.*;
class Fib
{
    public static void main(String [] args)
    {
        int a=0;
        int b=1;
        int c;
        int i;
        int sum=0;
        for(i=1;i<=5;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
            if(c%2==0)
            {
                sum=sum+c;
            }
        }
        System.out.println("the sum of even numbers is"+ sum);
    }
}