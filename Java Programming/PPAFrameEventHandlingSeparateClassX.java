import java.awt.event.*;
import javax.swing.*;

class MarvellousListener implements ActionListener
{
    public void actionPerformed(ActionEvent aobj)
        {
            System.out.println("Button clicked .....");
        }

}

class PPAFrameEventHandlingSeparateClassX
{
    public static void main (String A[])
    {
        JFrame fobj = new JFrame("PPA");
        JButton bobj = new JButton("OK");

        bobj.setBounds(100,100,150,50);

        MarvellousListener mobj = new MarvellousListener();
        bobj.addActionListener(mobj);

        fobj.add(bobj);

        fobj.setSize(400 , 300);

        fobj.setLayout(null);
        fobj.setVisible(true);

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
}