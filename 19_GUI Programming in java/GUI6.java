import java.awt.*;
import java.awt.event.*;


/**
 * This program demonstarte how to create window using AWT libraries
 * GUI6Class is extending Frame class & implements WindowListener interface
 * WindowListener is implemented for Event handling to close window
 * 
 * added Button and TextField in window
 * 
 * by using Event handling we are closing the window
 * 
 * @author Kunal kanse
 */

class GUI6Class extends Frame implements WindowListener
{
    public Button b1;
    public TextField t1;

    public GUI6Class()
    {
        super();
        setSize(600,600);
        setTitle("ActionListener");

        b1 = new Button("submit");
        b1.setBounds(50,50,100,50);

        t1 = new TextField();
        t1.setBounds(170,50,100,50);

        add(b1);
        add(t1);

        //Windowlistener added
        addWindowListener(this);

        setLayout(null);
        setVisible(true);

       
    
    }

    // Abstract methods of Windowlistener interface 
    // beacuse of these are abstract method its mendatory to define them
    public void windowDeactivated(WindowEvent obj){}
    public void windowActivated(WindowEvent obj){}
    public void windowDeiconified(WindowEvent obj){}
    public void windowIconified(WindowEvent obj){}
    public void windowClosed(WindowEvent obj){}

    public void windowClosing(WindowEvent obj)
    {
        System.out.println("inside closing");
		System.exit(0);
    }

    public void windowOpened(WindowEvent obj){}

}

class GUI6
{

    public static void main(String[] args) {
        
        GUI6Class obj1 = new GUI6Class();

    }
    
}
