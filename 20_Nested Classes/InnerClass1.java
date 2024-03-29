/** 
Java program to demonstrate accessing a inner class

@author Kunal kanse
*/
 
// outer class
class OuterClass
{
    // static member
    static int outer_x = 10;
     
    // instance(non-static) member
    int outer_y = 20;
     
    // private member
    private int outer_private = 30;
     
    // inner class
    class InnerClass
    {
     
        public int x = 0;
        void display()
        {
            // can access static member of outer class
            System.out.println("outer_x = " + outer_x);
             
            // can also access non-static member of outer class
            System.out.println("outer_y = " + outer_y);
             
            // can also access a private member of the outer class
            System.out.println("outer_private = " + outer_private);
         
        }
    }
 
    void outerFun()
    {
       InnerClass IC = new InnerClass();
       IC.display();
       System.out.println(IC.x );
    }
}
 
// Driver class
public class InnerClassDemo
{
    public static void main(String[] args)
    {

        //To instantiate an inner class, you must first instantiate the outer class. Then, create the inner object within the outer object

        // accessing an inner class
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        //OuterClass.InnerClass innerObject = new OuterClass().new InnerClass();
         
        innerObject.display();
    }
}
