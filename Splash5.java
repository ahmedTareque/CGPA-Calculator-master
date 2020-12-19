import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.Timer;


public class Splash5 extends JPanel{


		int i = 0;
		
		JFrame frame = new JFrame("SPLASH");
		
		JProgressBar bar = new JProgressBar(0,100);
		
		Timer time = null;
		
		JLabel label2 = new JLabel();
		
		Random r = new Random();

		Image tentacles = new ImageIcon("C:/Users/Owner/Desktop/PROJECT/projectcons/tentacles.jpg").getImage();
		

		JLabel starting = new JLabel("Generating Report...");
		

		public Splash5(){
		
			//WinCentralizer.setLocation(frame);
		
			frame.setUndecorated(true);
			frame.setSize(400,150);
			frame.setDefaultCloseOperation(3);
			
			frame.getContentPane().add(this);
			
			setLayout(null);

		

			starting.setBounds(140,80,200,20);
			starting.setForeground(Color.green);
			add(starting);
			
			bar.setBounds(50,65,300,10);
			bar.setValue(i);
			bar.setStringPainted(true);
			//bar.setBorderPainted(true);
			bar.setBackground(Color.white);
			//bar.setVisible(false);
			
			add(bar);




			setBorder(BorderFactory.createLineBorder(Color.green,3));
				
			
			setBorder(BorderFactory.createLineBorder(Color.green,2, true));
			setBackground(Color.black);
			frame.setVisible(true);
			frame.setLocationRelativeTo(null);
			time = new Timer(200, new MyTimer());
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
				
				
				
					g.setFont(new Font("Calibri (Body)", 1, 11));
					
					//g.drawImage(tentacles, 200,80,100,40,this);
					



	//int red = (int) (Math.random() * 255);
	//int green = (int) (Math.random() * 255);
	//int blue = (int) (Math.random() * 255);


	//Color randomColor = new Color(red, green, blue);
	//g.setColor(randomColor);
	//g.fillOval(70,20,50,50);
	

					
				
			
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
						
						new Menu();
						frame.dispose();
						
						//Menu2.f.dispose();
						
						time.stop();
						
						
						}
					
					
					
					
					}
					
					
					
					
					
					}
}
