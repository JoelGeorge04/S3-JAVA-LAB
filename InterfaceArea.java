import java.util.Scanner;
interface area
{
	double pi = 3.14;
	void calc_area();
}
class triangle implements area
{
	public void calc_area()
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
class circle implements area
{
	public void calc_area()
	{
		Scanner s = new Scanner(System.in);
		double r;
		double area;
		System.out.println("Enter the radius of the circle: ");
		r = s.nextInt();
		area = pi*r*r;
		System.out.println("the area is "+area);
	}
}
class rectangle implements area
{
	public void calc_area()
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
class interfacearea
{
	public static void main(String args[])
	{
		circle c1 = new circle();
		c1.calc_area();	
		rectangle r1 = new rectangle();
		r1.calc_area();
		triangle t1 = new triangle();
		t1.calc_area();
	}
}