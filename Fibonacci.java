import java.util.*;
class Fibonacci
{
    public static void main(String args[])
    {
        int a=0,b=1,c,i,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        n=sc.nextInt();
        System.out.println("Fibonacci Series ==>>");
        System.out.println();
        System.out.print(a+" "+b+" ");
        for(i=3;i<=n;i++)
        {
            c=a+b;
            System.out.print(c +" ");
            a=b;
            b=c;
        }
    }
}