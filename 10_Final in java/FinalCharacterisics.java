
// if the characteristics is declared as final then we cannot cahngethe value of that characteristics


class FinalCharacterisics
{
	public static void main(String args[])
	{
		Demo obj = new Demo();
		
		System.out.println("Value of i = "+obj.i);
		
		// obj.i++; // Error
		obj.j++;
	}
}

class Demo
{
	public final int i;	// as variable i is final we cannot change it
	public int j;
	
	public Demo()
	{
		i = 10;
		j = 20;
	}
}
