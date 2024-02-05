public import javax.swing.*;
import java.awt.*;
public class Frame
{
	public static void main(String args[])
	{
		JFrame f=new JFrame("My Frame");
		f.setSize(800,600);
		JLabel jlab =new JLabel("butifull!!....");
		ImageIcon i=new ImageIcon("index.jpeg");
		JLabel j2 =new JLabel("HEHE",i,JLabel.CENTER);
		JTextField f1=new JTextField("BRRRROO.....");
		JTextField f2=new JTextField(10);
		f.add(j2);	
		f.add(jlab);
		f.add(f1);
		f.add(f2);	
		String str=f1.getText();
		f2.setText(str);			
		System.out.println("String is:"+str);
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
} 
    

