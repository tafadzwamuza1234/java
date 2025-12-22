import  java.util.Scanner;
import java.io.*;
class  Prime
{
    public static void main(String [] args)
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
       int  n= sc.nextInt();
        int i;
        int count=0;
        for(i=1;i<=n;i++)
        {
            if (n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println(n +" is a prime number");
        }
        else 
        {
            System.out.println("is not a prime number");
        }
    }
}