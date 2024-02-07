import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Gui2 implements ActionListener 
{
    JFrame jf;
    JLabel jl1, jl2;
    JTextField jt;
    JButton jb;

    Gui2() 
    {
        jf = new JFrame("PALINDROME??");
        jl1 = new JLabel("Enter a String :");
        jb = new JButton("Check");
        jl2 = new JLabel("");
        jt = new JTextField(10);
        jf.setSize(250, 300);
        jf.setLayout(new FlowLayout());
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(jl1);
        jf.add(jt);
        jf.add(jb);
        jf.add(jl2);
        jb.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) 
    {
        String str, rstr = "";
        str = jt.getText();
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) 
        {
            rstr += str.charAt(i);
        }
        if (rstr.equals(str)) 
        {
            jl2.setText(str + " String is Palindrome");
        } 
        else 
        {
            jl2.setText(str + " String is not Palindrome");
        }
    }

    public static void main(String[] args) 
    {
        new Gui2();
    }
}