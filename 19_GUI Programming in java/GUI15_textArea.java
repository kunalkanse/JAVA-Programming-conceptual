
import java.awt.*;
import java.awt.event.*;

class MyFrame4 extends Frame implements ActionListener
{
    TextArea ta;
    TextField tf;
    Button b;
    Label l;

    public MyFrame4()
    {
        super("TextArea Demo");
        
        l = new Label("No Any Text entered");
        ta = new TextArea(10,30);
        tf = new TextField(20);
    
        b = new Button("Click");

        setLayout(new FlowLayout());

        b.addActionListener(this);
        
        add(ta);
        add(l);
        add(tf);
        add(b);

    }

    // whenever button is clicked this method will gets called
    public void actionPerformed(ActionEvent e)
    {
        //l.setText(ta.getSelectedText());

        //ta.append(tf.getText());

        ta.insert(tf.getText() , ta.getCaretPosition());
    }
}

public class GUI15_textArea 
{
    public static void main(String[] args) 
    {
        MyFrame4 mf4 = new MyFrame4();

        mf4.setSize(400,400);
        mf4.setVisible(true);
    }
}
