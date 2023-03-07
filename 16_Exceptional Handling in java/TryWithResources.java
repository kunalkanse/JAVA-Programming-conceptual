
import java.io.*;
import java.util.*;

// when we use try with resources the resources will gets automatically closed
// so we dont need finally block to release resources

public class TryWithResources
{
    
    static void Divide() throws Exception
    {
 
        try(FileInputStream fi=new FileInputStream("Test.txt");Scanner sc=new Scanner(fi) )
        {
          int a=sc.nextInt();
          int b=sc.nextInt();
          int c=sc.nextInt();
          System.out.println(a/c);
        }
        
    }
    
    public static void main(String[] args) throws Exception
    {
        try
        {
          Divide();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        //int x=sc.nextInt();
        
       // System.out.println(x);
        
    }
    
}
