
import java.util.*;

public class Vector1 
{
    public static void main(String[] args) 
    {

        Vector <Integer>vec = new Vector(3);

        vec.add(30);
        vec.add(40);
        //vec.add("KK");
        vec.add(15);
        vec.add(12);

        System.out.println(vec);

        Collections.sort(vec);
        System.out.println(vec);

        Collections.reverse(vec);
        System.out.println(vec);

    }    
}
