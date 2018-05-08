import java.awt.EventQueue;

import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;

public class Calculator{

	private JFrame frame;
	JFormattedTextField display1,display2;
	JButton B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17;
	JButton B18,B19,B20,B21,B22,B23,B24,B25,B26,B27,B28,B29;

	public Calculator() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u8BA1\u7B97\u5668");
		frame.getContentPane().setBackground(new Color(153, 204, 255));
		frame.setBounds(700, 300, 387, 377);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		display1 = new JFormattedTextField("");
		display1.setForeground(Color.BLACK);
		display1.setHorizontalAlignment(JLabel.RIGHT);
		display1.setFont(new Font("宋体", Font.PLAIN, 23));
		display1.setBackground(SystemColor.inactiveCaptionBorder);
		display1.setBounds(14, 13, 350, 31);
		frame.getContentPane().add(display1);
		
		B1 = new JButton("(");
		B1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		B1.setBackground(new Color(245, 255, 250));
		B1.setBounds(14, 99, 54, 37);
		frame.getContentPane().add(B1);
		
		display2 = new JFormattedTextField("0");
		display2.setForeground(Color.BLACK);
		display2.setHorizontalAlignment(JLabel.RIGHT);
		display2.setFont(new Font("宋体", Font.BOLD, 28));
		display2.setBackground(SystemColor.inactiveCaptionBorder);
		display2.setBounds(14, 43, 350, 43);
		frame.getContentPane().add(display2);
		display1.setBorder(new LineBorder(new Color(242,247,252)));  
	    display2.setBorder(new LineBorder(new Color(242,247,252)));  
	    display1.setEnabled(false);  
        display2.setEnabled(false);
        display1.setDisabledTextColor(Color.BLACK);  
        display2.setDisabledTextColor(Color.BLACK);
        
		B2 = new JButton(")");
		B2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		B2.setBackground(new Color(245, 255, 250));
		B2.setBounds(74, 99, 54, 37);
		frame.getContentPane().add(B2);
		
		B3 = new JButton("C");
		B3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		B3.setBackground(new Color(245, 255, 250));
		B3.setBounds(133, 99, 54, 37);
		frame.getContentPane().add(B3);
		
		B4 = new JButton("\u00F7");
		B4.setFont(new Font("Times New Roman", Font.PLAIN, 33));
		B4.setBackground(new Color(245, 255, 250));
		B4.setBounds(193, 99, 54, 37);
		frame.getContentPane().add(B4);
		
		B5 = new JButton("\u00D7");
		B5.setFont(new Font("Times New Roman", Font.PLAIN, 33));
		B5.setBackground(new Color(245, 255, 250));
		B5.setBounds(253, 99, 54, 37);
		frame.getContentPane().add(B5);
		
		B6 = new JButton("\u2190");
		B6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		B6.setBackground(new Color(245, 255, 250));
		B6.setBounds(310, 99, 54, 37);
		frame.getContentPane().add(B6);
		
		B7 = new JButton("%");
		B7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		B7.setBackground(new Color(245, 255, 250));
		B7.setBounds(14, 149, 54, 37);
		frame.getContentPane().add(B7);
		
		B8 = new JButton("X!");
		B8.setBackground(new Color(245, 255, 250));
		B8.setBounds(74, 149, 54, 37);
		frame.getContentPane().add(B8);
		
		B9 = new JButton("7");
		B9.setFont(new Font("黑体", Font.PLAIN, 17));
		B9.setBackground(new Color(245, 255, 250));
		B9.setBounds(133, 149, 54, 37);
		frame.getContentPane().add(B9);
		
		B10 = new JButton("8");
		B10.setFont(new Font("黑体", Font.PLAIN, 17));
		B10.setBackground(new Color(245, 255, 250));
		B10.setBounds(193, 149, 54, 37);
		frame.getContentPane().add(B10);
		
		B11 = new JButton("9");
		B11.setFont(new Font("黑体", Font.PLAIN, 17));
		B11.setBackground(new Color(245, 255, 250));
		B11.setBounds(253, 149, 54, 37);
		frame.getContentPane().add(B11);
		
		B12 = new JButton("\u2014");
		B12.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		B12.setBackground(new Color(245, 255, 250));
		B12.setBounds(310, 149, 54, 37);
		frame.getContentPane().add(B12);
		
		B13 = new JButton("x^y");
		B13.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		B13.setBackground(new Color(245, 255, 250));
		B13.setBounds(14, 199, 54, 37);
		frame.getContentPane().add(B13);
		
		B14 = new JButton("1/x");
		B14.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		B14.setBackground(new Color(245, 255, 250));
		B14.setBounds(74, 199, 54, 37);
		frame.getContentPane().add(B14);
		
		B15 = new JButton("4");
		B15.setFont(new Font("黑体", Font.PLAIN, 17));
		B15.setBackground(new Color(245, 255, 250));
		B15.setBounds(133, 199, 54, 37);
		frame.getContentPane().add(B15);
		
		B16 = new JButton("5");
		B16.setFont(new Font("黑体", Font.PLAIN, 17));
		B16.setBackground(new Color(245, 255, 250));
		B16.setBounds(193, 199, 54, 37);
		frame.getContentPane().add(B16);
		
		B17 = new JButton("6");
		B17.setFont(new Font("黑体", Font.PLAIN, 17));
		B17.setBackground(new Color(245, 255, 250));
		B17.setBounds(253, 199, 54, 37);
		frame.getContentPane().add(B17);
		
		B18 = new JButton("+");
		B18.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		B18.setBackground(new Color(245, 255, 250));
		B18.setBounds(310, 199, 54, 37);
		frame.getContentPane().add(B18);
		
		B19 = new JButton("\u221Ax");
		B19.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		B19.setBackground(new Color(245, 255, 250));
		B19.setBounds(14, 249, 54, 37);
		frame.getContentPane().add(B19);
		
		B24 = new JButton("x\u00B2");
		B24.setFont(new Font("宋体", Font.PLAIN, 18));
		B24.setBackground(new Color(245, 255, 250));
		B24.setBounds(14, 293, 54, 37);
		frame.getContentPane().add(B24);
		
		B20 = new JButton("log");
		B20.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		B20.setBackground(new Color(245, 255, 250));
		B20.setBounds(74, 249, 54, 37);
		frame.getContentPane().add(B20);
		
		B25 = new JButton("π");
		B25.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		B25.setBackground(new Color(245, 255, 250));
		B25.setBounds(74, 293, 54, 37);
		frame.getContentPane().add(B25);
		
		B21 = new JButton("1");
		B21.setFont(new Font("黑体", Font.PLAIN, 17));
		B21.setBackground(new Color(245, 255, 250));
		B21.setBounds(133, 249, 54, 37);
		frame.getContentPane().add(B21);
		
		B22 = new JButton("2");
		B22.setFont(new Font("黑体", Font.PLAIN, 17));
		B22.setBackground(new Color(245, 255, 250));
		B22.setBounds(193, 249, 54, 37);
		frame.getContentPane().add(B22);
		
		B23 = new JButton("3");
		B23.setFont(new Font("黑体", Font.PLAIN, 17));
		B23.setBackground(new Color(245, 255, 250));
		B23.setBounds(253, 249, 54, 37);
		frame.getContentPane().add(B23);
		
		B27 = new JButton(".");
		B27.setFont(new Font("黑体", Font.PLAIN, 17));
		B27.setBackground(new Color(245, 255, 250));
		B27.setBounds(253, 293, 54, 37);
		frame.getContentPane().add(B27);
		
		B26 = new JButton("0");
		B26.setFont(new Font("黑体", Font.PLAIN, 17));
		B26.setBackground(new Color(245, 255, 250));
		B26.setBounds(133, 293, 114, 37);
		frame.getContentPane().add(B26);
		
		B28 = new JButton("=");
		B28.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		B28.setBackground(new Color(175, 238, 238));
		B28.setBounds(310, 249, 54, 81);
		frame.getContentPane().add(B28);
		frame.setResizable(false);
		frame.setVisible(true);
		ButtonListener listen = new ButtonListener();
		B1.addActionListener(listen);
		B2.addActionListener(listen);
		B3.addActionListener(listen);
		B4.addActionListener(listen);
		B5.addActionListener(listen);
		B6.addActionListener(listen);
		B7.addActionListener(listen);
		B8.addActionListener(listen);
		B9.addActionListener(listen);
		B10.addActionListener(listen);
		B11.addActionListener(listen);
		B12.addActionListener(listen);
		B13.addActionListener(listen);
		B14.addActionListener(listen);
		B15.addActionListener(listen);
		B16.addActionListener(listen);
		B17.addActionListener(listen);
		B18.addActionListener(listen);
		B19.addActionListener(listen);
		B20.addActionListener(listen);
		B21.addActionListener(listen);
		B22.addActionListener(listen);
		B23.addActionListener(listen);
		B24.addActionListener(listen);
		B25.addActionListener(listen);
		B26.addActionListener(listen);
		B27.addActionListener(listen);
		B28.addActionListener(listen);
	}       
	class ButtonListener implements ActionListener{
		    int flag = 1;
			int flag1 = 0;
		public void actionPerformed(ActionEvent e)
		{
			 
			JButton source = (JButton)e.getSource();
			if(source == B1)
				display1.setText(display1.getText()+"(");
			if(source == B2)
			{
				//if(flag == 1)
					display1.setText(display1.getText()+display2.getText()+")");
					flag = 1;
				/*else
				    display1.setText(display1.getText()+")");
				    */
			}
			if(source == B3){
				display1.setText("");
				display2.setText("0");
				flag = 1;
			}
			if(source == B4){
				if(flag==1)
				    display1.setText(display1.getText()+"÷");
				else
					display1.setText(display1.getText()+display2.getText()+"÷");
				flag = 1;
			}
			if(source == B5){
				if(flag==1)
					display1.setText(display1.getText()+"×");
				else
					display1.setText(display1.getText()+display2.getText()+"×");
				flag = 1;
			}
			if(source == B6){
				display2.setText("0");
				flag = 1;
			}
			if(source == B7){
				if(flag==1)
					display1.setText(display1.getText()+"%");
				else
					display1.setText(display1.getText()+display2.getText()+"%");
				flag = 1;
			}
			if(source == B8){
				if(flag==1)
					display1.setText(display1.getText()+"!");
				else
					display1.setText(display1.getText()+display2.getText()+"!");
				flag = 1;
			}
			if(source == B9){
				if(flag == 1){
				    display2.setText("7");
				    flag = 0;
				}
				else
					display2.setText(display2.getText()+"7");
			}
			if(source == B10)
			{
				if(flag == 1){
				    display2.setText("8");
				    flag = 0;
				}
				else
					display2.setText(display2.getText()+"8");
			}
			if(source == B11)
			{
				if(flag == 1){
				    display2.setText("9");
				    flag = 0;
				}
				else
					display2.setText(display2.getText()+"9");
			}
			if(source == B12)
			{
				if(flag==1)
					display1.setText(display1.getText()+"-");
				else
					display1.setText(display1.getText()+display2.getText()+"-");
				flag = 1;
			}
			if(source == B13)
			{
				if(flag==1)
					display1.setText(display1.getText()+"^");
				else
					display1.setText(display1.getText()+display2.getText()+"^");
				flag = 1;
			}
			if(source == B14)
			{
					display1.setText(display1.getText()+"1÷");
			}
			if(source == B15){
				if(flag == 1){
				    display2.setText("4");
				    flag = 0;
				}
				else
					display2.setText(display2.getText()+"4");
			}
			if(source == B16)
			{
				if(flag == 1){
				    display2.setText("5");
				    flag = 0;
				}
				else
					display2.setText(display2.getText()+"5");
			}
			if(source == B17)
			{
				if(flag == 1){
				    display2.setText("6");
				    flag = 0;
				}
				else
					display2.setText(display2.getText()+"6");
			}
			if(source == B18)
			{
				if(flag==1)
					display1.setText(display1.getText()+"+");
				else
					display1.setText(display1.getText()+display2.getText()+"+");
				flag = 1;
			}
			if(source == B19)
			{
				if(flag==1)
					display1.setText(display1.getText()+"√");
				else
					display1.setText(display1.getText()+display2.getText()+"√");
				flag = 1;
			}
			if(source == B20)
			{
				if(flag==1)
					display1.setText(display1.getText()+"㏒");
				else
					display1.setText(display1.getText()+display2.getText()+"㏒");
				flag = 1;
			}
			if(source == B21){
				if(flag == 1){
				    display2.setText("1");
				    flag = 0;
				}
				else
					display2.setText(display2.getText()+"1");
			}
			if(source == B22)
			{
				if(flag == 1){
				    display2.setText("2");
				    flag = 0;
				}
				else
					display2.setText(display2.getText()+"2");
			}
			if(source == B23)
			{
				if(flag == 1){
				    display2.setText("3");
				    flag = 0;
				}
				else
					display2.setText(display2.getText()+"3");
			}
			if(source == B24)
			{
				if(flag==1)
					display1.setText(display1.getText()+"²");
				else
					display1.setText(display1.getText()+display2.getText()+"²");
				flag = 1;
			}
			if(source == B25){
				    display2.setText("π");
				    flag = 0;
			}
			if(source == B26)
			{
				if(flag == 1){
				    display2.setText("0");
				    flag = 0;
				}
				else
					display2.setText(display2.getText()+"0");
			}
			if(source == B27)
			{
				display2.setText(display2.getText()+".");
			}
			if(source == B28)
			{
				if(flag == 0){
					display1.setText(display1.getText()+display2.getText());
				}
				String str = display1.getText();
				InDirectCal Cal = new InDirectCal();
				display2.setText(Cal.inDirect(str));
				flag = 1;
			}
		}
	}
}
