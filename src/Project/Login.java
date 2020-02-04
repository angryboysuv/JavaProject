package Project;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import java.awt.Color;
import javax.swing.ImageIcon;

public class Login {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		Login log = new Login();
	}

	/**
	 * Create the application.
	 */
	public Login() 
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 51));
		frame.setBounds(300, 50, 800, 600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmail.setForeground(new Color(255, 255, 255));
		lblEmail.setBounds(453, 196, 46, 14);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setBounds(453, 291, 93, 14);
		frame.getContentPane().add(lblPassword);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 255, 255));
		separator.setBounds(453, 243, 270, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(255, 255, 255));
		separator_1.setBounds(453, 334, 270, 2);
		frame.getContentPane().add(separator_1);
		
		JTextField txtEnterYourEmail = new JTextField();
		txtEnterYourEmail.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0)
			{
				txtEnterYourEmail.setText("");
			}
		});
		txtEnterYourEmail.setText("Enter your email");
		txtEnterYourEmail.setFont(new Font("Sitka Banner", Font.PLAIN, 17));
		txtEnterYourEmail.setForeground(new Color(255, 255, 255));
		txtEnterYourEmail.setBounds(453, 221, 276, 26);
		frame.getContentPane().add(txtEnterYourEmail);
		txtEnterYourEmail.setOpaque(false);
		txtEnterYourEmail.setBorder(null);
		
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setForeground(new Color(255, 255, 255));
		passwordField.setBounds(453, 310, 276, 26);
		frame.getContentPane().add(passwordField);
		passwordField.setOpaque(false);
		passwordField.setBorder(null);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBackground(new Color(255, 255, 255));
				btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
					
					int i=0,j=0,k=0;
					
					//step 1: Load the driver
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					//step 2: Establish the connection with oracle
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SUVAM","scott","tiger");
					
					//step 3: Create Statement object
					Statement st=con.createStatement();
					
					ResultSet rs=st.executeQuery("select name from admin_login where email='"+txtEnterYourEmail.getText()+"' and password='"+passwordField.getPassword()+"'");
					
					if(rs.next())
					{
						rs.close();
						JOptionPane.showMessageDialog(null,"loged in");
						Product pr= new Product();
						frame.dispose();
					}
					else
					{
						
						JOptionPane.showMessageDialog(null, "Login Failed");
						rs.close();
						
					}
				} 
				catch (ClassNotFoundException e) 
				{
					e.printStackTrace();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
				
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {	
		});
		
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(453, 387, 109, 31);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton.setOpaque(true);
		btnNewButton.setBorderPainted(true);
	
		btnNewButton.setContentAreaFilled(false);
		
		JLabel lblSignInAs = new JLabel("Sign in as Admin");
		lblSignInAs.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSignInAs.setForeground(new Color(255, 255, 255));
		lblSignInAs.setBounds(453, 151, 140, 14);
		frame.getContentPane().add(lblSignInAs);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(new Color(255, 255, 255));
		separator_3.setBounds(73, 417, 233, 2);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(new Color(255, 255, 255));
		separator_4.setBounds(30, 387, 328, 2);
		frame.getContentPane().add(separator_4);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 51));
		panel.setBounds(394, 0, 390, 561);
		frame.getContentPane().add(panel);
		
		JLabel lblPlanYourOwn = new JLabel("Plan your personal Database");
		lblPlanYourOwn.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPlanYourOwn.setForeground(new Color(255, 255, 255));
		lblPlanYourOwn.setBounds(90, 139, 240, 26);
		frame.getContentPane().add(lblPlanYourOwn);
		
		JLabel lblNewLabel_1 = new JLabel("BOURNVILLE");
		lblNewLabel_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 50));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(30, 94, 354, 44);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 850, 574);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/Project/image/camera2.jpg")));
		
		
		
		frame.setVisible(true);
	}
}
