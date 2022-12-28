import java.awt.*;
import java.awt.event.*;

class GUI10Class
{
    
    GUI10Class()
    {
        Frame fobj = new Frame("Student Details");
        fobj.setSize(250,200);

        Label name = new Label("Student name : ");
        name.setBounds(20,50,100,20);

        Label batch = new Label("Batch name : ");
        batch.setBounds(20,80,100,20);

        TextField nameTF = new TextField();
        nameTF.setBounds(130, 50, 100, 20);

        TextField batchTF = new TextField();
        batchTF.setBounds(130, 80, 100, 20);


        Button sbmt = new Button("Submit");
        sbmt.setBounds(20, 120, 100, 20);

        Button reset = new Button("Reset");
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


public class GUI10_StudentDetailsAWT {
    public static void main(String[] args) {
        GUI10Class obj = new GUI10Class();   
    }
}
