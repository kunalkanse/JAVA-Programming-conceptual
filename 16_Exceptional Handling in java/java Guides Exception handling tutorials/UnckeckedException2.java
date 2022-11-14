
/**
    NullPointerException is another best example for runtime exception.

    Person class object is not created using the new keyword but it is just declared with a null value. 
    Now we are trying to access personName field value on null reference so JVM will 
    throw NullPointerException exception here.

    @author Kunal kanse
 */

public class UnckeckedException2
{

    public static void main(String[] args) 
    {

        Person personObj = null;

        try 
        {
            String name = personObj.personName; // Accessing the field of a null object
            personObj.personName = "Jon Doe"; // Modifying the field of a null object
        } 
        
        catch (NullPointerException e) 
        {
            System.err.println("NullPointerException caught!");
        }

    }
}

class Person 
{

    public String personName;

    public String getPersonName() 
    {
        return personName;
    }

    public void setPersonName(String personName) 
    {
        this.personName = personName;
    }

}