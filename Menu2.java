import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;


public class Menu2 extends JPanel
{


	static JFrame f = new JFrame("CGPA® App for Project Presentation");
	
	JButton name1 = new JButton("GPA CALCULATOR");
	
	JButton name2 = new JButton("CGPA CALCULATOR");
	
	JButton name4 = new JButton("GENERATE REPORT");

	JButton name3 = new JButton("BACK");

		
	Color barColor = new Color(30,195,245);
	

	
	Image img = new ImageIcon("grade.png").getImage();


	Color background = new Color(0,160,216);



	public Menu2(){
	


	setLayout(null);
	f.setSize(1350,750);
	
	name1.setBounds(900,100,400,100);
	name1.setFont(new Font("Dialog", 1, 20));
	name1.setHorizontalAlignment(SwingConstants.CENTER);
	name1.setBackground(background);
	name1.setForeground(Color.white);
	
	add(name1);
	name1.addActionListener(

	new ActionListener(){
	
	public void actionPerformed(ActionEvent e){

	//Creating new class to show new frame

	new GPA();
	GPA.f.setVisible(true);
	f.setVisible(false);
	
	

	}

	});
	
	
	
	name2.setBounds(900,250,400,100);
	name2.setFont(new Font("Dialog", 1, 20));
	name2.setHorizontalAlignment(SwingConstants.CENTER);
	name2.setBackground(background);
	name2.setForeground(Color.white);
	add(name2);
	name2.addActionListener(
	
	new ActionListener(){
	
	public void actionPerformed(ActionEvent e){
	

	f.setVisible(false);
	new CGPA(); 
	

	}



	});
	
	name3.setBounds(900,550,400,100);
	name3.setFont(new Font("Dialog", 1, 20));
	name3.setHorizontalAlignment(SwingConstants.CENTER);
	name3.setBackground(background);
	name3.setForeground(Color.white);
	add(name3);
	name3.addActionListener(

	
	new ActionListener(){


	
	public void actionPerformed(ActionEvent e){

	
	new Menu();
	f.setVisible(false);
	 
	

		}

	});
	
	
	
	
	name4.setBounds(900,400,400,100);
	name4.setFont(new Font("Dialog", 1, 20));
	name4.setHorizontalAlignment(SwingConstants.CENTER);
	name4.setBackground(background);
	name4.setForeground(Color.white);add(name4);
	name4.addActionListener(

	
	new ActionListener(){


	
	public void actionPerformed(ActionEvent e){

	f.setVisible(true);
	new Splash2();
	
	 
	

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

	new Menu2();


	}




}
