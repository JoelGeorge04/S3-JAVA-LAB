class odd implements Runnable
{
	public void run()
	{
		for(int i=1;i<100;i=i+2)
		{
			System.out.println(i);
		}
	}
}
class even implements Runnable
{
	public void run()
	{
		for(int i=2;i<100;i=i+2)
		{
			System.out.println(i);
		}
	}
}
class th1
{
	public static void main(String a[])
	{
		odd o=new odd();
		even e=new even();
		Thread t1=new Thread(o);
		Thread t2=new Thread(e);
		t1.start();
		t2.start();
	}
}