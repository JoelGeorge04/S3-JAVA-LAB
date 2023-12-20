class fina
{
	public static void main(String arg[])
	{
		try
		{
			int a=4;
			int b=0;
			int c;
			c=a/b;
			System.out.println(c);
		}
		finally
		{
			System.out.println("Finally block"); //will ne executed anyway. 
		}
		System.out.println("Rest of the code");
	}
}