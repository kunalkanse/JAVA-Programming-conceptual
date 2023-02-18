public class String_Regex
{
    public static void main(String[] args) 
    {
        String str1 = "A";
        String str2 = "xyz";
        String str3 = "A7";

        
        System.out.println(str1.matches("."));   //true foe any single sysmbol
        System.out.println(str2.matches("."));  //false

        System.out.println(str1.matches("[ABC]"));  // true for any symbol in [ABC]

        System.out.println(str1.matches("[^PQR]")); //true for Any sysmbol except PQR

        System.out.println(str1.matches("[a-z0-9]"));   // true for symbol between range

        System.out.println(str3.matches("[A-Z][0-9]")); //true

        System.out.println(str1.matches("a|A"));    // a or A

        System.out.println(str2.matches("xyz"));  // must be match whole string
    }
}
