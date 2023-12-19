class odd extends Thread
{
	public void run()
	{
		
		for(int i=1;i<=100;i=i+2)
		{
			System.out.println("odd "+i);
		}
	}
}
class even extends Thread
{
	public void run()
	{
		
		for(int i=2;i<=100;i=i+2)
		{
			System.out.println("even "+i);
		}
	}
}
class th
{
	public static void main(String a[])
	{
		odd o=new odd();
		even e=new even();
		o.start();
		e.start();
	}
}