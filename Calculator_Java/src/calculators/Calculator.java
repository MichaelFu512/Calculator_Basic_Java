package calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textField;

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
		frame.setBounds(100, 100, 265, 392);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(10, 11, 218, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		// -------------------Row1-------------------------
		
		JButton btnback = new JButton("Å©");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnback.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnback.setBounds(10, 54, 56, 50);
		frame.getContentPane().add(btnback);
		
		JButton btnclear = new JButton("C");
		btnclear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnclear.setBounds(66, 54, 50, 50);
		frame.getContentPane().add(btnclear);
		
		JButton btnpercent = new JButton("%");
		btnpercent.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnpercent.setBounds(122, 54, 56, 50);
		frame.getContentPane().add(btnpercent);
		
		JButton btnplus = new JButton("+");
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnplus.setBounds(188, 54, 50, 50);
		frame.getContentPane().add(btnplus);
		
		// -------------------Row2-------------------------
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String enterNumber = textField.getText() + btn7.getText();
				textField.setText(enterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 106, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(66, 106, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(122, 106, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnminus = new JButton("-");
		btnminus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnminus.setBounds(188, 106, 50, 50);
		frame.getContentPane().add(btnminus);
		
		// -------------------Row3-------------------------
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 167, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(66, 167, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(122, 167, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnmultiply = new JButton("*");
		btnmultiply.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnmultiply.setBounds(188, 167, 50, 50);
		frame.getContentPane().add(btnmultiply);
		
		// -------------------Row4-------------------------
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 228, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(66, 228, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(122, 228, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton btndivide = new JButton("/");
		btndivide.setFont(new Font("Tahoma", Font.BOLD, 20));
		btndivide.setBounds(188, 228, 50, 50);
		frame.getContentPane().add(btndivide);
		
		// -------------------Row4-------------------------
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(10, 292, 50, 50);
		frame.getContentPane().add(btn0);
		
		JButton btndot = new JButton(".");
		btndot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btndot.setBounds(66, 292, 50, 50);
		frame.getContentPane().add(btndot);
		
		JButton btnplusminus = new JButton("Å}");
		btnplusminus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnplusminus.setBounds(122, 292, 50, 50);
		frame.getContentPane().add(btnplusminus);
		
		JButton btnequal = new JButton("=");
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnequal.setBounds(178, 292, 50, 50);
		frame.getContentPane().add(btnequal);
	}
}
