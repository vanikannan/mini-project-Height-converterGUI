import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HeightConverter {

	private JFrame frmHeightconverter;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HeightConverter window = new HeightConverter();
					window.frmHeightconverter.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HeightConverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHeightconverter = new JFrame();
		frmHeightconverter.setTitle("Height_Converter");
		frmHeightconverter.setBounds(100, 100, 450, 300);
		frmHeightconverter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHeightconverter.getContentPane().setLayout(null);
		frmHeightconverter.setLocationRelativeTo(null);
		
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setBounds(26, 32, 332, 33);
		frmHeightconverter.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(26, 165, 332, 33);
		frmHeightconverter.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int heightInCms=Integer.parseInt(textField.getText());
				double sampleinches=heightInCms/2.54;
				int feet=(int)(sampleinches/12);
				int inches=(int)(sampleinches-feet*12);
				
				textField_1.setText(feet + " feet  and "+inches +" inches");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(102, 110, 185, 33);
		frmHeightconverter.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("cms");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(368, 41, 58, 24);
		frmHeightconverter.getContentPane().add(lblNewLabel);
	}
}
