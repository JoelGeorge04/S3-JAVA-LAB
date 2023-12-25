class complex
{
	int real,imag;
	complex(int i, int j)
	{
		real=i;
		imag=j;
	}
	complex sum (complex ob)
	{
	    complex csum = new complex(0,0);
	    csum.imag=ob.imag+imag;
	    csum.real=ob.real+real;
	    return csum;
	}
	
}
class demo
{
	public static void main (String args[])
	{
	    complex b1=new complex(2,3);
	    complex b2=new complex(3,4);
	    complex c3= b1.sum(b2);
	    System.out.println("Sum ="+" "+c3.real+"i"+"+"+c3.imag);
	}
}