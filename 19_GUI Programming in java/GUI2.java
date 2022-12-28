import java.awt.*;

/**
 * This program demonstarte how to create window using AWT libraries
 * GUI2Class is extending Frame class
 * 
 * @author Kunal kanse
 */

class GUI2Class extends Frame
{

    GUI2Class(String str)
    {
        super(str);
    }
}

class GUI2
{
    public static void main(String[] args) {
        
        GUI2Class obj = new GUI2Class("Kunal's Window");

        //obj.setTitle("Kunal's Window");   
        //To set the window title

        obj.setSize(500, 500);
        obj.setVisible(true);

        // to close the window press => ctrl + c 
    }
}
