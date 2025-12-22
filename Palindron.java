import java.io.*;
class Palindron
{
    public static void main(String [] args)
    {
        int reverse=0;
        int digit;
        int n=121;
        int temp=n;
        while(n>0)
        {
            digit = n%10;
            reverse= reverse*10+digit;
            n = n/10;
        }
        if(reverse==temp)
        {
            System.out.println("palindrome");
        }
    }
}