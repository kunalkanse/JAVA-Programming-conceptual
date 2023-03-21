
import java.awt.*;
import java.awt.event.*;

class MyFrame3 extends Frame implements TextListener,ActionListener
{
    Label l1,l2;
    TextField tf;

    public MyFrame3()
    {
        super("TextField Demo");
        l1 = new Label("No text is entered yet");
        l2 = new Label("Enter Key is not hit yet");

        tf = new TextField(20);
        tf.setEchoChar('*');

        setLayout(new FlowLayout());

        add(l1);
        add(tf);
        add(l2);

        tf.addTextListener(this);
        tf.addActionListener(this);
    }

    public void textValueChanged(TextEvent t)
    {
        l1.setText(tf.getText());
    }

    public void actionPerformed(ActionEvent e)
    {
        l2.setText(tf.getText());
    }
    
}

public class GUI13_TextEvent 
{
    public static void main(String[] args) 
    {
        MyFrame3 mf3 = new MyFrame3();

        mf3.setSize(400,400);
        mf3.setVisible(true);
    }
}
