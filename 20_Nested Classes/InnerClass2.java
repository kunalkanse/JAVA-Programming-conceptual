
/**
// Java Program to Demonstrate Nested class 
@author Kunal kanse
*/

class Outer 
{
 
    // nested inner class
    class Inner 
    {

        //inner class cannot define any static method for itself.
 
        // show() method of inner class
        public void show()
        {
 
            // Print statement
            System.out.println("In a nested class method");
        }
    }
}


class InnerClass2 
{
 
    public static void main(String[] args)
    {
 
        // inner class object is created inside main()

        Outer obj = new Outer();
        Outer.Inner ibj = obj.new Inner();

        // Short method of object creation
        Outer.Inner in = new Outer().new Inner();
 
        // Calling show() method over above object created

        in.show();
        ibj.show();
    }
}