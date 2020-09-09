package gfn_freiburg_public;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class rechner implements ActionListener{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNotification_1;
	private JLabel lblNotification_2;
	
	JButton btnNewButton;
    JButton btnNewButton_1;
	
	float number1 = 0;
	float number2 = 0;
	float result = 0;
	String ausgabe = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rechner window = new rechner();
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
	public rechner() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(127, 21, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(127, 70, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		btnNewButton = new JButton("Addition");
		btnNewButton.setBounds(127, 143, 89, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener((ActionListener) this);
		
		btnNewButton_1 = new JButton("Subtraktion");
		btnNewButton_1.setBounds(250, 143, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener((ActionListener) this);
		
		textField_2 = new JTextField();
		textField_2.setBounds(127, 198, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Zahl 1:");
		lblNewLabel.setBounds(38, 24, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Zahl 2:");
		lblNewLabel_1.setBounds(38, 73, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ausgabe");
		lblNewLabel_2.setBounds(38, 201, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNotification_1 = new JLabel("Bitte Zahl 1 eingeben");
		lblNotification_1.setEnabled(true);
		lblNotification_1.setVisible(false);
		lblNotification_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNotification_1.setBounds(244, 23, 135, 14);
		frame.getContentPane().add(lblNotification_1);
		
		lblNotification_2 = new JLabel("Bitte Zahl 2 \r\neingeben");
		lblNotification_2.setEnabled(true);
		lblNotification_2.setVisible(false);
		lblNotification_2.setFont(new Font("Arial", Font.BOLD, 13));
		lblNotification_2.setBounds(244, 70, 150, 36);
		frame.getContentPane().add(lblNotification_2);
	}
	
	public void actionPerformed (ActionEvent ae){
        // Die Quelle wird mit getSource() abgefragt und mit den
        // Buttons abgeglichen. Wenn die Quelle des ActionEvents einer
        // der Buttons ist, wird die entsprechende Aktion ausgeführt
        if(ae.getSource() == this.btnNewButton){
        	
        	if(textField.getText().length() != 0)
        	{
        			number1 = Float.parseFloat(textField.getText());  //Umwandlung der 1. Eingabe in eine Kommazahl
        			if (lblNotification_1.isVisible())
        			{
        				lblNotification_1.setVisible(false);
        			}
        	}
        	else
        	{
        		lblNotification_1.setVisible(true);
        	}
        	if(textField_1.getText().length() != 0)
        	{
        		number2 = Float.parseFloat(textField_1.getText());  //Umwandlung der 2. Eingabe in eine Kommazahl
        		if (lblNotification_2.isVisible())
    			{
    				lblNotification_2.setVisible(false);
    			}
        	}
        	else {
        		lblNotification_2.setVisible(true);
        	}
    		if(number1 != 0 && number2 != 0)
    		{	
        	result = number1 + number2;									//Addition
    		ausgabe = Float.toString(result);					        //Umwandlung einer Kommazahl in einen String
    		textField_2.setText(ausgabe);	
    		}
        }	
        else if(ae.getSource() == this.btnNewButton_1){
        	if(textField.getText().length() != 0)
        	{
        			number1 = Float.parseFloat(textField.getText());  //Umwandlung der 1. Eingabe in eine Kommazahl
        			if (lblNotification_1.isVisible())
        			{
        				lblNotification_1.setVisible(false);
        			}
        	}
        	else
        	{
        		lblNotification_1.setVisible(true);
        	}
        	if(textField_1.getText().length() != 0)
        	{
        		number2 = Float.parseFloat(textField_1.getText());  //Umwandlung der 2. Eingabe in eine Kommazahl
        		if (lblNotification_2.isVisible())
    			{
    				lblNotification_2.setVisible(false);
    			}
        	}
        	else {
        		lblNotification_2.setVisible(true);
        	}
        	
        	if(number1 != 0 && number2 != 0)
    		{
        		result = number1 - number2;									//Subtraktion
        		ausgabe = Float.toString(result);					        //Umwandlung einer Kommazahl in einen String
        		textField_2.setText(ausgabe);
        		System.out.println("OK");
    		}
        }
        
    }
}

