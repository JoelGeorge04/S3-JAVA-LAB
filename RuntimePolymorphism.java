import java.util.Scanner;
abstract class area
{
	abstract void area();
}
class circle extends area
{
	void area()
	{
		Scanner s = new Scanner(System.in);
		double r;
		double area;
		double pi = 3.14;
		System.out.println("Enter the radius of the circle: ");
		r = s.nextInt();
		area = pi*r*r;
		System.out.println("the area is "+area);
	}
}
class triangle extends area
{
	void area()
	{
		Scanner s = new Scanner(System.in);
		double height;
		double base;
		double area;
		System.out.println("Enter the length of the triangle: ");
		height = s.nextInt();
		System.out.println("Enter the base of the triangle: ");
		base = s.nextInt();
		area = 0.5*base*height;
		System.out.println("the area is "+area);
	}
}
class rectangle extends area
{
	void area()
	{
		Scanner s = new Scanner(System.in);
		double length;
		double base;
		double area;
		System.out.println("Enter the length of the rectangle: ");
		length = s.nextInt();
		System.out.println("Enter the base of the rectangle: ");
		base = s.nextInt();
		area = length*base;
		System.out.println("the area is "+area);
	}
}
class arearuntime
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		area ref;
		circle a1 = new circle();
		triangle a2 = new triangle();
		rectangle a3 = new rectangle();
		ref = a1;
		ref.area();
		ref = a2;
		ref.area();
		ref = a3;
		ref.area();
	}
}