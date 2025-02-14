import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.sql.*;
class Frame extends JFrame implements ActionListener
{
	//DECLARTION
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2,b3;
	Frame()
	{
		setSize(500,500);
		setLocation(100,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		
		
		
		//MEMORYALLOCATION
		l1=new JLabel("ROLL");		l2=new JLabel("NAME");		l3=new JLabel("MARKS");
		t1=new JTextField(15); 		t2=new JTextField(15);		t3=new JTextField(15);
		b1=new JButton("A");		b2=new JButton("C");		b3=new JButton("EX");
		
		
		//ADD
		add(l1); add(l2); add(l3);
		add(t1); add(t2); add(t3);
		add(b1); add(b2); add(b3);
		
		
		
		//SETBOUNDS
		l1.setBounds(30,30,80,30);	l2.setBounds(30,70,80,30);	l3.setBounds(30,110,80,30);
		t1.setBounds(120,30,80,30);	t2.setBounds(120,70,80,30);	t3.setBounds(120,110,80,30);
		b1.setBounds(30,150,50,30);	b2.setBounds(90,150,50,30);	b3.setBounds(150,150,50,30);
		//LISTENER
		t1.addActionListener(this);t2.addActionListener(this);t3.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		//METHODS
	
		setVisible(true);	
	}
	public void actionPerformed(ActionEvent e) 
	{
		
			if(e.getSource()==t1 || e.getSource()==t2 || e.getSource()==t3)
			{
				if(e.getSource()==b1)
				{
					try
					{
						Connection cn;
						PreparedStatement p;
						String sql;
						Statement s;
						ResultSet rs;
						
						cn=DriverManager.getConnection("jdbc:mysql:\\\tejas","root","root");
								//System.out.println(t1.getText());
						       sql="insert into student values("+t1.getText()+",''"+t2.getText()+","+t3.getText()+")";
							   p=cn.prepareStatement(sql);
							   p.execute();
							   p.close();
						}
						catch(Exception ee)
						{	
						}
				}
			}
			
		
		if(e.getSource()==b2)
			{
				t1.setText("");t2.setText("");t3.setText("");
			}
			if(e.getSource()==b3)
			{
				System.exit(0);
			}
	}
	
}

class prc
{
	public static void main(String args[])
	{
		new Frame();
		
	}

}
