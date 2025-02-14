import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

class Pass extends JFrame implements ActionListener
{
	//Declaration
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t1,t2,t3,t4;
	JPasswordField p1,p2;
	JButton b1;
	Font f1;
	Cursor c1;
	
	Random r=new Random();
	int a=r.nextInt(89)+10;
	int b=r.nextInt(89)+10;
	int k=a+b;
	String ks=Integer.toString(k);
	Pass()
	{
		super("Tejas Jadhav");
		setSize(500,500);
		setLocation(100,100);
		setLayout(null);

		//MemoryALLocation
		l1=new JLabel("Registration Form");
		l2=new JLabel("Name");
		l3=new JLabel("Login Name");
		l4=new JLabel("Password");
		l5=new JLabel("Confirm Password");
		l6=new JLabel("Capcha");
		t1=new JTextField(); t2=new JTextField();
		p1=new JPasswordField();
		p2=new JPasswordField();
		t3=new JTextField(); t4=new JTextField();
		b1=new JButton("Submit");
		f1=new Font("Arial",Font.BOLD,20);
		c1=new Cursor(Cursor.HAND_CURSOR);
		
		//ADD TO FRAME
		add(l1);
		l1.setFont(f1);
		add(l2); add(t1);
		add(l3); add(t2);
		add(l4);add(p1);
		add(l5);add(p2);
		add(l6);add(t3);add(t4);
		add(b1);
		
		b1.setCursor(c1);
		b1.setToolTipText("click!!!!");
		
		//SETBOUNDS
		l1.setBounds(150,50,200,40);
		l2.setBounds(100,110,100,30); t1.setBounds(220,110,100,30);
		l3.setBounds(100,160,100,30); t2.setBounds(220,160,100,30);
		l4.setBounds(100,210,100,30);p1.setBounds(220,210,100,30);
		l5.setBounds(70,260,150,30);p2.setBounds(220,260,100,30);
		l6.setBounds(100,310,100,30);t3.setBounds(220,310,45,30);t4.setBounds(275,310,45,30);
		b1.setBounds(160,360,100,30);
		
		//ADDLISTENERS
		b1.addActionListener(this);

		String c=(Integer.toString(a))+"+"+(Integer.toString(b));
		t3.setText(c);
		
		p1.setEchoChar('*');
		p2.setEchoChar('*');
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			String s=t1.getText();
			String s2=t2.getText();
			String d=t4.getText();
			String pass1=p1.getText();
			String pass2=p2.getText();

			if(pass1.equals(pass2) && s.length()>6 && s2.length()>6 && ks.equals(d) && pass1.length()>1 && pass2.length()>1)
			{
			t4.setBackground(Color.GREEN);
			JOptionPane.showMessageDialog(null,"Login Successful");
			}
	
			else if(s.length()<6)
				JOptionPane.showMessageDialog(null,"name must be 6 letter");
	
			else if(s2.length()<6)
				JOptionPane.showMessageDialog(null,"username must be 6 letter");

			else if(pass1.length()<1 && pass2.length()<1)
			JOptionPane.showMessageDialog(null,"Enter Passward....");

	    	else if(!pass1.equals(pass2))
			JOptionPane.showMessageDialog(null,"Passward Mismatch....");
			
			else if(!ks.equals(d))
			{
			t4.setBackground(Color.RED);
			JOptionPane.showMessageDialog(null,"Captcha Invalid");
			}
		}
	}		

}

class Registration
{
	public static void main(String args[])
	{
		new Pass();	
	}
}