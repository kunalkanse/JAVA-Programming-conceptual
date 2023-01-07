
// Java program to show working of user defined
// Generic classes

// We use < > to specify Parameter type
/**
@author Kunal kanse
 */

class Generic1Class<T>
{
    T var;

    Generic1Class (T x)
    {
        this.var = x;
    }

    public T get()
    {
        return this.var;
    }
}

class Generics1
{
    public static void main(String args[])
    {
        Generic1Class <Integer> obj1 = new Generic1Class<>(10);
        
        Generic1Class <String> obj2 = new Generic1Class<>("Hii");

        System.out.println(obj1.get());
        System.out.println(obj2.get());

    }
}
