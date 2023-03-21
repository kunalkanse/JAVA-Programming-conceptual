
import java.awt.*;
import java.awt.event.*;

/**
 * This Program demonstrate the checkbox in AWT of java
 * 
 * using CheckboxGroup we can make Chechbox as radio button
 */

import javax.lang.model.util.ElementScanner14;

class MyFrame2 extends Frame implements ItemListener
{
    Label l;
    Checkbox c1,c2,c3;
    CheckboxGroup grp;

    public MyFrame2()
    {
        super("ItemListener Demo");

        l = new Label("Nothing is Selected");

        grp = new CheckboxGroup();

        c1 = new Checkbox("java",false,grp);
        c2 = new Checkbox("Python",true,grp);
        c3 = new Checkbox("C#",false,grp);

        setLayout(new FlowLayout());

        add(l);
        add(c1);
        add(c2);
        add(c3);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent i)
    {
        String str = "";

        if(c1.getState())
        {
            str = str + " " + c1.getLabel();
        }

        if(c2.getState())
        {
            str = str + " " + c2.getLabel();
        }

        if(c3.getState())
        {
            str = str + " " + c3.getLabel();
        }

        if(str.isEmpty())
        {
            str = "Nothing is Selected";
        }
        
        l.setText(str);
    }
}

public class GUI12_ItemListener 
{
    public static void main(String[] args) 
    {
        MyFrame2 mf2 = new MyFrame2();
        mf2.setSize(400,400);
        mf2.setVisible(true);
    }
}
