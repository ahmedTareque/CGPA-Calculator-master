import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;


public class Menu extends JPanel{


	JFrame f = new JFrame("CGPA® App for Project Presentation");
	
	JButton name1 = new JButton("GPA CALCULATOR");
	
	JButton name2 = new JButton("EXIT");

	Image img = new ImageIcon("grade.png").getImage();


	Color background = new Color(0,160,216);


	public Menu(){
	setLayout(null);
	f.setSize(1350,750);
	
	name1.setBounds(900,200,400,100);
	name1.setFont(new Font("Dialog", 1, 20));
	name1.setHorizontalAlignment(SwingConstants.CENTER);
	name1.setBackground(background);
	name1.setForeground(Color.white);
	
	add(name1);
	name1.addActionListener(

	new ActionListener(){

	public void actionPerformed(ActionEvent e){


	new Menu2();
	f.setVisible(false);
	
	}

	});
	
	
	
	name2.setBounds(900,350,400,100);
	name2.setFont(new Font("Dialog", 1, 20));
	name2.setHorizontalAlignment(SwingConstants.CENTER);
	name2.setForeground(Color.white);
	name2.setBackground(background);
	add(name2);
	name2.addActionListener(
	
	new ActionListener(){

	public void actionPerformed(ActionEvent e){

	System.exit(0);
	
	}

	});
	


	
	setBackground(new Color(0,80,150));
	setBounds(0,0,f.getWidth(), f.getHeight());
	
	f.add(this);
	f.setDefaultCloseOperation(3);
	f.setVisible(true);
	
	}


	
	
	public void paintComponent(Graphics g){

	super.paintComponent(g);
	
	g.drawImage(img, -50,120,1000,400,this);


	}



/*
	

	public void actionPerformed(ActionEvent e){

	
	JButton b = (JButton)e.getSource();

	if( b == name1){
	
	new Menu();
	f.setVisible(false);
	
	

	}

	else{

	System.exit(0);
	}



	}

*/

	

	public static void main(String args[]){

	try{
	for(javax.swing.UIManager.LookAndFeelInfo info: javax.swing.UIManager.getInstalledLookAndFeels()){


	if("Nimbus".equals(info.getName())){


	javax.swing.UIManager.setLookAndFeel(info.getClassName());
	break;


	}



	}



	
}
catch(Exception e){}

	new Menu();


	}




}
