import java.util.Arrays;

/**
 * This class shows different methods for copy array in java
 * @author Kunal kanse
 *
 */

 /* 
four different ways to copy an array in Java.
        1) Copying Arrays using Built-in System.arraycopy() Method
        2) Copying Arrays Using Arrays.copyOf() Method
        3) Copying Arrays using Object.clone() method
        4) Copying Arrays using Arrays.copyOfRange()
 */

    class Arraycopy {
        public static void main(String[] args) 
        {

            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            //  Using System.arraycopy() method
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

            System.out.println("Using System.arraycopy() method :- ");

            char[] copyFrom = { 'K', 'U', 'N', 'a', 'L', 'S', 'H', 'A', 'R', 'A', 'D', 'K', 'A' , 'N' , 'S' , 'E'};

            char[] copyTo = new char[6];

            // System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)

            System.arraycopy(copyFrom, 5, copyTo, 0, 6);

            System.out.println("Source array = " + new String(copyFrom));
            System.out.println("Copy Middle 6 elements of array copyfrom to copyto = " + new String(copyTo));

            System.out.println();

            int[] source1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
                
            System.out.println("Source1 array = " + Arrays.toString(source1));

            int[] temp = new int[5];
            System.arraycopy(source1, 0, temp, 0, 5);
                
            System.out.println("Copy First five elements of array. Result array = " + Arrays.toString(temp));

            System.out.println();

            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            //      2) Using System.copyof() method
            //      If you want to copy first few elements of an array or full copy of array
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

            System.out.println("Using System.copyof() method :- ");

            int[] source2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
                
            System.out.println("Source2 array = " + Arrays.toString(source2));

            int[] dest1 = Arrays.copyOf(source2, source2.length);
                
            System.out.println("Copy First five elements of array. Result array = " + Arrays.toString(dest1));
            
            System.out.println();

            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            //      3) Using Object.clone() method
            //      Object class provides clone() method and since an array in java is also an Object, you can use this method to achieve full array copy. 
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

            System.out.println("Using Object.clone() method :- ");

            int[] source3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
                
            System.out.println("source3 array = " + Arrays.toString(source3));

            int[] dest2 = source3.clone();
                
            System.out.println("Copy First five elements of array. Result array = " + Arrays.toString(dest2));

            System.out.println();

            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            //      3) Using Arrays.copyOfRange() method
            //      If you want a few elements of an array to be copied, where starting index is not 0, you can use this method to copy the partial array.
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

            System.out.println("Using Arrays.copyOfRange() method :- ");

            int[] source4 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
                
            System.out.println("source4 array = " + Arrays.toString(source4));

            int[] dest3 = Arrays.copyOfRange(source4, source4.length - 3, source4.length);
                
            System.out.println( "Copy First five elements of array. Result array = " + Arrays.toString(dest3));

        }
    }