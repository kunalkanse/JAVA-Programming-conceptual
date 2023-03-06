import java.util.Scanner;

class NegativeNumbers extends Exception
{
    public String toString()
    {
        return "Negative numbers found";
    }
}

class UserDefined
{
    public static void Numbers(int a) throws NegativeNumbers
    {
        if(a < 0)
        {
            throw new NegativeNumbers();
        }
    }
    public static void main(String[] args) 
    {
        try
        {
            UserDefined.Numbers(-10);
        }
        catch(NegativeNumbers n)
        {
            System.out.println(n);
        }
        
    }
}
