import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        String str,rev="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        str=sc.nextLine();
        int len=str.length();
        for(int i=len-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev))
        {
            System.out.println("The String is palindrome");
        }
        else
        {
            System.out.println("The not String is palindrome");
        }
    }
}