// Java program implementing Singleton class
// with using  getInstance() method

class Singleton 
{
    // Static variable reference of single_instance

    private static Singleton single_instance = null;
    
    // creating private constructor
    // restricted to this class itself
    
    private Singleton()
    {
        System.out.println("Inside Constructor");
    }
 
    // Static method to create instance of Singleton class
    public static Singleton getInstance()
    {
        if (single_instance == null)
        {
            single_instance = new Singleton();
        }
  
        return single_instance;
    }
}

class Singleton_Demo 
{
    public static void main(String args[])
    {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();
  
        System.out.println("\nHashcode of x is " + x.hashCode());
        System.out.println("Hashcode of y is "  + y.hashCode());
        System.out.println("Hashcode of z is " + z.hashCode());
  
        // Condition check
        if (x == y && y == z) 
        {
            System.out.println("\npoints to same memory");
        }
        else 
        {
            System.out.println("\nDO NOT point to the same memory");
        }
    }
}
