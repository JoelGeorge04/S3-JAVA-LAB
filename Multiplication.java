import java.util.*;
class Mulit
{
    public static void  main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows 1st martix");
        int r1=sc.nextInt();
        System.out.println("Enter the number of columns 1st matrix");
        int c1=sc.nextInt();
        System.out.println("Enter the number of rows 2st martix");
        int r2=sc.nextInt();
        System.out.println("Enter the number of columns 2st matrix");
        int c2=sc.nextInt();       
        System.out.println("Enter the 1st martix");
        int a[][]=new int[r1][c1];
        int i,j,k;
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the 2st martix");
        int b[][]=new int[r2][c2];
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        int r3=r1;
        int c3=c2;
        int c[][]=new int[r3][c3];
        if(r1!=c2)
        {
            System.out.println("Multiplication not possible");
        }
        else
        {
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c1;j++)
                {
                    c[i][j]=0;
                }
            }
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c2;j++)
                {
                    for(k=0;k<r1;k++)
                    {
                        c[i][j]+=a[i][k]*b[k][j];     
                    }
                }
            }
            System.out.println("1st Matrix ==>> ");
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c1;j++)
                {
                    System.out.print(a[i][j] +"\t");
                }
                System.out.println();
            }
            System.out.println("2nd Matrix ==>> ");
            for(i=0;i<r2;i++)
            {
                for(j=0;j<c2;j++)
                {
                    System.out.print(b[i][j] +"\t");
                }
                System.out.println();
            }
            System.out.print("Resultant Matrix ==>> ");
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c2;j++)
                {
                    System.out.print(c[i][j] +"\t");
                }
                System.out.println();
            }
        }
    }
}
