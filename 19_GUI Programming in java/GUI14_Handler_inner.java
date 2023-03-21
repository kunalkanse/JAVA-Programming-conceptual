

import java.awt.*;
import java.awt.event.*;

class MyFrame4 extends Frame
{
    Label l1,l2;
    TextField tf;

    public MyFrame4()
    {
        super("TextField Demo");
        l1 = new Label("No text is entered yet");
        l2 = new Label("Enter Key is not hit yet");

        tf = new TextField(20);
        tf.setEchoChar('*');

        setLayout(new FlowLayout());

        Handler h = new Handler();

        tf.addTextListener(h);
        tf.addActionListener(h);

        add(l1);
        add(tf);
        add(l2);
    }

    class Handler implements TextListener, ActionListener
    {
        public void textValueChanged(TextEvent t)
        {
            l1.setText(tf.getText());
        }

        public void actionPerformed(ActionEvent e)
        {
            l2.setText(tf.getText());
        }
    }
    
}

public class GUI14_Handler_inner 
{
    public static void main(String[] args) 
    {
        MyFrame4 mf4 = new MyFrame4();

        mf4.setSize(400,400);
        mf4.setVisible(true);
    }
}
