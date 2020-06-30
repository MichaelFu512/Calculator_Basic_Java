package calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

/**
 * 
 * @author Michael Fu (used Youtube video as base)
 * 
 * Most basic calculator that performs an operation based on two numbers.
 * Can only perform operations with two numbers, with no order of operations implemented.
 *
 */
public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double firstNum; // first number
	double secondNum; // second number
	double result; // (firstNum) operations (secondNum)
	String operations; // what operation to perform
	String answer; // result in string form
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 392);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//place where numbers are displayed
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT); // changes where numbers are displayed inside the JTextField
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(10, 11, 258, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		// ----------------------------Row1------------------------------
		
		// back button
		JButton btnback = new JButton("Å©");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String backspace = null;
				
				if(textField.getText().length() > 0) {
					StringBuilder stringB = new StringBuilder(textField.getText());
					stringB.deleteCharAt(textField.getText().length() - 1);
					backspace = stringB.toString();
					textField.setText(backspace);
				}
			}
		});
		btnback.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnback.setBounds(10, 54, 60, 50);
		frame.getContentPane().add(btnback);
		
		// clear button
		JButton btnclear = new JButton("C");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnclear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnclear.setBounds(76, 54, 60, 50);
		frame.getContentPane().add(btnclear);
		
		// modulus button
		JButton btnpercent = new JButton("%");
		btnpercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		btnpercent.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnpercent.setBounds(142, 54, 60, 50);
		frame.getContentPane().add(btnpercent);
		
		// plus button
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnplus.setBounds(208, 54, 60, 50);
		frame.getContentPane().add(btnplus);
		
		// ----------------------------Row2------------------------------
		
		// 7 button
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String enterNumber = textField.getText() + btn7.getText();
				textField.setText(enterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 115, 60, 50);
		frame.getContentPane().add(btn7);
		
		// 8 button
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					String enterNumber = textField.getText() + btn8.getText();
					textField.setText(enterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(76, 115, 60, 50);
		frame.getContentPane().add(btn8);
		
		// 9 button
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn9.getText();
				textField.setText(enterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(142, 115, 60, 50);
		frame.getContentPane().add(btn9);
		
		// subtract button
		JButton btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnminus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnminus.setBounds(208, 115, 60, 50);
		frame.getContentPane().add(btnminus);
		
		// ----------------------------Row3------------------------------
		
		// button 4
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn4.getText();
				textField.setText(enterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 176, 60, 50);
		frame.getContentPane().add(btn4);
		
		// 5 button
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn5.getText();
				textField.setText(enterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(76, 176, 60, 50);
		frame.getContentPane().add(btn5);
		
		// 6 button
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn6.getText();
				textField.setText(enterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(142, 176, 60, 50);
		frame.getContentPane().add(btn6);
		
		// multiply button
		JButton btnmultiply = new JButton("*");
		btnmultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btnmultiply.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnmultiply.setBounds(208, 176, 60, 50);
		frame.getContentPane().add(btnmultiply);
		
		// ----------------------------Row4------------------------------
		
		// 1 button
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn1.getText();
				textField.setText(enterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 237, 60, 50);
		frame.getContentPane().add(btn1);
		
		// 2 button
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn2.getText();
				textField.setText(enterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(76, 237, 60, 50);
		frame.getContentPane().add(btn2);
		
		// 3 button
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn3.getText();
				textField.setText(enterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(142, 237, 60, 50);
		frame.getContentPane().add(btn3);
		
		// divide button
		JButton btndivide = new JButton("/");
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btndivide.setFont(new Font("Tahoma", Font.BOLD, 20));
		btndivide.setBounds(208, 237, 60, 50);
		frame.getContentPane().add(btndivide);
		
		// ----------------------------Row5------------------------------
		
		// 0 button
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn0.getText();
				textField.setText(enterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(10, 298, 60, 50);
		frame.getContentPane().add(btn0);
		
		// decimal
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btndot.getText();
				textField.setText(enterNumber);
			}
		});
		btndot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btndot.setBounds(76, 298, 60, 50);
		frame.getContentPane().add(btndot);
		
		// positive/negative
		JButton btnplusminus = new JButton("Å}");
		btnplusminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnplusminus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnplusminus.setBounds(142, 298, 60, 50);
		frame.getContentPane().add(btnplusminus);
		
		// equals button
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer; //holds the answer
				
				secondNum = Double.parseDouble(textField.getText()); //makes secondNum the textField
				
				//addition
				if(operations == "+") {
					result = firstNum + secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				//subtract
				else if(operations == "-") {
					result = firstNum - secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				//multiply
				else if(operations == "*") {
					result = firstNum * secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				//division
				else if(operations == "/") {
					result = firstNum / secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				//modulus
				else if(operations == "%") {
					result = firstNum % secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnequal.setBounds(208, 298, 60, 50);
		frame.getContentPane().add(btnequal);
	}
}
