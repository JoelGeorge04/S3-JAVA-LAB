class First extends Thread
{
	public void display()
	{
		for(int i=1;i<=5;i=i+1)
		{
			System.out.println(i);
		}
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)	
		{
            System.out.println("Exception");
		}
		
	}
}
class second extends Thread
{
	First fobj;
	second(First f)
	{
		fobj=f;
	}
	public void run()
	{
		fobj.display();
	}
}
class sync
{
	public static void main(String a[])
	{
		First f=new First();
		second s1=new second(f);
		second s2=new second(f);
		second s3=new second(f);
		s1.start();
		s2.start();
		s3.start();
	}
}