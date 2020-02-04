package Project;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class ElectronicsEdit {

	private JFrame frame;
	private JTextField TextSearch;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField textName;
	private JTextField textBrand;
	private JTextField textOS;
	private JTextField textDisplay;
	private JTextField textCamera;
	private JTextField textPrice;
	private JPanel panel_1;
	private JLabel lblTextNotify;
	private JPanel panel_2;
	private JTextField textId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		ElectronicsEdit ee= new ElectronicsEdit();
		
	}

	/**
	 * Create the application.
	 */
	public ElectronicsEdit() 
	{
		frame = new JFrame();
		frame.setBounds(300, 60, 750, 650);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 834, 50);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		panel_2 = new JPanel();
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				try
				{
					
					
					
					Connection con=DAO.getConnection();
					//step 3: Create Statement object
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select * from selectronics where name='"+TextSearch.getText()+"' or id='"+TextSearch.getText()+"'");
					
					if(rs.next())
					{		
						textId.setText(rs.getString("id"));
						textName.setText(rs.getString("name"));						
						textBrand .setText(rs.getString("brand"));
						textOS.setText(rs.getString("os"));
						textDisplay.setText(rs.getString("display"));
						textCamera.setText(rs.getString("camera"));
						textPrice.setText(rs.getString("price"));
					}	
					else
						lblTextNotify.setText("INVALID ID");
					
					rs.close();
					
					con.close();					
				} 
				catch (ClassNotFoundException e) 
				{
					e.printStackTrace();
				} 
				catch (SQLException e) 
				{
					lblTextNotify.setText("INVALID ID");
					e.printStackTrace();
				}
			}
		});
		panel_2.setBackground(new Color(0, 102, 204));
		panel_2.setBounds(681, 11, 33, 28);
		panel.add(panel_2);
		
		TextSearch = new JTextField();
		TextSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				TextSearch.setText("");
			}
		});
		TextSearch.setForeground(Color.GRAY);
		TextSearch.setText("Search by Id or Name");
		TextSearch.setBounds(409, 11, 273, 28);
		panel.add(TextSearch);
		
		TextSearch.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(1.9f)));
		TextSearch.setColumns(10);
		
		JLabel lblElectronics = new JLabel("ELECTRONICS");
		lblElectronics.setForeground(new Color(0, 0, 51));
		lblElectronics.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblElectronics.setBounds(35, 11, 144, 28);
		panel.add(lblElectronics);
		
		
		
		lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(152, 104, 133, 14);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(152, 158, 133, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("BRAND");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(152, 215, 133, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("OS");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(152, 268, 133, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("DISPLAY");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(152, 321, 133, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("CAMERA");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(152, 378, 133, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("PRICE");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(152, 434, 133, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		textName = new JTextField();
		textName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textName.setForeground(Color.DARK_GRAY);
		textName.setBounds(306, 152, 280, 20);
		frame.getContentPane().add(textName);
		textName.setOpaque(false);
		textName.setBorder(null);
		textName.setColumns(10);
		
		textBrand = new JTextField();
		textBrand.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textBrand.setForeground(Color.DARK_GRAY);
		textBrand.setBounds(306, 209, 280, 20);
		frame.getContentPane().add(textBrand);
		textBrand.setOpaque(false);
		textBrand.setBorder(null);
		textBrand.setColumns(10);
		
		textOS = new JTextField();
		textOS.setForeground(Color.DARK_GRAY);
		textOS.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textOS.setBounds(306, 262, 280, 20);
		frame.getContentPane().add(textOS);
		textOS.setOpaque(false);
		textOS.setBorder(null);
		textOS.setColumns(10);
		
		textDisplay = new JTextField();
		textDisplay.setForeground(Color.DARK_GRAY);
		textDisplay.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textDisplay.setBounds(306, 315, 280, 20);
		frame.getContentPane().add(textDisplay);
		textDisplay.setOpaque(false);
		textDisplay.setBorder(null);
		textDisplay.setColumns(10);
		
		textCamera = new JTextField();
		textCamera.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textCamera.setForeground(Color.DARK_GRAY);
		textCamera.setBounds(306, 372, 280, 20);
		frame.getContentPane().add(textCamera);
		textCamera.setOpaque(false);
		textCamera.setBorder(null);
		textCamera.setColumns(10);
		
		textPrice = new JTextField();
		textPrice.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textPrice.setForeground(Color.DARK_GRAY);
		textPrice.setBounds(306, 428, 280, 20);
		frame.getContentPane().add(textPrice);
		textPrice.setOpaque(false);
		textPrice.setBorder(null);
		textPrice.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.LIGHT_GRAY);
		separator.setBackground(Color.LIGHT_GRAY);
		separator.setBounds(306, 116, 280, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.LIGHT_GRAY);
		separator_1.setBackground(Color.LIGHT_GRAY);
		separator_1.setBounds(306, 170, 280, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.LIGHT_GRAY);
		separator_2.setBackground(Color.LIGHT_GRAY);
		separator_2.setBounds(306, 227, 280, 2);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.LIGHT_GRAY);
		separator_3.setBackground(Color.LIGHT_GRAY);
		separator_3.setBounds(306, 280, 280, 2);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.LIGHT_GRAY);
		separator_4.setBackground(Color.LIGHT_GRAY);
		separator_4.setBounds(306, 333, 280, 2);
		frame.getContentPane().add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(Color.LIGHT_GRAY);
		separator_5.setBackground(Color.LIGHT_GRAY);
		separator_5.setBounds(306, 390, 280, 2);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setForeground(Color.LIGHT_GRAY);
		separator_6.setBackground(Color.LIGHT_GRAY);
		separator_6.setBounds(306, 446, 280, 2);
		frame.getContentPane().add(separator_6);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 102, 204));
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBounds(0, 567, 734, 44);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		lblTextNotify = new JLabel("");
		lblTextNotify.setForeground(new Color(255, 255, 255));
		lblTextNotify.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		lblTextNotify.setBounds(328, 11, 224, 22);
		panel_1.add(lblTextNotify);
		
		JButton btnNewButton = new JButton("INSERT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
					
					int i=0;
					
					Connection con=DAO.getConnection();
					
					PreparedStatement pst=con.prepareStatement("insert into selectronics values(?,?,?,?,?,?,?)");
					pst.setString(1, textId.getText());
					pst.setString(2, textName.getText());
					pst.setString(3, textBrand.getText());
					pst.setString(4, textOS.getText());
					pst.setString(5, textDisplay.getText());
					pst.setString(6, textCamera.getText());
					pst.setString(7, textPrice.getText());
					
					i=pst.executeUpdate();
					
					if(i!=0)
						lblTextNotify.setText("INSERTED");
					else
						lblTextNotify.setText("NOT INSERTED");
					pst.close();
					con.close();
					
					
				} 
				catch (ClassNotFoundException e) 
				{
					e.printStackTrace();
				} 
				catch (SQLException e) 
				{
					lblTextNotify.setText("NOT INSERTED");
					e.printStackTrace();
				}
			}
		});
	
		btnNewButton.setBackground(new Color(0, 102, 204));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(152, 492, 119, 35);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.setContentAreaFilled(true);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorderPainted(false);
		
		JButton btnNewButton_1 = new JButton("DELETE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
					
					int i=0;
					
					Connection con=DAO.getConnection();
					
					PreparedStatement pst=con.prepareStatement("delete from selectronics where id=?");
					pst.setString(1, textId.getText());
					
					
					i=pst.executeUpdate();
					
					if(i!=0)
						lblTextNotify.setText("DELETED");
					else
						lblTextNotify.setText("NOT DELETED");
					pst.close();
					con.close();
					
					
				} 
				catch (ClassNotFoundException e) 
				{
					e.printStackTrace();
				} 
				catch (SQLException e) 
				{
					lblTextNotify.setText("NOT DELETED");
					e.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBackground(new Color(0, 102, 204));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(467, 492, 119, 35);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.setContentAreaFilled(true);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBorderPainted(false);
		
		JButton btnNewButton_2 = new JButton("UPDATE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
					
					int i=0;
					
					Connection con=DAO.getConnection();
					
					PreparedStatement pst=con.prepareStatement("update selectronics set name=?,brand=?,os=?,display=?,camera=?,price=? where id=?");
					pst.setString(1, textName.getText());
					pst.setString(2, textBrand.getText());
					pst.setString(3, textOS.getText());
					pst.setString(4, textDisplay.getText());
					pst.setString(5, textCamera.getText());
					pst.setString(6, textPrice.getText());
					pst.setString(7, textId.getText());
					
					
					i=pst.executeUpdate();
					
					if(i!=0)
						lblTextNotify.setText("UPDATED");
					else
						lblTextNotify.setText("NOT UPDATED");
					pst.close();
					
					con.close();
					
					
				} 
				catch (ClassNotFoundException e) 
				{
					e.printStackTrace();
				} 
				catch (SQLException e) 
				{
					lblTextNotify.setText("NOT UPDATED");
					e.printStackTrace();
				}
			}
		});
		btnNewButton_2.setBackground(new Color(0, 102, 204));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(306, 492, 119, 35);
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_2.setContentAreaFilled(true);
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setBorderPainted(false);
		
		textId = new JTextField();
		textId.setOpaque(false);
		textId.setForeground(Color.DARK_GRAY);
		textId.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textId.setColumns(10);
		textId.setBorder(null);
		textId.setBounds(306, 98, 280, 20);
		frame.getContentPane().add(textId);
		
		
		frame.setVisible(true);
	}

}
