
class Subjects
{
    private String subId;
    private String name;
    private int maxMarks;

    public Subjects(String subId, String name , int maxMarks)
    {
        this.subId = subId;
        this.name = name;
        this.maxMarks = maxMarks;
    }

    public String toString()
    {
        return " Subject ID : " + this.subId + "\n Subject name : " + this.name + "\n Max Marks : " + this.maxMarks;
    }
}

class ArrayOfObjects
{
    public static void main(String[] args) 
    {
        Subjects sobj[] = new Subjects[3];

        sobj[0] = new Subjects("s101","DS",100);
        sobj[1] = new Subjects("s102","Algorithms",100);
        sobj[2] = new Subjects("s103","Operating Systems",100);

        for(Subjects s : sobj)
        {
            System.out.println(s);
            System.out.println();
        }

    }
}
