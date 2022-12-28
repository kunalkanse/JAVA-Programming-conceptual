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

class GUI7Class extends WindowAdapter
{
    Frame fobj;

    GUI7Class()
    {
        fobj = new Frame("WindowAdapter");
        
        fobj.setSize(500, 500);
        fobj.setVisible(true);

        fobj.addWindowListener(this);
    }

    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }

}

class GUI7 {
    public static void main(String[] args) {
        GUI7Class obj = new GUI7Class();
    }
}
