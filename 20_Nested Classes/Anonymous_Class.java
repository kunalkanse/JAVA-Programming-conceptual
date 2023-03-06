
abstract class Demo
{
    abstract void Display();
}

class Hello
{
    public void method()
    {
        Demo dobj = new Demo(){
            void Display()
            {
                System.out.println("Hello");
            }
        };

        dobj.Display();
    }
}

public class Anonymous_Class 
{
    public static void main(String[] args) {
        Hello hobj = new Hello();
        hobj.method();
    }

    
}
