

/**
    The program doesn’t compile,
    because the function main() uses FileReader() and BufferedReader() 
    throws a checked exception FileNotFoundException.

    @author Kunal kanse
 */


/*
class CheckedException 
{
    public static void main(String[] args) 
    {
        FileReader file = new FileReader("C:\\test\\a.txt");
        BufferedReader fileInput = new BufferedReader(file);
         
        // Print first 3 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 3; counter++) 
        {
            System.out.println(fileInput.readLine());
        }
        fileInput.close();
    }
}

Output:
    Exception in thread "main" java.lang.RuntimeException: Uncompilable source code - 
    unreported exception java.io.FileNotFoundException; must be caught or declared to be 
    thrown
    at Main.main(Main.java:5)
*/

// solution :

/*
To fix the above program, we either need to specify a list of exceptions using throws, 
or we need to use a try-catch block. We have used throws in the below program
*/

import java.io.*;
 
class CheckedException 
{
    public static void main(String[] args) //throws IOException 
    {

        try
        {
            FileReader file = new FileReader("C:\\test\\a.txt");
            BufferedReader fileInput = new BufferedReader(file);
            
            // Print first 3 lines of file "C:\test\a.txt"
            for (int counter = 0; counter < 3; counter++) 
                System.out.println(fileInput.readLine());
        }

        catch(IOException i)
        {
            System.err.println("IOexception occured");
        }
    
        //fileInput.close();


    }
}