

class UnckeckedException2
{

    public static void main(String[] args) 
    {

        try 
        {
            int result = 30 / 0; // Trying to divide by zero
        } 
        
        catch (ArithmeticException e) 
        {
            System.out.println("ArithmeticException caught!");
        }
    }
}