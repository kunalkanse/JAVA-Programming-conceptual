import java.util.Scanner;

class CommandLineADD
{
	public static void main(String args[])
	{
		//parseInt = converts argument to a string
		
		int no1 = Integer.parseInt(args[0]);
		int no2 = Integer.parseInt(args[1]);
		
		int ans = no1 + no2;
		
		System.out.println("Addition is : " +ans);
	}
}