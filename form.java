package windowsbuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class form extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_4;
	private JTextArea textArea;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form frame = new form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public form() {
		setBounds(100, 100, 573, 352);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Form");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(228, 11, 102, 33);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(77, 67, 77, 33);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("E-mail");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(77, 111, 77, 27);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Mobile No");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(77, 154, 95, 33);
		getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(222, 75, 96, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(222, 116, 96, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(222, 162, 96, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(77, 198, 210, 58);
		getContentPane().add(textArea);

//		
//		JButton btnNewButton = new JButton("Clear");
//		btnNewButton.setBounds(123, 267, 89, 23);
//		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				String e_mail=textField_1.getText();
				//long num=Integer.parseInt(textField_2.getText());
				String num=textField_2.getText();
				textArea.setText("The name is " + name + " \n The e-mail address is " + 
				e_mail + "\nThe mobile number is " +num);
				
			}
		});
		btnNewButton_1.setBounds(318, 266, 89, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textArea.setText("");
			}
		});
		btnNewButton.setBounds(178, 266, 89, 23);
		getContentPane().add(btnNewButton);
		
	}
}
