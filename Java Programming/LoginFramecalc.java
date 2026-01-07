import java.awt.event.*;
import javax.swing.*;

class Calculator implements ActionListener
{
    JFrame fobj;
    JButton aobj,bobj,cobj,dobj;
    JTextField tobj1,tobj2;
    JLabel lobj1,lobj2,resobj;


    public Calculator(String Title,int Width,int Height)
    {
        fobj = new JFrame(Title);
        

        lobj1 = new JLabel("Number 1 ");
        lobj1.setBounds(50,30,100,30);

        lobj2 = new JLabel("Number 2");
        lobj2.setBounds(50 , 90,100,30);

        tobj1 = new JTextField();
        tobj1.setBounds(200,30,100,30);

        tobj2 = new JTextField();
        tobj2.setBounds(200,90,100,30);

        aobj = new JButton ("+");
        aobj.setBounds(60,150,50,50);

        bobj = new JButton ("-");
        bobj.setBounds(120,150,50,50);

        cobj = new JButton ("*");
        cobj.setBounds(180,150,50,50);

        dobj = new JButton ("/");
        dobj.setBounds(240,150,50,50);

        resobj = new JLabel("");
        resobj.setBounds(100,230,170,50);




        fobj.add(lobj1);
        fobj.add(lobj2);
        fobj.add(tobj1);
        fobj.add(tobj2);
        fobj.add(aobj);
        fobj.add(bobj);
        fobj.add(cobj);
        fobj.add(dobj);
        fobj.add(resobj);
         
        aobj.addActionListener(this);
        bobj.addActionListener(this);
        cobj.addActionListener(this);
        dobj.addActionListener(this);
        
        fobj.setLayout(null);
        fobj.setSize(Width,Height);
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        
    }

    public void actionPerformed(ActionEvent eobj)
        {
            String text1 = tobj1.getText();
            String text2 = tobj2.getText();
            

            double num1 = Double.parseDouble(text1);
            double num2 = Double.parseDouble(text2);

            double fSum = 0;

            if(eobj.getSource() == aobj)
            {
                fSum = num1 + num2;
            }

            else if(eobj.getSource() == bobj)
            {
                fSum = num1 - num2;
            }

            else if(eobj.getSource() == cobj)
            {
                fSum = num1 * num2;
            }

            else if(eobj.getSource() == dobj)
            {
                fSum = num1 / num2;
            }


            resobj.setText("Result is : " + fSum);

        }
}
class LoginFramecalc 
{
    public static void main (String A[])
    {
        
        Calculator cobj = new Calculator ("Calculator", 350 , 350);
        
    }
   
}