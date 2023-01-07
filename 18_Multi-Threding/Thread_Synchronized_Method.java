import java.lang.*;

class Demo extends Thread
{

	synchronized void Display()
	{
		for(int i = 0;i<=100;i++)
		{
			System.out.println("Thread :" + this.getName() + " :"+i);
		}		
	}

	// This method is considered as thread code
	public void run()
	{
		Display();
	}
}

class Thread_Synchronized_Method
{
	public static void main(String args[])
	{
		// Creating object of demo class which extends thread class
		Demo d1 = new Demo();		
		Demo d2 = new Demo();

		// Create Thread class object and attach to above object		
		Thread t1  = new Thread(d1,"First");
		Thread t2 = new Thread(d2,"Second");

		System.out.println("Inside main");

		// Start the execution of thread
		t1.start();
		t2.start();
	}
}