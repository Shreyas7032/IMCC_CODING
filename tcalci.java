import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class frame extends JFrame implements ActionListener
{
JPanel p1;
JButton b[];
JButton ad,sub,mul,div,ze,po,equal,clr,ext;
JTextField t1;
Cursor c;
int co;
double d1,d2,d3;
frame()
{
setSize(500,600);
setLocation(400,50);
setLayout(null);

// memory Allocation

p1=new JPanel();
b=new JButton[10];
ad=new JButton("+");sub=new JButton("-");
mul=new JButton("*");div=new JButton("/");
ze=new JButton("0");po=new JButton(".");
equal=new JButton("=");clr=new JButton("clr");
ext=new JButton("EXT");

t1=new JTextField();
c=new Cursor(HAND_CURSOR);
// add


add(p1);
add(t1);
p1.setLayout(new GridLayout(3,3,10,10));
for(int i=1;i<10;i++)
{
b[i]=new JButton(""+i);
p1.add(b[i]);
}

add(ad);add(sub);add(mul);add(ze);add(po);add(equal);add(div);
add(ext);add(clr);





//SetBounds
t1.setBounds(100,120,270,60);
p1.setBounds(100,200,200,200);
ad.setBounds(320,200,55,60);
sub.setBounds(320,270,55,60);
mul.setBounds(320,340,55,60);
ze.setBounds(100,410,55,60);
po.setBounds(175,410,55,60);
equal.setBounds(245,410,55,60);
div.setBounds(320,410,55,60);
clr.setBounds(100,480,130,60);
ext.setBounds(250,480,130,60);





//p1.setBackground(Color.YELLOW);
//add listeners

for(int i=1;i<10;i++)
{
b[i].addActionListener(this);
b[i].setCursor(c);
}
ad.addActionListener(this);sub.addActionListener(this);
mul.addActionListener(this);
div.addActionListener(this);

ze.addActionListener(this);
po.addActionListener(this);
equal.addActionListener(this);
clr.addActionListener(this);
ext.addActionListener(this);

setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b[1]||e.getSource()==b[2]||e.getSource()==b[3]||e.getSource()==b[4]||e.getSource()==b[5]||e.getSource()==b[6]||e.getSource()==b[7]||e.getSource()==b[8]||e.getSource()==b[9]||e.getSource()==ze)
{
if(t1.getText().length()==0)
     t1.setText(e.getActionCommand());
else
t1.setText(t1.getText()+e.getActionCommand());
}
if(e.getSource()==ad)
{
d1=Double.parseDouble(t1.getText());
t1.setText(" ");
co=1;
}
if(e.getSource()==sub)
{
d1=Double.parseDouble(t1.getText());
t1.setText(" ");
co=2;
}
if(e.getSource()==mul)
{
d1=Double.parseDouble(t1.getText());
t1.setText(" ");
co=3;
}
if(e.getSource()==div)
{
d1=Double.parseDouble(t1.getText());
t1.setText(" ");
co=4;
}
if(e.getSource()==equal)
{
d2=Double.parseDouble(t1.getText());
if(co==1) t1.setText(""+(d1+d2));
if(co==2) t1.setText(""+(d1-d2));
if(co==3) t1.setText(""+(d1*d2));
if(co==4) t1.setText(""+(d1/d2));
}

if(e.getSource()==clr)
t1.setText("");
if(e.getSource()==ext)
System.exit(0);
}
}
class tcalci
{
public static void main(String args[])
{
new frame();
}
}