import java.util.*;

class ClassImplementsInterface
{
	public static void main(String args[])
	{
		float R = 0, fRet = 0;
		
		CircleAreaCircum cac = new CircleAreaCircum();
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the redius : ");
		R = sobj.nextFloat();
		
		
		fRet = cac.Area(R);
		System.out.println("Area is : "+fRet);
		
		fRet = cac.Circumference(R);
		System.out.println("Circumference is : "+fRet);
		
		System.out.println("Value of Pi : "+Circle.pi);	//static by default
		
		//Circle.pi = 6.14f;	//error: cannot assign a value to final variable pi
	}
}

interface Circle
{
	float pi = 3.14f;
	
	float Area(float redius);
	float Circumference(float redius);
}

class CircleAreaCircum implements Circle	// class implementing interace
{
	public float Area(float redius)
	{
		return pi*redius*redius;
	}
	
	public float Circumference(float redius)
	{
		return 2*pi*redius;
	}
}
