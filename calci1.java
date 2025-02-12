import java.awt.*;
import java.awt.event.*;

class my extends Frame
{
	Label l1;
	Button b1,b2;
	my()
	{
		setTitle("aniket");
		setLocation(200,300);
		setSize(200,300);
		setVisible(true);
		setLayout(null);
		
		l1= new Label("simple Calculator");
		
		b1=new Button("1");
		b2=new Button("2");
		
		
		add(l1);
		add(b1);add(b2);
		
		
		
		addWindowListener(new windowAdapter()
		{
		public void WindowClosing(Event e)
		{
			System.exit(0);
		}
		}
		);
	}
}




class calci1
{
	public static void main(String args[])
	{
		new  my();
	}
}

/*
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
*/