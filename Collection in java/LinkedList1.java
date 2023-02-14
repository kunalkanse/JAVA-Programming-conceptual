
import java.util.*;

public class LinkedList1 
{
    public static void main(String[] args) 
    {

        List <Integer>list = new LinkedList<>();

        list.add(30);
        list.add(40);
        //vec.add("KK");
        list.add(15);
        list.add(12);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

    }  
}
