interface Demo
{
    void Display();
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

class Anonymous_interface 
{
    public static void main(String[] args) {
        Hello hobj = new Hello();
        hobj.method();
    }

    
}
