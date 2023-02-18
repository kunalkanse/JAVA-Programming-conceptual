
class Strings2
{
    public static void main(String aars[])
    {
        // All object refers same data
        String s1 = "Hello";    //String literal pool
        String s2 = "Hello";    //String literal pool
        String s3 = "Hello";    //String literal pool
        
        // creates seperate object for each
        String s4 = new String("Hello");  //Heap
        String s4 = new String("Hello");  //Heap

        
    }
}
