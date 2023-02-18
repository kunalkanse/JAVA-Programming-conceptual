
class Strings1
{
    public static void main(String aars[])
    {
        String s1 = "Kunal";    //String literal

        String s2 = new String("Kunal kanse");    //Using new keyword

        int length1 = s2.length();
        System.out.println("length of s2 : " + length1);

/////////////////////////////////////////////////////////////////////////////
        char arr[] = {'k','u','n','a','l'};
        String s3 = new String(arr);

        int length2 = s3.length();
        System.out.println("length of s3 : " + length2);
//////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////
        char chars[] = {'a','b','c','d','e','f'};
        
        //String(char chars[], int startIndex, int numChars)
        String s = new String(chars, 2, 3);
        System.out.println(s);
////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////

        String s4 = new String(s3); // passing object as parameter
        System.out.println(s4);
////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////

        byte ascii[] = {65,66,67,68,69,70};

        String s5 = new String(ascii);
        System.out.println(s5);

        //String(byte ascii[], int startIndex, int numChars)
        String s6 = new String(ascii, 2, 3);
        System.out.println(s6);

///////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////

    // passing references of StringBuffer And String Builder class

        String s7 = new String(new StringBuffer("JavaGuides"));
        System.out.println(s7);

        String s8 = new String(new StringBuilder("JavaGuides"));
        System.out.println(s8);

////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////

    String s9 = "my name kunal kanse";

    char a = s9.charAt(0);
    System.out.println(a);

    //System.out.println(s9.charAt(20));
    //StringIndexOutOfBoundsException: String index out of range: 20

////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////////

        // Demonstrate equals() and equalsIgnoreCase().

        String s10 = "Hello";
        String s11 = "Hello";
        String s12 = "Good-bye";
        String s13 = "HELLO";
        System.out.println(s10 + " equals " + s11 + " -> " + s10.equals(s11));
        System.out.println(s10 + " equals " + s12 + " -> " + s10.equals(s12));
        System.out.println(s10 + " equals " + s13 + " -> " + s10.equals(s13));
        System.out.println(s10 + " equalsIgnoreCase " + s13 + " -> " + s10.equalsIgnoreCase(s13));
    }
}
