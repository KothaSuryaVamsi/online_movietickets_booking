import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Asritha
{
public static void main(String args[])
{
Openpage op=new Openpage();
op.openpage();
}
}
class Openpage 
{
	void openpage()
	{
	JFrame f1=new JFrame("new service");
	f1.setLayout(null);
	f1.setVisible(true);
	f1.setBounds(0,0,540,360);
	Font font=new Font("Consolas",2,30);
        Label l1=new Label("New Service");
	l1.setBounds(0,0,200,50);
	l1.setFont(font);
	f1.add(l1);
 	Label l2=new Label("Name");
	l2.setBounds(50,50,100,50);
	l2.setFont(font);
	f1.add(l2);
	TextField t1=new TextField();
	t1.setBounds(150,50,100,50);
	t1.setFont(font);
	f1.add(t1);
	Label l3=new Label("Type");
	l3.setBounds(300,50,100,50);
	l3.setFont(font);
 	f1.add(l3);
	Choice c1=new Choice();
	f1.add(c1);
	c1.setBounds(400,50,100,50);
	c1.add("Software");
	c1.add("Hardware");
	c1.add("Change");
	c1.add("SIM");
	c1.add("others");
	Label l4=new Label("Description");
	l4.setBounds(0,150,150,50);
	l4.setFont(font);
	f1.add(l4);
 	TextField t3=new TextField();
 	t3.setBounds(150,150,350,100);
	t3.setFont(font);
	f1.add(t3);
	JFrame f2=new JFrame("Running service");
	f2.setLayout(null);
	f2.setVisible(true);
	f2.setBounds(541,0,540,360);
	Label l8=new Label("Name");
	l8.setBounds(10,50,100,50);
	l8.setFont(font);
	f2.add(l8);
	TextField t4=new TextField();
	t4.setBounds(650,50,100,50);
	t4.setFont(font);
	f2.add(t4);
	Label l5=new Label("Type");
	l5.setBounds(800,50,100,50);
	l5.setFont(font);
 	f2.add(l5);
	TextField t5=new TextField();
	t5.setBounds(900,50,100,50);
	t5.setFont(font);
	f2.add(t5);
 	Label l6=new Label("Description");
	l6.setBounds(550,150,150,50);
	l6.setFont(font);
	f2.add(l6);
	TextField t6=new TextField();
	t6.setBounds(700,150,350,100);
	t6.setFont(font);
	f2.add(t6);
	Label l7=new Label("Serial no");
	l7.setBounds(550,250,100,50);
	l7.setFont(font);
	f2.add(l7);
	TextField t7=new TextField();
	t7.setBounds(650,250,100,50);
	t7.setFont(font);
	f2.add(t7);
	Button b1=new Button("Complete");
	b1.setBounds(850,250,100,50);
	b1.setFont(font);
	f2.add(b1);
	}
}




