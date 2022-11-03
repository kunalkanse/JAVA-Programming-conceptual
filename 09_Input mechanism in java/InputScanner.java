import java.util.*;

// Input using scanner class

class InputScanner
{
	public static int Addition(int x,int y)
	{
		return x + y;
	}
	
	public static void main(String args[])
	{
		int iNo1 = 0, iNo2 = 0, Ans = 0;	//local variables
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter first value ");
		iNo1 = sobj.nextInt();
		
		System.out.println("Enter second value ");
		iNo2 = sobj.nextInt();
		
		Ans = Addition(iNo1,iNo2);
		
		System.out.println("Addition is : "+Ans);
	}
	
}