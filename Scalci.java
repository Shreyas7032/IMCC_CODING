import java.awt.*;
import java.awt.event.*;

class Calculator extends Frame implements ActionListener
{
	//Declaration
	Label l1;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	TextField t1;
	String s1,s2,s3,s4;
	int c;
	Calculator()
	{
		setTitle("Shreyas Calculator");
		setSize(500,500);
		setLocation(400,100);
		setLayout(null);
		setFont(new Font("Arial",Font.BOLD,20));
		setVisible(true);
		
		
		
		//Memory Allocation
		l1=new Label("Simple Calculator");
		t1=new TextField();
		
		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("+");
		b5=new Button("4");
		b6=new Button("5");
		b7=new Button("6");
		b8=new Button("-");
		b9=new Button("7");
		b10=new Button("8");
		b11=new Button("9");
		b12=new Button("*");
		b13=new Button("0");
		b14=new Button(".");
		b15=new Button("=");
		b16=new Button("/");
		
		
		
		//Add frame
		add(l1);
		add(t1);
		add(b1);add(b2);add(b3);add(b4);
		add(b5);add(b6);add(b7);add(b8);
		add(b9);add(b10);add(b11);add(b12);
		add(b13);add(b14);add(b15);add(b16);
		
		
		
		
		
		//SetBounds
		l1.setBounds(30,30,180,30);
		t1.setBounds(40,70,160,30);
		
		b1.setBounds(40,110,30,30);
		b2.setBounds(80,110,30,30);
		b3.setBounds(120,110,30,30);
		b4.setBounds(160,110,30,30);
		b5.setBounds(40,150,30,30);
		b6.setBounds(80,150,30,30);
		b7.setBounds(120,150,30,30);
		b8.setBounds(160,150,30,30);
		b9.setBounds(40,190,30,30);
		b10.setBounds(80,190,30,30);
		b11.setBounds(120,190,30,30);
		b12.setBounds(160,190,30,30);
		b13.setBounds(40,230,30,30);
		b14.setBounds(80,230,30,30);
		b15.setBounds(120,230,30,30);
		b16.setBounds(160,230,30,30);
		
		
		
		
		
		//Add Listeners
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing()
			{
				System.exit(0);
			}
			
		});
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		
		
		
		
		
	}
	//Listeners Method
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			t1.setText(t1.getText()+"1");
		}
		if(e.getSource()==b2)
		{
			t1.setText(t1.getText()+"2");
		}
		if(e.getSource()==b3)
		{
			t1.setText(t1.getText()+"3");
		}
		
		if(e.getSource()==b5)
		{
			t1.setText(t1.getText()+"4");
		}
		if(e.getSource()==b6)
		{
			t1.setText(t1.getText()+"5");
		}
		if(e.getSource()==b7)
		{
			t1.setText(t1.getText()+"6");
		}
		
		if(e.getSource()==b9)
		{
			t1.setText(t1.getText()+"7");
		}
		if(e.getSource()==b10)
		{
			t1.setText(t1.getText()+"8");
		}
		if(e.getSource()==b11)
		{
			t1.setText(t1.getText()+"9");
		}

		if(e.getSource()==b13)
		{
			t1.setText(t1.getText()+"0");
		}
		if(e.getSource()==b14)
		{
			t1.setText(t1.getText()+".");
		}
		
	
		if(e.getSource()==b4)
		{
			  s1=t1.getText();
			  t1.setText("");
			  c=1;
		}
		  if(e.getSource()==b15)
		{
			  s2=t1.getText();
			  if(c==1)
			  {
				  int n=Integer.parseInt(s1)+Integer.parseInt(s2);
				  t1.setText(""+n);
			  }
		}
		
		if(e.getSource()==b8)
		{
			  s1=t1.getText();
			  t1.setText("");
			  c=2;
		}
		  if(e.getSource()==b15)
		{
			  s2=t1.getText();
			  if(c==2)
			  {
				  int n=Integer.parseInt(s1)-Integer.parseInt(s2);
				  t1.setText(""+n);
			  }
		}
		
		if(e.getSource()==b4)
		{
			  s1=t1.getText();
			  t1.setText("");
			  c=3;
		}
		  if(e.getSource()==b15)
		{
			  s2=t1.getText();
			  if(c==3)
			  {
				  int n=Integer.parseInt(s1)*Integer.parseInt(s2);
				  t1.setText(""+n);
			  }
		}
		
		if(e.getSource()==b4)
		{
			  s1=t1.getText();
			  t1.setText("");
			  c=4;
		}
		  if(e.getSource()==b15)
		{
			  s2=t1.getText();
			  if(c==4)
			  {
				  int n=Integer.parseInt(s1)/Integer.parseInt(s2);
				  t1.setText(""+n);
			  }
		}
		
		
		
	}
	
}
class Scalci
{
	public static void main(String args[])
	{
		new Calculator();
	}
}