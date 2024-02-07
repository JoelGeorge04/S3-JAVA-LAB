import java.util.*;
class PrimeInRange
{
    public static void main(String args[])
    {
        int i,j,flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower limit ");
        int low=sc.nextInt();
        System.out.println("Enter the upper limit ");
        int high=sc.nextInt();
        System.out.println("Prime in Range ==>>");
        for(i=low;i<=high;i++)
        {
            flag=0;
            for(j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.print(i+"\t");
            }
        }
    }
}