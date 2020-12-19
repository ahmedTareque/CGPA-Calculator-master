import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;


public class Report extends JPanel
{


JFrame f = new JFrame("CGPA Calculator");
	
	
	
	Color barColor = new Color(30,195,245);

	Font font1 = new Font("Dialog", 1, 16);
	
	

	public Report(){
	
	
	setLayout(null);
	f.setSize(1350,750);




	

	
	setBackground(Color.white);
	setBounds(0,0,f.getWidth(), f.getHeight());
	
	f.add(this);
	f.setDefaultCloseOperation(3);
	f.setVisible(true);
	
	}


	



	

	public static void main(String args[]){

	new Report();


	}




}
