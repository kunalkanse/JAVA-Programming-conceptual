
// seperate username & domain name from email Address

public class String_EmailUsername 
{
    public static void main(String[] args)
    {
        String str = "kunalskanse@gmail.com";

        int index = str.indexOf('@');

        String uName = str.substring(0,index);
        String domain = str.substring(index+1, str.length());

        System.out.println("Username is : " + uName);
        System.out.println("Domain is : " + domain);
    }
}
