public import java.io.*;
class showfile
{
	public static void main(String args[]) throws IOException
	{
	    int i;
	    FileInputStream fin,fout;
	    try
	    {
	    	fin=new FileInputStream(args[0]);//mention your file name
	    }
	    catch(FileNotFoundException e)
	    {
	    	System.out.println("File missing");
	    	return;
    	}
    	catch(ArrayIndexOutOfBoundsException e)
	    {
	    	System.out.println("specify name ");
	    	return;
    	}
	    try
	    {
	    	FileOutputStream fout= new FileOutputStream(args[1]); //mention your file name
	    }
	    catch(FileNotFoundException e)
	    {
	    	System.out.println("Error in opening file");
	    	return;
	    }
	    catch(ArrayIndexOutOfBoundsException e)
	    {
    		System.out.println("specify filename ");
	    	return;
	    }
	    try
	    {
	 do
	    {
		    i=fin.read();
		    if(i!=-1)
		    fout.write(i);
		    System.out.println((char)i);
	    }while(i!=-1);
	    }
    	catch(IOException e)
    	{
    		System.out.println("file error ");
	
    	}
	    fin.close();
	    fout.close();
	}
} 
    

