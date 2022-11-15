import java.util.Scanner;

class CommandLine
{
	public static void main(String args[])
	{
		System.out.println("Total number of arguments : "+args.length);
		
		System.out.println("command line arguments are :");
		
		for(int i = 0; i < args.length ; i++)
		{
			System.out.println(args[i]);
		}
	}
}