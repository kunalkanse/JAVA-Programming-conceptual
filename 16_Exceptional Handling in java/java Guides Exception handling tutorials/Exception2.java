

/**
	this program demonstrate use of try ,catch, finally 
	created one user defined exception as AgeInvaliException

	@author Kunal kanse 
 */



class Exception2
{
    //Take input from command line

	public static void main(String[] args) 
    
    {
		System.out.println("Started...");

		try
		{
			int n1=Integer.parseInt(args[0]);
			int n2=Integer.parseInt(args[1]);
			System.out.println("We have got two numbers..");
			int result=n1/n2;
			System.out.println("Division is "+result);

            //for User defined exception 
			if(n2<10)
			{
				throw new AgeInvalidException("My age is invalid !!");
			}

		}

		catch(ArithmeticException e)
		{
			System.out.println("n2 can not be 0 !!");
			System.out.println(e.getMessage());	
		}

		catch (NumberFormatException e) {
			System.out.println("Invalid Numbers !!");
			System.out.println(e.getMessage());	
		}

		catch (AgeInvalidException e) {
			System.out.println("Invalid N2 : " + e);
			System.out.println(e.getMessage());
		}

		catch (Exception e) {
			System.out.println("Error !!");
			System.out.println(e.getMessage());
		}

		finally
		{
			//always gets executed ..
			System.out.println("i am in finally block");
			System.out.println("closing all the resources...");
		}

		System.out.println("Terminated..");
	}
}

// Customized Exception

class AgeInvalidException extends Exception
{

	AgeInvalidException()
	{
		super("Age is invalid !");
	}

	AgeInvalidException(String message)
	{
		super(message);
	}

}
