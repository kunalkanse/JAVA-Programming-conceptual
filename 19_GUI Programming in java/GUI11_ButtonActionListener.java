
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener
{
    int Count = 0;
    Label l;
    Button b;

    public MyFrame()
    {
        super("Button Demo");
        l = new Label("    "+Count);
        b = new Button("Click Me..!");

        setLayout(new FlowLayout());

        b.addActionListener(this);

        add(l);
        add(b);

    }

    public void actionPerformed(ActionEvent e)
    {
        Count++;
        l.setText("    "+Count);
    }
}


public class GUI11_ButtonActionListener 
{
    public static void main(String[] args) 
    {
        MyFrame mf = new MyFrame();
        mf.setSize(400,400);
        mf.setVisible(true);    
    }
}
