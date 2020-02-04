package Project;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Product {

	private JFrame frame;
	int i=0,j=0,k=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		Product pro = new Product();
		
	}

	/**
	 * Create the application.
	 */
	public Product() 
	{
		
		frame = new JFrame();
		
		JButton btnNewButton = new JButton("CARS");
		JButton btnNewButton_1 = new JButton("CLOTHES");
		JButton btnNewButton_2 = new JButton("ELECTRONICS");
		
		JLabel lblCarPic = new JLabel("New label");
		JLabel lblClothPic = new JLabel("New label");
		JLabel lblElectronicsPic = new JLabel("New label");
		
		JLabel lbloption1 = new JLabel("");
		JLabel lbloption2 = new JLabel("");
		JLabel lbloption3 = new JLabel("");
		
		
		JPanel panel_4 = new JPanel();
		JPanel panel_5 = new JPanel();
		panel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_4.setVisible(true);
			}
		});
		panel_4.setBackground(new Color(0, 102, 204));
		panel_4.setBounds(267, 0, 282, 611);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		panel_4.setVisible(false);
		
		
		frame.getContentPane().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_4.setVisible(false);
			}
		});
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(300, 60, 850, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_4.setVisible(false);
			}
		});
		panel.setBackground(new Color(0, 51, 102));
		panel.setBounds(0, 0, 268, 611);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPTIONS");
		lblNewLabel.setBackground(new Color(102, 0, 153));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(39, 21, 141, 37);
		panel.add(lblNewLabel);
		
		
		
		panel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				if(i==1)
				{
				   	lblCarPic.setVisible(true);
				   	lblClothPic.setVisible(true);
				   	lblElectronicsPic.setVisible(true);
				   	btnNewButton.setVisible(true);
				   	btnNewButton_1.setVisible(true);
				   	btnNewButton_2.setVisible(true);
				}
				else if(i==2)
				{
					CarsEdit ee=new CarsEdit();
				}
				else if(i==3)
				{
					AboutUs au =new AboutUs();
				}
				
			}
			@Override
			public void mouseEntered(MouseEvent arg0) 
			{
				panel_5.setBackground(new Color(0, 85, 204));
				panel_5.setOpaque(true);
			}
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_5.setBackground(new Color(0, 102, 204));
				panel_5.setOpaque(true);
			}

			
		});
		panel_5.setBackground(new Color(0, 102, 204));
		panel_5.setBounds(0, 76, 282, 50);
		panel_4.add(panel_5);
		panel_5.setLayout(null);
		
		
		lbloption1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbloption1.setForeground(new Color(255, 255, 255));
		lbloption1.setBounds(35, 11, 237, 28);
		panel_5.add(lbloption1);
		
		JPanel panel_6 = new JPanel();
		panel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				if(j==1)
				{
					frame.dispose();
				}
				else if(j==2)
				{
					ClothsEdit ce = new ClothsEdit();
				}
			}
			@Override
			public void mouseEntered(MouseEvent arg0) 
			{
				panel_6.setBackground(new Color(0, 85, 204));
				panel_6.setOpaque(true);
			}
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_6.setBackground(new Color(0, 102, 204));
				panel_6.setOpaque(true);
			}
		});
		panel_6.setBackground(new Color(0, 102, 204));
		panel_6.setBounds(0, 126, 282, 50);
		panel_4.add(panel_6);
		panel_6.setLayout(null);
		
		
		lbloption2.setForeground(new Color(255, 255, 255));
		lbloption2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbloption2.setBounds(37, 11, 235, 28);
		panel_6.add(lbloption2);
		
		JPanel panel_7 = new JPanel();
		panel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				if(k==2)
				{
					ElectronicsEdit ee = new ElectronicsEdit();
				}
			}
			@Override
			public void mouseEntered(MouseEvent arg0) 
			{
				panel_7.setBackground(new Color(0, 85, 204));
				panel_7.setOpaque(true);
			}
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_7.setBackground(new Color(0, 102, 204));
				panel_7.setOpaque(true);
			}
		});
		panel_7.setBackground(new Color(0, 102, 204));
		panel_7.setBounds(0, 176, 282, 50);
		panel_4.add(panel_7);
		panel_7.setLayout(null);
		
		
		lbloption3.setForeground(new Color(255, 255, 255));
		lbloption3.setBackground(new Color(255, 255, 255));
		lbloption3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbloption3.setBounds(37, 11, 235, 28);
		
		JPanel panel_1 = new JPanel();
		panel_1.addMouseListener(new MouseAdapter() {
			
			
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_1.setBackground(new Color(0, 85, 204));
				panel_1.setOpaque(true);
				panel_4.setVisible(true);
				lbloption1.setText("SHOW");
				lbloption2.setText("EXIT");
				lbloption3.setText(null);
				i=1;
				j=1;
				k=1;
			}
			@Override
			public void mouseEntered(MouseEvent arg0) 
			{
				panel_1.setBackground(new Color(0, 102, 204));
				panel_1.setOpaque(true);
			}
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_1.setBackground(new Color(0, 51,102));
				panel_1.setOpaque(true);
			}
			
		});
		
		panel_1.setBounds(0, 76, 268, 50);
		panel.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setOpaque(false);
		
		JLabel lblPprducts = new JLabel("Products");
		lblPprducts.setForeground(new Color(255, 255, 255));
		lblPprducts.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPprducts.setBounds(43, 11, 106, 28);
		panel_1.add(lblPprducts);
		
		JPanel panel_2 = new JPanel();
		panel_2.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_2.setBackground(new Color(0, 85, 204));
				panel_2.setOpaque(true);
				panel_4.setVisible(true);
				lbloption1.setText("CARS");
				lbloption2.setText("CLOTHS");
				lbloption3.setText("ELECTRONICS");
				i=2;
				j=2;
				k=2;
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) 
			{
				panel_2.setBackground(new Color(0, 102, 204));
				panel_2.setOpaque(true);
			}
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_2.setBackground(new Color(0, 51,102));
				panel_2.setOpaque(true);
			}

		});
		panel_2.setBackground(new Color(0, 102, 204));
		panel_2.setBounds(0, 126, 268, 50);
		panel.add(panel_2);
		panel_2.setLayout(null);
		panel_2.setOpaque(false);
		
		JLabel lblNewLabel_1 = new JLabel("Edit products");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(43, 11, 166, 28);
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_3.setBackground(new Color(0, 85, 204));
				panel_3.setOpaque(true);
				panel_4.setVisible(true);
				lbloption1.setText("ABOUT US");
				lbloption2.setText(null);
				lbloption3.setText(null);
				i=3;
			}
			@Override
			public void mouseEntered(MouseEvent arg0) 
			{
				panel_3.setBackground(new Color(0, 102, 204));
				panel_3.setOpaque(true);
			}
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				panel_3.setBackground(new Color(0, 51,102));
				panel_3.setOpaque(true);
			}

		});
		panel_3.setBackground(new Color(0, 102, 204));
		panel_3.setBounds(0, 176, 268, 50);
		panel.add(panel_3);
		panel_3.setLayout(null);
		panel_3.setOpaque(false);
		
		JLabel lblNewLabel_2 = new JLabel("Help");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(43, 11, 58, 28);
		panel_3.add(lblNewLabel_2);
		
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				Cars ca = new Cars();
			}
		});
		btnNewButton.setVisible(false);
		
		
		
		
	
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				Cloths clo = new Cloths();
			}
		});
		btnNewButton_1.setVisible(false);
		
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 102, 204));
		btnNewButton_1.setBounds(677, 347, 114, 30);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.setContentAreaFilled(true);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBorderPainted(false);
		
		
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				Electronics ele = new Electronics();
			}
		});
		btnNewButton_2.setVisible(false);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(0, 102, 204));
		btnNewButton_2.setBounds(677, 517, 114, 30);
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_2.setContentAreaFilled(true);
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setBorderPainted(false);
		
		
		panel_7.add(lbloption3);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 102, 204));
		btnNewButton.setBounds(677, 172, 114, 30);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.setContentAreaFilled(true);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorderPainted(false);
		
		
		lblCarPic.setIcon(new ImageIcon(Product.class.getResource("/Project/image/cars3.jpg")));
		lblCarPic.setBounds(302, 38, 500, 170);
		frame.getContentPane().add(lblCarPic);
		lblCarPic.setVisible(false);
		
		
		lblClothPic.setIcon(new ImageIcon(Product.class.getResource("/Project/image/clothe (2).jpg")));
		lblClothPic.setBounds(302, 213, 500, 170);
		frame.getContentPane().add(lblClothPic);
		lblClothPic.setVisible(false);
		
		
		lblElectronicsPic.setIcon(new ImageIcon(Product.class.getResource("/Project/image/elec (2).jpg")));
		lblElectronicsPic.setBounds(302, 388, 500, 170);
		frame.getContentPane().add(lblElectronicsPic);
		
		JLabel lblBornville = new JLabel("BORNVILLE");
		lblBornville.setFont(new Font("Monotype Corsiva", Font.BOLD, 50));
		lblBornville.setForeground(new Color(0, 0, 102));
		lblBornville.setBounds(357, 130, 344, 71);
		frame.getContentPane().add(lblBornville);
		
		JLabel lblNewLabel_3 = new JLabel(" BEST AND LUXURIOUS PRODUTS FROM ALL OVER THE WORLD");
		lblNewLabel_3.setBounds(320, 226, 450, 28);
		frame.getContentPane().add(lblNewLabel_3);
		lblNewLabel_3.setForeground(new Color(0, 0, 51));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblElectronicsPic.setVisible(false);
		
		
		
		frame.setVisible(true);
	}
}
