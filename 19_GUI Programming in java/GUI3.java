import java.awt.*;

/**
 * This program demonstarte how to create window using AWT libraries
 * GUI3Class is extending Frame class
 * passing parameter to the constructor through object creation
 * 
 * @author Kunal kanse
 */

class GUI3Class extends Frame
{

    GUI3Class(int width , int height , String str)
    {
        super();
        setTitle(str);
        setSize(width, height);
        setVisible(true);        
    }
}

class GUI3 {
    public static void main(String[] args) {
        
        GUI3Class obj1 = new GUI3Class(600,600, "First");

        GUI3Class obj2 = new GUI3Class(400,400 , "Second");
    }
}
