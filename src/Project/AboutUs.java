package Project;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Font;

public class AboutUs {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		AboutUs au=new AboutUs();
		
	}

	/**
	 * Create the application.
	 */
	public AboutUs() 
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setForeground(Color.GRAY);
		frame.setBounds(300, 60, 750, 650);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("SUVAM DAS");
		lblNewLabel_2.setFont(new Font("MV Boli", Font.BOLD, 15));
		lblNewLabel_2.setForeground(new Color(0, 0, 102));
		lblNewLabel_2.setBounds(36, 361, 186, 37);
		frame.getContentPane().add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(26, 216, 145, 140);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(AboutUs.class.getResource("/Project/image/suvam(3).jpg")));
		lblNewLabel_1.setBounds(5, 5, 135, 130);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(AboutUs.class.getResource("/Project/image/coffee-creativity-writer.jpg")));
		lblNewLabel.setBounds(0, 0, 734, 356);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 399, 734, 60);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("I'm a Btech Student,crazy about tech and gadgets. #faujibrat,#wanderlust,#hangout,#bikerider");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(35, 11, 660, 37);
		panel_1.add(lblNewLabel_3);
		
		
		frame.setVisible(true);
	}
}
