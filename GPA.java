import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.text.MaskFormatter;



public class GPA extends JPanel implements CaretListener
{

	JPanel panel1 = new JPanel();
	
	static JFrame f = new JFrame("CGPA Calculator");

	
	static JTextField update = new JTextField("10");
	JButton updateB = new JButton("UPDATE");
	
	
	
	
	
	static int ok1;


	static int subby2  = Integer.parseInt(update.getText());
	

	
	static JTextField sField[][] = new JTextField[subby2 + 1][6];


	Color barColor = new Color(30,195,245);

	


	JPanel top = new JPanel();



	JButton button1 = new JButton("Calculate");
	JButton button2 = new JButton("reset");
	JButton button3 = new JButton("back");
	


	MaskFormatter format;
	
	JFormattedTextField field1;
	JFormattedTextField field2 = new JFormattedTextField();
	


	


	String getGrades;
	String getCU;
	double multiply;
	double getGrades1;
	double getCU1;
	double gp;



	JScrollPane scroll = new JScrollPane();

	


	String grd;



	public static int i = 1;
	public static int k = 1;






	public GPA(){


	//update = new JTextField("");
	update.setBounds(750,500,100,30);
	update.setFont(new Font("Dialog", 1, 15));
	add(update);
	
	


	
	try{


	format = new MaskFormatter("#.##");


	}
	catch(Exception e){}


	
	field1 = new JFormattedTextField(format);
	field1.setBounds(1000,80,250,120);
	field1.setEditable(false);
	field1.setBackground(barColor);
	field1.setBorder(BorderFactory.createTitledBorder("Your GPA is:"));
	add(field1);

	field2.setBounds(1000,240,250,120);
	field2.setEditable(false);
	field2.setBackground(barColor);
	field2.setBorder(BorderFactory.createTitledBorder("Your total credit units is:"));
	add(field2);

	

	
	
	for ( i = 1 ;i < (subby2 + 1)  ; i++){ //horizontal rows

	for(  k = 1; k < 6 ;k++){  //vertical columns
	
	

	sField[i][k] = new JTextField(10);


	sField[i][k].setHorizontalAlignment(JTextField.CENTER);
		
	sField[i][k].setBorder(BorderFactory.createLineBorder(barColor,2));

	sField[i][1].setText(i + "");
	sField[i][1].setEditable(false);
	sField[i][1].setBackground(barColor);
	sField[i][1].setForeground(Color.white);
	sField[i][1].setFont(new Font("Dialog", 1, 15));
	//sField[i][1].setBorder(BorderFactory.createTitledBorder(""));
	

	//sField[i][k].setActionCommand(i + "");

		sField[i][k].setName(i + "");
	
	




		if(k==4){
		
		JTextField s = (JTextField)sField[i][k];

			//sField[i][k].addCaretListener(this);
			s.addCaretListener(this);
		}

		if(k==5){

			sField[i][k].setEditable(false);
		}

	
	

	
	panel1.add(sField[i][k]);
	
	
	
		}
	}
	

	
	update.setText("enter");


	
	
	updateB.setBounds(880,500,100,30);
	updateB.setBackground(barColor);
	updateB.setFont(new Font("Dialog", 1, 15));
	updateB.setForeground(Color.white);
	add(updateB);
	
	updateB.addActionListener(

	new ActionListener(){

	public void actionPerformed(ActionEvent t){

	panel1.removeAll();

	try{
	
	subby2 = Integer.parseInt(update.getText());
	
	
	GPA.sField = new JTextField[subby2 + 1][6];

	
	
	
	
	for ( i = 1 ;i < (subby2 + 1) ; i++){ //horizontal rows

	for(  k = 1; k < 6 ;k++){  //vertical columns
	
	

	sField[i][k] = new JTextField(10);


	sField[i][k].setHorizontalAlignment(JTextField.CENTER);
		
	sField[i][k].setBorder(BorderFactory.createLineBorder(barColor,2));

	sField[i][1].setText(i + "");
	sField[i][1].setEditable(false);
	sField[i][1].setBackground(barColor);
	sField[i][1].setForeground(Color.white);
	sField[i][1].setFont(new Font("Dialog", 1, 15));
	//sField[i][1].setBorder(BorderFactory.createTitledBorder(""));
	

	//sField[i][k].setActionCommand(i + "");

		sField[i][k].setName(i + "");
	
	




		if(k==4){


			JTextField s = (JTextField)sField[i][k];

			s.addCaretListener(


	new CaretListener(){
	

	public void caretUpdate(CaretEvent v){

		JTextField tx = (JTextField)v.getSource();
		int index = Integer.parseInt(tx.getName());
		int value = Integer.parseInt(tx.getText());

		grd = calGrade(value);
		sField[index][5].setText(grd);
		sField[index][5].setFont(new Font("Dialog", 1, 20));

	
	if(grd.equals("A")){
		
	sField[index][5].setForeground(Color.black);

	}
	
	else if(grd.equals("B")){
		
	sField[index][5].setForeground(Color.black);

	}
	
	else if(grd.equals("C")){
		
	sField[index][5].setForeground(Color.black);

	}

	else if(grd.equals("D")){
		
	sField[index][5].setForeground(Color.black);

	}

	else if(grd.equals("E")){
		
	sField[index][5].setForeground(Color.black);

	}
	
	else if(grd.equals("F")){
		
	sField[index][5].setForeground(Color.red);

	}
	else if(value > 100){
		grd = "INVALID VALUE";
	}

	
	else if(value < 0){
		grd = "INVALID VALUE";
	}



	
		
	}

	}
				
	
	);
		
		
		}

		if(k==5){

			sField[i][k].setEditable(false);
		}

	
	

	
	panel1.add(sField[i][k]);
	
	field1.setText("");
	field2.setText("");
	//update.setText("");
	

		}
	}
	
	

	
	

	panel1.updateUI();
	
	panel1.setPreferredSize(new Dimension(450,(subby2 + 1) * 35));
	scroll.setViewportView(panel1);


	
	}
	catch(java.lang.NumberFormatException g){g.printStackTrace();}

		//{JOptionPane.showMessageDialog(null, "Please input a correct value of subjects");}

	




	}


	});




	
	
	setLayout(null);

	
	panel1.setLayout(new FlowLayout());
	panel1.setBorder(BorderFactory.createLineBorder(barColor, 3));
	scroll.setBackground(Color.white);

	panel1.setPreferredSize(new Dimension(450,(subby2 + 1) * 35));
	scroll.setViewportView(panel1);

	


	
         
         



	


	
	

	





	top.setLayout(new GridLayout(1,5));
	top.add(new Label("                         S/N"));
	top.add(new Label("                 COURSE"));
	top.add(new Label("        CREDIT UNIT"));
	top.add(new Label("        SCORE"));
	top.add(new Label("GRADE"));
	top.setBounds(30,30,675,30);
	top.setBackground(Color.white);
	add(top);



	button1.setBounds( 750,80,200,80);
	add(button1);
	button1.addActionListener(
	
	new ActionListener(){


	public void actionPerformed(ActionEvent e){

	field1.setText("");
	field2.setText("");
	double sum = 0.00;
	double multiply1 = 0.00;
	

	try{

	for ( int k = 1 ;k < (subby2 + 1) ; k++){ //horizontal rows

	

	getGrades = sField[k][4].getText();
	getCU = sField[k][3].getText();

	getGrades1 = Integer.parseInt(getGrades);
	getCU1 = Integer.parseInt(getCU);



	
	if(getGrades1 < 0){
	multiply = getCU1 * 0;


	}
	
	else if(getGrades1 > 39 && getGrades1 < 45){
		multiply = getCU1 * 1;


	}
	
	else if(getGrades1 > 44 && getGrades1 < 50){
	multiply = getCU1 * 2;


	}

	else if(getGrades1 > 49 && getGrades1 < 60){
		multiply = getCU1 * 3;


	}

	 else if(getGrades1  > 59 && getGrades1 < 70){
		multiply = getCU1 * 4;


	}
	
	 else if(getGrades1 > 69 && getGrades1 < 101){
		multiply = getCU1 * 5;
	}

	
	



	sum = sum + getCU1;

	
	multiply1 = multiply1 + multiply;


	
}
	


	field2.setText((int)sum +"");
	field2.setHorizontalAlignment(JTextField.CENTER);
	field2.setFont(new Font("Dialog", 1,50));
	field2.setForeground(Color.white);
	//field2.setBorder(BorderFactory.createBevelBorder(2, Color.red, Color.green));
	
	
	gp = multiply1/sum;
	field1.setText(gp + "");
	field1.setHorizontalAlignment(JTextField.CENTER);
	field1.setFont(new Font("Dialog", 1,50));
	field1.setForeground(Color.white);


	}
	catch(NumberFormatException f){JOptionPane.showMessageDialog(null, "Please input the correct values");}
	

	}

	});
	
	
	button2.setBounds( 750,210,200,80);
	add(button2);
	button2.addActionListener(
	
	new ActionListener(){


	public void actionPerformed(ActionEvent e){

	panel1.removeAll();

	try{
	
	subby2 = 10 ;
	
	
	GPA.sField = new JTextField[subby2 + 1][6];

	
	
	
	
	for ( i = 1 ;i < (subby2 + 1) ; i++){ //horizontal rows

	for(  k = 1; k < 6 ;k++){  //vertical columns
	
	

	sField[i][k] = new JTextField(10);


	sField[i][k].setHorizontalAlignment(JTextField.CENTER);
		
	sField[i][k].setBorder(BorderFactory.createLineBorder(barColor,2));

	sField[i][1].setText(i + "");
	sField[i][1].setEditable(false);
	sField[i][1].setBackground(barColor);
	sField[i][1].setForeground(Color.white);
	sField[i][1].setFont(new Font("Dialog", 1, 15));
	
	

	//sField[i][k].setActionCommand(i + "");

		sField[i][k].setName(i + "");
	
	




		if(k==4){


			JTextField s = (JTextField)sField[i][k];

			s.addCaretListener(


	new CaretListener(){
	

	public void caretUpdate(CaretEvent v){

		JTextField tx = (JTextField)v.getSource();
		int index = Integer.parseInt(tx.getName());
		int value = Integer.parseInt(tx.getText());

		grd = calGrade(value);
		sField[index][5].setText(grd);
		sField[index][5].setFont(new Font("Dialog", 1, 20));

	
	if(grd.equals("A")){
		
	sField[index][5].setForeground(Color.black);

	}
	
	else if(grd.equals("B")){
		
	sField[index][5].setForeground(Color.black);

	}
	
	else if(grd.equals("C")){
		
	sField[index][5].setForeground(Color.black);

	}

	else if(grd.equals("D")){
		
	sField[index][5].setForeground(Color.black);

	}

	else if(grd.equals("E")){
		
	sField[index][5].setForeground(Color.black);

	}
	
	else if(grd.equals("F")){
		
	sField[index][5].setForeground(Color.red);

	}
	else if(value > 100){
		grd = "INVALID VALUE";
	}

	
	else if(value < 0){
		grd = "INVALID VALUE";
	}



	
		
	}

	}
				
	
	);
		
		
		}

		if(k==5){

			sField[i][k].setEditable(false);
		}

	
	

	
	panel1.add(sField[i][k]);
	
	field1.setText("");
	field2.setText("");
	//update.setText("");
	

		}
	}
	
	

	
	

	panel1.updateUI();
	
	panel1.setPreferredSize(new Dimension(450,(subby2 + 1) * 35));
	scroll.setViewportView(panel1);


	
	}
	catch(java.lang.NumberFormatException g){JOptionPane.showMessageDialog(null, "Please input a correct value of subjects");}







	}
});

	
	button3.setBounds( 750,340,200,80);
	add(button3);
	button3.addActionListener(
	
	new ActionListener(){


	public void actionPerformed(ActionEvent e){


	
	new Menu2();
	f.dispose();
	//f.setVisible(false);
	
	
	

	}
	
	});
	



	


	
	scroll.setBounds(20,65,675, 600);
	add(scroll);



	setBackground(Color.white);
	setBounds(0,0,f.getWidth(), f.getHeight());

	
	f.add(this);
	
	f.setSize(1350,750);
	
	f.setVisible(true);
	f.setDefaultCloseOperation(3);
	
	


	}





	public void caretUpdate(CaretEvent v){

		JTextField tx = (JTextField)v.getSource();
		int index = Integer.parseInt(tx.getName());
		int value = Integer.parseInt(tx.getText());

		grd = calGrade(value);
		sField[index][5].setText(grd);
		sField[index][5].setFont(new Font("Dialog", 1, 20));

	
	if(grd.equals("A")){
		
	sField[index][5].setForeground(Color.black);

	}
	
	else if(grd.equals("B")){
		
	sField[index][5].setForeground(Color.black);

	}
	
	else if(grd.equals("C")){
		
	sField[index][5].setForeground(Color.black);

	}

	else if(grd.equals("D")){
		
	sField[index][5].setForeground(Color.black);

	}

	else if(grd.equals("E")){
		
	sField[index][5].setForeground(Color.black);

	}
	
	else if(grd.equals("F")){
		
	sField[index][5].setForeground(Color.red);

	}
	else if(value > 100){
		grd = "INVALID VALUE";
	}

	
	else if(value < 0){
		grd = "INVALID VALUE";
	}



	
		
	}





	public String calGrade(int value){

	String grd = null;
	
	if(value > -1 && value < 40){
		grd = "F";


	}
	
	else if(value > 39 && value < 45){
		grd = "E";


	}
	
	else if(value > 44 && value < 50){
		grd = "D";


	}

	else if(value > 49 && value < 60){
		grd = "C";


	}

	else if(value  > 59 && value < 70){
		grd = "B";


	}
	
	else if(value > 69 && value < 101){
		grd = "A";
	}

	else if(value > 100){
		grd = "ERROR";
	}

	
	else if(value < 0){
		grd = "ERROR";
	}

	
		return grd;

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



	new GPA();
	

	}



}
