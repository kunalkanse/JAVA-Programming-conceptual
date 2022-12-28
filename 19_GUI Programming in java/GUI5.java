import java.awt.*;
import java.awt.event.*;


/**
 * This program demonstarte how to create window using AWT libraries
 * GUI5Class is extending Frame class & implements ActionListener interface
 * ActionLectener is implemented for Event handling
 * 
 * added Button and TextField in window
 * 
 * by using Event handling we are demonstrate that 
 * on clicking button "Button clicked" will show in the textfield
 * 
 * @author Kunal kanse
 */

class GUI5Class extends Frame implements ActionListener
{
    public Button b1;
    public TextField t1;

    public GUI5Class()
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

        b1.addActionListener(this); 
        // on clicking button object of b1 is thrown & catched by actionPerformd() method 

        setLayout(null);
        setVisible(true);
    
    }

    public void actionPerformed(ActionEvent obj)
    {
        t1.setText("Button clicked");
        // on clicking button "Button clicked" will show in the textfield
    }
}

class GUI5 {

    public static void main(String[] args) {
        
        GUI5Class obj1 = new GUI5Class();

    }
    
}
