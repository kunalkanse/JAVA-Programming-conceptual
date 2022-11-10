import userpackage.Addition;
import userpackage.Subtraction;

class Arithmatic
{
	public static void main(String args[])
	{
		
		Addition aobj = new Addition();
		Subtraction sobj = new Subtraction();
				
		int ret = aobj.Add(10,20);
		System.out.println("Addition is : "+ret);
		
		ret = sobj.Sub(20,10);
		System.out.println("subtraction is : "+ret);
	}
}