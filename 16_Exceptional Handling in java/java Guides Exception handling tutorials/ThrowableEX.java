

class ThrowableEX
{
    public static void main(String[] args) 
    {
        try
        {
            throwException(null); 
        }
        catch (Throwable e) 
        {
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getClass());
        }
    }
 
    private static void throwException(String str) throws Throwable
    {
        if(str == null)
        {
            throw new Throwable("String is null.");
        }
    }
}