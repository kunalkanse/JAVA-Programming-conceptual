

import java.util.*;

class ListDemo1
{
    public static void main(String[] args) 
    {
        ArrayList list1 = new ArrayList<>();

        list1.add(10);
        list1.add('a');
        list1.add(10.20f);

        System.out.println(list1);

        System.out.println();
        System.out.println("using For each loop : ");
        for(Object obj : list1)
        {
            System.out.println(obj);
        }

        System.out.println();
        System.out.println("Using Iterator : ");
        Iterator iobj = list1.iterator();
        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }

        System.out.println();

        List list2 = new ArrayList<>();

        list2.add("AAA");
        list2.add("BBB");
        list2.add("CCC");

        System.out.println("Element \t index");
        for(int i = 0; i < list2.size(); i++)
        {
            System.out.println(list2.get(i) + "\t\t" + i);
        }

    }
}
