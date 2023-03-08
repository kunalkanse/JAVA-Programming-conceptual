/**
 * Class to demonstrate auto-boxing the primitive types.

 * @author Kunal kanse
 *
 */ 
class AutoBoxing
{
 
    public static void main(String[] args) 
    {
    
        byte b = 100; //Primitive byte data
        Byte B = b; //Auto-Boxing of byte data
        System.out.println(B);
        
        short s = 100; //Primitive short data
        Short S = s;   //Auto-Boxing of short data
        System.out.println(S);
        
        int i = 200;    //Primitive int Data
        Integer I = i;  //Auto-Boxing of int data
        System.out.println(I);
        
        long l = 250; 
        Long L = l;
        System.out.println(L);

        float f = 120L; 
        Float F = f;
        System.out.println(F);

        double d = 18.58; 
        Double D = d;
        System.out.println(D);

        boolean bln = false; 
        Boolean BLN = bln;
        System.out.println(BLN);

        char c = 'C'; 
        Character C = c;
        System.out.println(C);
    }
}

