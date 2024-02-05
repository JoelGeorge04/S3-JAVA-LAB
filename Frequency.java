import java.util.*;
class Frequency
{
    public static void main(String args[])
    {
        String str="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        str=sc.nextLine();
        System.out.println("Enter the character to check frequency");
        char ch=sc.nextLine().charAt(0);
        int len=str.length();
        int count=0;
        for(int i=0;i<len;i++)
        {
            if(str.charAt(i)==ch)
            {
                count++;
            }
        }
        System.out.println("The frequency of "+ch +"= " + count);
    }
}