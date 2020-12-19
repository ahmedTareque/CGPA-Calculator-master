import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.Timer;


public class Splash2 extends JPanel{


		int i = 0;
		
		JFrame frame = new JFrame("SPLASH");
		
		JProgressBar bar = new JProgressBar(0,100);
		
		Timer time = null;
		
		JLabel label2 = new JLabel();
		
		Random r = new Random();
		
		public Splash2(){
		
			frame.setUndecorated(true);
			frame.setSize(400,100);
			frame.setDefaultCloseOperation(3);
			setBackground(new Color(0,80,150));
			
			frame.add(this);
			
			setLayout(null);
			
			bar.setBounds(20,50,360,10);
			bar.setValue(i);
			bar.setIndeterminate(true);
			bar.setBorderPainted(true);
			add(bar);
		
			
			setBorder(BorderFactory.createLineBorder(Color.black));
			
			frame.setVisible(true);
			frame.setLocationRelativeTo(null);
			time = new Timer(150, new MyTimer());
			time.start();
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

			

				new Splash2();
			
			}

			
			
			public void paintComponent(Graphics g){
			
				super.paintComponent(g);
				
					g.drawImage(new ImageIcon("bg.JPG").getImage(),0,0,getWidth(), getHeight(),this);
				g.setColor(Color.white);
					g.setFont(new Font("Dialog", 1, 30));
				
					g.drawString("Grade", 128,35);
				g.setColor(Color.red);
					g.drawString("Soft", 215,36);
				g.setFont(new Font("Dialog", 1, 14));
				g.setColor(Color.white);
					g.drawString("starting... ", 180,80);
					
			
			}
// this the best way to write a string
			
			

				class MyTimer implements ActionListener{
						
					public void actionPerformed(ActionEvent evt){
						
						int k = r.nextInt(7);
						
						i = i + k;
						
						if(i < 100 ){
						
							bar.setValue(i);
							
							
						
						}					
						
						else{
						
						frame.dispose();
						time.stop();
						new Menu();
						//Welcome.f.dispose();
						
						
						}
					
					
					
					
					}
					
					
					
					
					
					}
}
