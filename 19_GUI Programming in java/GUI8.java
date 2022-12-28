import java.awt.*;
import java.awt.event.*;

/**
 * 
 * in GUI6, it was mendatory to give definations for all abstract methods
 * of WindowListener interface , but in java it have WindowAdapter class Which contains all abstrat methods defination
 * 
 * so instead of implementing WindowListener we can Extends WindowAdapter
 * and only override those methods which are needed
 * 
 * @author Kunal kanse
 * 
 */

class GUI8Class// extends WindowAdapter
{
    Frame fobj;

    GUI8Class()
    {
        fobj = new Frame("WindowAdapter");
        
        fobj.setSize(500, 500);
        fobj.setVisible(true);

        // short hand method
        fobj.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent obj)
            {
                System.exit(0);
            }
        });
    }

}

class GUI8 {
    public static void main(String[] args) {
        GUI8Class obj = new GUI8Class();
    }
}
