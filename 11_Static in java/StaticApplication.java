
/**
    Consider these are 100 students in a college named "ABC", each student has their own unique roll number and 
    name but the college remains the same among all the 100 students. The college field is declared as static 
    so it can occupy memory only once.

    @author : Kunal kanse
    @date : 01/11/2022
 */

public class StaticApplication 
{

    public static void main(String[] args) 
    {

        Student student1 = new Student(100, "Student 1");
        Student student2 = new Student(101, "Student 2");
        Student student3 = new Student(102, "Student 3");
        Student student4 = new Student(103, "Student 4");

        System.out.println(" ------------ Student Details -------------");
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(student4.toString());
    }
}

class Student 
{
    private int rollNo;
    private String name;

    ///////////////////////////////////////////////////////////////////
    // static variable
    private static String college = "ABC"; 
    ///////////////////////////////////////////////////////////////////

    public Student(int rollNo, String name) 
    {
        super();
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", college=" + college + "]";
    }
}