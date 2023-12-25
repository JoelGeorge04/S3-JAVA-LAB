import java.util.*;
class Exception
{
	
		void rec(int b)
		{
			if(b%2!=0)
			{
				throw new ArithmeticException();
			}
			else
			{
			System.out.println(b+" is an even number");
			}
		}
}
class demo
{
	public static void main(String args [])
	{
		Exception a = new Exception();
		a.rec(33);
	}

} 

