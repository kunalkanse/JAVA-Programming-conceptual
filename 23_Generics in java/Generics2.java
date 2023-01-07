

// Java program to show multiple
// type parameters in Java Generics
  
// We use < > to specify Parameter type

/**
@author Kunal kanse
 */

class Generic2Class<T, U>
{
    T obj1;  
    U obj2;  
  
    // constructor
    Generic2Class(T obj1, U obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
  
    public void print()
    {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

class GenericMethod
{
    public static <T> T number(T x)
    {
        return x;
    }
}
  
class Generics2
{
    public static void main (String[] args)
    {
        Generic2Class <String, Integer> obj = new Generic2Class<String, Integer>("KK", 15);

        obj.print();


        System.out.println("Calling Generic methods : ");
        System.out.println(GenericMethod.number(100));
        System.out.println(GenericMethod.number("Hello"));

    }
}