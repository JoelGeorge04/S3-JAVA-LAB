import java.io.*;
class Bread
{
	public static void main(String args[]) throws IOException
	{
	char ch;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter 'q' to quit"); 
	do
	{
		System.out.println("Enter the character");
		ch=(char) br.read();
		System.out.println(ch);
	
	}while(ch!='q');
	}
 
}