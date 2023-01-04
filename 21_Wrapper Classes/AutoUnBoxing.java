

/**
 * Class to demonstrate auto-unboxing the wrapper object.
 * @author Kunal kanse
 *
 */

class AutoUnBoxing
{
    public static void main(String[] args) 
    {
        Byte B = 10;   //Byte Object
        byte b = B;                    //Auto-Unboxing of Byte Object
        System.out.println(b);
            
        Short S = 20;   //Short Object
        short s = S;                      //Auto-Unboxing of Short Object
        System.out.println(s);
            
        Integer I = 15;    //Integer Object
        int i = I;                     //Auto-Unboxing of Integer Object
        System.out.println(i);
        
        Long L = 50l;     //Long Object
        long l = L;               //Auto-Unboxing of Long Object
        System.out.println(l);
            
        Float F = 20f;      //Float Object
        float f = F;                 //Auto-Unboxing of Float Object
        System.out.println(f);
            
        Double D = 20.5;   //Double Object
        double d = D;                 //Auto-Unboxing of Double Object
        System.out.println(d);
            
        Boolean BLN = true;      //Boolean Object
        boolean bln = BLN;                   //Auto-Unboxing of Boolean Object
        System.out.println(bln);
            
        Character C = 'k';    //Character Object
        char c = C;                         //Auto-Unboxing of Character Object
        System.out.println(c);
    }
}