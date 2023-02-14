


import java.util.*;

class ListDemo2
{
    public static void main(String[] args) 
    {
    
        List list1 = Arrays.asList(10,20,30);

        System.out.println("Element \t index");
        for(int i = 0; i < list1.size(); i++)
        {
            System.out.println(list1.get(i) + "\t\t" + i);
        }

        List list2 = new ArrayList<>();

        list2.add(list1);

        System.out.println(list2);
    }
}