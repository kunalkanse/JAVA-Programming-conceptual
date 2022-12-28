import java.awt.*;
/**
 * This program demonstarte how to create window using AWT libraries
 * GUI4Class is extending Frame class
 * passing parameter to the constructor through object creation
 * 
 * added Button and TextField in window
 * 
 * @author Kunal kanse
 */

class GUI4Class extends Frame
{
    // created objects as charcteristics of class 
    Button b1;
    TextField t1;

    GUI4Class(int width , int height)
    {
        super();
        setSize(width , height);
        setTitle("Kunal's Window");

        // Button
        b1 = new Button("Button");
        b1.setBounds(50, 50, 100, 50);  //(X-coordinate , Y-coordinate , width , height)

        //Textfiels
        t1 = new TextField();
        t1.setBounds(50,110,100,50);    //(X-coordinate , Y-coordinate , width , height)
        //t1.setText("string");

        add(b1);
        add(t1);

        setLayout(null);
        setVisible(true);
    }
}

class GUI4 {
    public static void main(String[] args) {
        
        // created two windows
        GUI4Class obj1 = new GUI4Class( 600 , 600 );
        GUI4Class obj2 = new GUI4Class( 300 , 300 );
    }    
}
