
class Rectangle 
{
    private int length;
    private int height;

    public void setLength(int l)
    {
        this.length = l;
    }

    public void setHeight(int h)
    {
        this.height = h;
    }

    public int getLength()
    {
        return this.length;
    }

    public int getHeight()
    {
        return this.height;
    }

    public int area()
    {
        return 2*(length*height);
    }
}

public class DataHiding
{
    public static void main(String[] args) 
    {
        Rectangle r = new Rectangle();

        r.setLength(10);
        r.setHeight(20);

        //System.out.println(r.length);
        //System.out.println(r.height);

        System.out.println(r.area());


    }
}
