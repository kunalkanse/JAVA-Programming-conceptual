import javax.swing.*;
import java.awt.event.*;

class GUI10Class
{
    
    GUI10Class()
    {
        JFrame fobj = new JFrame("Student Details");
        fobj.setSize(250,200);

        JLabel name = new JLabel("Student name : ");
        name.setBounds(20,50,100,20);

        JLabel batch = new JLabel("Batch name : ");
        batch.setBounds(20,80,100,20);

        JTextField nameTF = new JTextField();
        nameTF.setBounds(130, 50, 100, 20);

        JTextField batchTF = new JTextField();
        batchTF.setBounds(130, 80, 100, 20);


        JButton sbmt = new JButton("Submit");
        sbmt.setBounds(20, 120, 100, 20);

        JButton reset = new JButton("Reset");
        reset.setBounds(130, 120, 100, 20);

        fobj.add(name);
        fobj.add(batch);
        fobj.add(nameTF);
        fobj.add(batchTF);
        fobj.add(sbmt);
        fobj.add(reset);

        fobj.setLayout(null);
        fobj.setVisible(true);

        fobj.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }


}


public class GUI10_StudentDetailsSWING {
    public static void main(String[] args) {
        GUI10Class obj = new GUI10Class();   
    }
}

