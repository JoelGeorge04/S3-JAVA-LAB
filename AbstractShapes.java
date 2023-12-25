abstract class shape
{
	abstract void numberofsides();
}

class rectangle extends shape
{
	void numberofsides()
	{
		int sides = 4;
		System.out.println("The number of sides in rectangle are: "+sides);
	}
}

class triangle extends shape
{
	void numberofsides()
	{
		int sides = 3;
		System.out.println("The number of sides in triangle are: "+sides);
	}
}

class hexagon extends shape
{
	void numberofsides()
	{
		int sides = 6;
		System.out.println("The number of sides in hexagon are: "+sides);
	}
}

class shapes
{
	public static void main(String args[])
	{
		rectangle s1 = new rectangle();
		triangle s2 = new triangle();
		hexagon s3 = new hexagon();
		s1.numberofsides();
		s2.numberofsides();
		s3.numberofsides();
		
	}
}
