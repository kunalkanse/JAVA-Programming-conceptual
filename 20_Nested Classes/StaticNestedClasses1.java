

class StaticNestedClasses1 
{

    public static void main(String[] args) 
    {
        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
        nestedObject.innerClassMethod();
    }
}

class OuterClass
{

    int x = 10;
    static int y = 20;
    private static int z = 30;
 
    public void outerClassMethod()
    {
        System.out.println( " outerClassMethod ");
    }
 
    static class StaticNestedClass
    {
        public void innerClassMethod()
        {
        System.out.println( "innerClassMethod\n y = "+y +" z = "+z);

        // can access static as well as private static member of outer class
        }
    
    }
}