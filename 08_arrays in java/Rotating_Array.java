import java.util.Scanner;

public class Rotating_Array 
{
    public static void main(String[] args) 
    {
        int Arr[] = { 10, 20, 30, 40, 50 };

        for (int element : Arr) 
        {
            System.out.print(" " + element);
        }

        System.out.println();

        for (int i = 1; i < Arr.length+1; i++) 
        {
            int temp0 = Arr[0];

            for (int j = 1; j < Arr.length; j++) 
            {
                Arr[j - 1] = Arr[j];
            }

            Arr[Arr.length - 1] = temp0;

            for (int element : Arr) 
            {
                System.out.print(" " + element);
            }

            System.out.println();
        }

    }
}
