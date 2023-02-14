


import java.util.*;

class ListDemo3
{
    public static void main(String[] args) 
    {

        List<Integer>list2 = new ArrayList<>();

        list2.add(30);
        list2.add(40);
        //list2.add("KK");
        list2.add(15);
        list2.add(12);

        System.out.println(list2);

        Collections.sort(list2);
        System.out.println(list2);

        Collections.reverse(list2);
        System.out.println(list2);

    }
}
