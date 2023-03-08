
public class Wrapper_Demo 
{
    public static void main(String[] args) 
    {
        // Integer i = new Integer(10); // Deprecated

        Integer i1 = 10;
        Integer i2 = Integer.valueOf(i1);
        Integer i3 = Integer.valueOf("100");
        Integer i4 = i2;

        //unboxing
        int i5 = i2.intValue();

        //autounboxing
        int i6 = i3;

        // autoboxing
        Integer i7 = i5;

        //boxing
        Integer i8 = Integer.valueOf(i6);



    }
}
