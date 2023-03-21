
import java.awt.*;
import java.awt.event.*;

import javax.lang.model.util.ElementScanner14;

class MyFrame5 extends Frame implements ItemListener, ActionListener
{
    List l;
    Choice c;
    TextArea ta;

    public MyFrame5()
    {
        super("Listbox Demo");

        l = new List(4,true);
        c = new Choice();

        ta = new TextArea(10,30);

        setLayout(new FlowLayout());

        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");

        c.add("January");
        c.add("February");
        c.add("March");
        c.add("April");

        l.addItemListener(this);
        c.addItemListener(this);
        l.addActionListener(this);

        add(l);
        add(c);
        add(ta);

    }

    public void itemStateChanged(ItemEvent i)
    {
        if(i.getSource() == l)
        {
            ta.setText(l.getSelectedItem());
        }
        else
        {
            ta.setText(c.getSelectedItem());
        }

    }

    public void actionPerformed(ActionEvent e)
    {
        String list[] = l.getSelectedItems();

        String txt = "";

        for(String x : list)
        {
            txt+=x+"\n";
        }

        ta.setText(txt);
    }
}

public class GUI16_List_Choice 
{
    public static void main(String[] args) 
    {
        MyFrame5 mf5 = new MyFrame5();

        mf5.setSize(400,400);
        mf5.setVisible(true);
    }
}
