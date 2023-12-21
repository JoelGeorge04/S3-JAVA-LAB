public import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class gui implements ActionListener
{
	JFrame jf;
	JTextField jt;
	JButton jb;
	JLabel jl;
	gui()
	{
		jf=new JFrame("sample.GUI");
		jt=new JTextField(10);
		jb=new JButton("Ok");
		jl=new JLabel("Name");
		jf.setSize(400,500);
		jf.add(jt);
		jf.add(jb);
		jf.add(jl);
		jf.setVisible(true);
		jf.setLayout(new FlowLayout());
		jb.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		jt.setText("OK pressed");
	}
	public static void main(String arg[])
	{
		gui ob=new gui();
	}
} 
    

