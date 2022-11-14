

import java.io.*;

/**
 * This class demonstrate how Exception Handling Works

    Read file from some location, if a file does not exist in a given location this code throws IOException or FileNotFoundException.  
    @author Kunal kanse
 *
 */
class ExceptionHandler 
{

    public static void main(String[] args) 
    {
        exception_Handler();
    }

    private static void exceptionWithoutHandler() throws IOException 
    {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("/invalid/file/location")))) 
        {
            System.out.println("Inside exceptionWithoutHandler()");

            int c;
            // Read and display the file.
            while ((c = reader.read()) != -1) 
            {
                System.out.println((char) c);
            }
        }
    }

    private static void exceptionWithoutHandler1() throws IOException 
    {
        System.out.println("Inside exceptionWithoutHandler1()");
        exceptionWithoutHandler();
    }

    private static void exceptionWithoutHandler2() throws IOException 
    {
        System.out.println("Inside exceptionWithoutHandler2()");
        exceptionWithoutHandler1();
    }

    private static void exception_Handler() {
        try 
        {
            System.out.println("Inside exception_Handler() try block");
            exceptionWithoutHandler2();
        } 
        
        catch (IOException e) 
        {    
            System.out.println("Inside exception_Handler() catch block");
            System.out.println("IOException caught!");
        }
    }
}