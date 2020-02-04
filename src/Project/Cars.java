package Project;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionAdapter;

public class Cars {

	private JFrame frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		Cars ca =new Cars();
		
		
	}

	/**
	 * Create the application.
	 */
	public Cars() 
	{
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 17));
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(300, 60, 850, 650);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		
		
		
		
		
		JLabel lblNewLabel_1 = new JLabel("       BORNVILLE");
		lblNewLabel_1.setForeground(new Color(0, 0, 102));
		lblNewLabel_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 50));
		
		lblNewLabel_1.setBounds(305, 0, 529, 243);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblBestAndLuxiourious = new JLabel("BEST AND LUXURIOUS CARS FROM ALL OVER THE WORLD");
		lblBestAndLuxiourious.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBestAndLuxiourious.setBounds(360, 160, 415, 14);
		frame.getContentPane().add(lblBestAndLuxiourious);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(315, 0, 62, 283);
		frame.getContentPane().add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblTextId = new JLabel("");
		lblTextId.setForeground(new Color(0, 0, 102));
		lblTextId.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTextId.setBounds(28, 255, 31, 18);
		panel_8.add(lblTextId);
		
		
		JLabel lblTextname = new JLabel("");
		lblTextname.setForeground(new Color(0, 102, 204));
		lblTextname.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTextname.setBounds(575, 280, 198, 27);
		frame.getContentPane().add(lblTextname);
		
		
		JLabel lblTextBrand = new JLabel("");
		lblTextBrand.setForeground(new Color(0, 102, 204));
		lblTextBrand.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTextBrand.setBounds(575, 327, 198, 22);
		frame.getContentPane().add(lblTextBrand);
		
		JLabel lblTextSpeed = new JLabel("");
		lblTextSpeed.setForeground(new Color(0, 102, 204));
		lblTextSpeed.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTextSpeed.setBounds(575, 376, 198, 22);
		frame.getContentPane().add(lblTextSpeed);
		
		JLabel lblTextAcc = new JLabel("");
		lblTextAcc.setForeground(new Color(0, 102, 204));
		lblTextAcc.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTextAcc.setBounds(575, 421, 198, 22);
		frame.getContentPane().add(lblTextAcc);
		
		JLabel lblTextCylinder = new JLabel("");
		lblTextCylinder.setForeground(new Color(0, 102, 204));
		lblTextCylinder.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTextCylinder.setBounds(575, 468, 198, 22);
		frame.getContentPane().add(lblTextCylinder);
		
		JLabel lblTextPrize = new JLabel("");
		lblTextPrize.setForeground(new Color(0, 102, 204));
		lblTextPrize.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTextPrize.setBounds(575, 517, 198, 27);
		frame.getContentPane().add(lblTextPrize);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 51, 102));
		panel.setBounds(0, 0, 306, 611);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CARS");
		lblNewLabel.setBounds(43, 23, 141, 37);
		lblNewLabel.setBackground(new Color(102, 0, 153));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent arg0) 
			{
				panel_1.setOpaque(true);
				panel_1.setBackground(new Color(0, 102, 194));
			}
			@Override
			
			
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_1.setOpaque(true);
				panel_1.setBackground(new Color(0, 102, 204));
				
				lblNewLabel_1.setIcon(new ImageIcon(Cars.class.getResource("/Project/image/Aventador.jpg")));
				
				try
				{
					
					
			
					Connection con=DAO.getConnection();
					//step 3: Create Statement object
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select * from scars where id='"+1+"'");
					
					if(rs.next())
					{		
						
						lblTextId.setText(rs.getString("id"));
                        lblTextname.setText(rs.getString("name"));
						lblTextBrand.setText(rs.getString("brand"));						
						lblTextSpeed.setText(rs.getString("speed"));
						lblTextAcc.setText(rs.getString("acceleration"));
						lblTextCylinder.setText(rs.getString("cylinder"));
						lblTextPrize.setText(rs.getString("price"));
					}	
					else
						JOptionPane.showMessageDialog(null, "Wrong ID Inserted....");
					
					rs.close();
					st.close();
					con.close();					
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
			public void mouseExited(MouseEvent arg0) 
			{
				panel_1.setOpaque(true);
				panel_1.setBackground(new Color(0,51,102));
			}
		
		});
		panel_1.setBounds(0, 80, 306, 59);
		panel.add(panel_1);
		
		panel_1.setOpaque(false);
		panel_1.setLayout(null);
		
		JLabel lblCarName1 = new JLabel("New label");
		lblCarName1.setForeground(Color.WHITE);
		lblCarName1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCarName1.setBounds(43, 11, 222, 37);
		panel_1.add(lblCarName1);
		
		JPanel panel_2 = new JPanel();
		panel_2.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent arg0) 
			{
				panel_2.setOpaque(true);
				panel_2.setBackground(new Color(0, 102, 194));
			}
			@Override
			
			
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_2.setOpaque(true);
				panel_2.setBackground(new Color(0, 102, 204));
				
				lblNewLabel_1.setIcon(new ImageIcon(Cars.class.getResource("/Project/image/177.jpg")));
				
				try
				{
					
					
			
					Connection con=DAO.getConnection();
					//step 3: Create Statement object
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select * from scars where id='"+2+"'");
					
					if(rs.next())
					{		
						
						lblTextId.setText(rs.getString("id"));
                        lblTextname.setText(rs.getString("name"));
						lblTextBrand.setText(rs.getString("brand"));						
						lblTextSpeed.setText(rs.getString("speed"));
						lblTextAcc.setText(rs.getString("acceleration"));
						lblTextCylinder.setText(rs.getString("cylinder"));
						lblTextPrize.setText(rs.getString("price"));
					}	
					else
						JOptionPane.showMessageDialog(null, "Wrong ID Inserted...");
					
					rs.close();
					st.close();
					con.close();					
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
			public void mouseExited(MouseEvent arg0) 
			{
				panel_2.setOpaque(true);
				panel_2.setBackground(new Color(0,51,102));
			}
			
			
		
		});
		panel_2.setBackground(new Color(0, 102, 204));
		panel_2.setBounds(0, 139, 306, 59);
		panel.add(panel_2);
		panel_2.setOpaque(false);
		panel_2.setLayout(null);
		
		
		JLabel lblCarName2 = new JLabel("New label");
		lblCarName2.setForeground(new Color(255, 255, 255));
		lblCarName2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCarName2.setBounds(41, 11, 238, 37);
		panel_2.add(lblCarName2);
		
		JPanel panel_3 = new JPanel();
		panel_3.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent arg0) 
			{
				panel_3.setOpaque(true);
				panel_3.setBackground(new Color(0, 102, 194));
			}
			@Override
			
			
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_3.setOpaque(true);
				panel_3.setBackground(new Color(0, 102, 204));
				
				lblNewLabel_1.setIcon(new ImageIcon(Cars.class.getResource("/Project/image/911.jpg")));
				
				try
				{
					
								
					Connection con=DAO.getConnection();
					//step 3: Create Statement object
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select * from scars where id='"+3+"'");
					
					if(rs.next())
					{		
						
						lblTextId.setText(rs.getString("id"));
                        lblTextname.setText(rs.getString("name"));
						lblTextBrand.setText(rs.getString("brand"));						
						lblTextSpeed.setText(rs.getString("speed"));
						lblTextAcc.setText(rs.getString("acceleration"));
						lblTextCylinder.setText(rs.getString("cylinder"));
						lblTextPrize.setText(rs.getString("price"));
					}	
					else
						JOptionPane.showMessageDialog(null, "Wrong ID Inserted...");
					
					rs.close();
					st.close();
					con.close();					
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
			public void mouseExited(MouseEvent arg0) 
			{
				panel_3.setOpaque(true);
				panel_3.setBackground(new Color(0,51,102));
			}
			
			
		
		});
		panel_3.setBounds(0, 198, 306, 59);
		panel.add(panel_3);
		panel_3.setLayout(null);
		panel_3.setOpaque(false);
		
		JLabel lblCarName3 = new JLabel("New label");
		lblCarName3.setForeground(new Color(255, 255, 255));
		lblCarName3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCarName3.setBounds(43, 11, 232, 37);
		panel_3.add(lblCarName3);
		
		JPanel panel_4 = new JPanel();
		panel_4.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent arg0) 
			{
				panel_4.setOpaque(true);
				panel_4.setBackground(new Color(0, 102, 194));
			}
			@Override
			
			
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_4.setOpaque(true);
				panel_4.setBackground(new Color(0, 102, 204));
				
				lblNewLabel_1.setIcon(new ImageIcon(Cars.class.getResource("/Project/image/R8.jpg")));
				
				try
				{
					
					Connection con=DAO.getConnection();
					//step 3: Create Statement object
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select * from scars where id='"+4+"'");
					
					if(rs.next())
					{		
					
						lblTextId.setText(rs.getString("id"));
                        lblTextname.setText(rs.getString("name"));
						lblTextBrand.setText(rs.getString("brand"));						
						lblTextSpeed.setText(rs.getString("speed"));
						lblTextAcc.setText(rs.getString("acceleration"));
						lblTextCylinder.setText(rs.getString("cylinder"));
						lblTextPrize.setText(rs.getString("price"));
					}	
					else
						JOptionPane.showMessageDialog(null, "Wrong ID Inserted...");
					
					rs.close();
					st.close();
					con.close();					
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
			public void mouseExited(MouseEvent arg0) 
			{
				panel_4.setOpaque(true);
				panel_4.setBackground(new Color(0,51,102));
			}
			
			
		
		});
		panel_4.setBounds(0, 256, 306, 59);
		panel.add(panel_4);
		panel_4.setLayout(null);
		panel_4.setOpaque(false);
		
		JLabel lblCarName4 = new JLabel("New label");
		lblCarName4.setForeground(new Color(255, 255, 255));
		lblCarName4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCarName4.setBounds(43, 11, 239, 37);
		panel_4.add(lblCarName4);
		
		JPanel panel_5 = new JPanel();
		panel_5.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent arg0) 
			{
				panel_5.setOpaque(true);
				panel_5.setBackground(new Color(0, 102, 194));
			}
			@Override
			
			
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_5.setOpaque(true);
				panel_5.setBackground(new Color(0, 102, 204));
				
				lblNewLabel_1.setIcon(new ImageIcon(Cars.class.getResource("/Project/image/f12 berlinetta.jpg")));
				
				try
				{
					
				
			
					Connection con=DAO.getConnection();
					//step 3: Create Statement object
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select * from scars where id='"+5+"'");
					
					if(rs.next())
					{		
					
						lblTextId.setText(rs.getString("id"));
                        lblTextname.setText(rs.getString("name"));
						lblTextBrand.setText(rs.getString("brand"));						
						lblTextSpeed.setText(rs.getString("speed"));
						lblTextAcc.setText(rs.getString("acceleration"));
						lblTextCylinder.setText(rs.getString("cylinder"));
						lblTextPrize.setText(rs.getString("price"));
					}	
					else
						JOptionPane.showMessageDialog(null, "Wrong ID Inserted...");
					
					rs.close();
					st.close();
					con.close();					
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
			public void mouseExited(MouseEvent arg0) 
			{
				panel_5.setOpaque(true);
				panel_5.setBackground(new Color(0,51,102));
			}
			
			
		
		});
		panel_5.setBounds(0, 314, 306, 59);
		panel.add(panel_5);
		panel_5.setLayout(null);
		panel_5.setOpaque(false);
		
		JLabel lblCarName5 = new JLabel("New label");
		lblCarName5.setForeground(new Color(255, 255, 255));
		lblCarName5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCarName5.setBounds(43, 11, 230, 37);
		panel_5.add(lblCarName5);
		
		
		
		JPanel panel_6 = new JPanel();
		panel_6.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent arg0) 
			{
				panel_6.setOpaque(true);
				panel_6.setBackground(new Color(0, 102, 194));
			}
			@Override
			
			
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_6.setOpaque(true);
				panel_6.setBackground(new Color(0, 102, 204));
				lblNewLabel_1.setIcon(null);
				try
				{
					Connection con=DAO.getConnection();
					//step 3: Create Statement object
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select * from scars where id='"+6+"'");
					
					if(rs.next())
					{		
						
						lblTextId.setText(rs.getString("id"));
                        lblTextname.setText(rs.getString("name"));
						lblTextBrand.setText(rs.getString("brand"));						
						lblTextSpeed.setText(rs.getString("speed"));
						lblTextAcc.setText(rs.getString("acceleration"));
						lblTextCylinder.setText(rs.getString("cylinder"));
						lblTextPrize.setText(rs.getString("price"));
					}	
					else
					{
						lblTextId.setText(null);
                        lblTextname.setText(null);
						lblTextBrand.setText(null);						
						lblTextSpeed.setText(null);
						lblTextAcc.setText(null);
						lblTextCylinder.setText(null);
						lblTextPrize.setText(null);
					}
					
					rs.close();
					st.close();
					con.close();					
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
			public void mouseExited(MouseEvent arg0) 
			{
				panel_6.setOpaque(true);
				panel_6.setBackground(new Color(0,51,102));
			}
		
		});
		panel_6.setBounds(0, 373, 306, 59);
		panel.add(panel_6);
		panel_6.setOpaque(false);
		panel_6.setLayout(null);
		panel_6.setOpaque(false);
		JLabel lblCarName6 = new JLabel("");
		lblCarName6.setForeground(new Color(255, 255, 255));
		lblCarName6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCarName6.setBounds(41, 11, 238, 37);
		panel_6.add(lblCarName6);
		
		JPanel panel_7 = new JPanel();
		panel_7.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent arg0) 
			{
				panel_7.setOpaque(true);
				panel_7.setBackground(new Color(0, 102, 194));
			}
			@Override
			
			
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_7.setOpaque(true);
				panel_7.setBackground(new Color(0, 102, 204));
				lblNewLabel_1.setIcon(null);
				try
				{
					Connection con=DAO.getConnection();
					//step 3: Create Statement object
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select * from scars where id='"+7+"'");
					
					if(rs.next())
					{		
						
						lblTextId.setText(rs.getString("id"));
                        lblTextname.setText(rs.getString("name"));
						lblTextBrand.setText(rs.getString("brand"));						
						lblTextSpeed.setText(rs.getString("speed"));
						lblTextAcc.setText(rs.getString("acceleration"));
						lblTextCylinder.setText(rs.getString("cylinder"));
						lblTextPrize.setText(rs.getString("price"));
					}	
					else
					{
						lblTextId.setText(null);
                        lblTextname.setText(null);
						lblTextBrand.setText(null);						
						lblTextSpeed.setText(null);
						lblTextAcc.setText(null);
						lblTextCylinder.setText(null);
						lblTextPrize.setText(null);
					}
					
					rs.close();
					st.close();
					con.close();					
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
			public void mouseExited(MouseEvent arg0) 
			{
				panel_7.setOpaque(true);
				panel_7.setBackground(new Color(0,51,102));
			}
		
		});
		panel_7.setBounds(0, 432, 306, 59);
		panel.add(panel_7);
		panel_7.setOpaque(false);
		panel_7.setLayout(null);
		panel_7.setOpaque(false);
		JLabel lblCarName7 = new JLabel("");
		lblCarName7.setForeground(new Color(255, 255, 255));
		lblCarName7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCarName7.setBounds(41, 11, 238, 37);
		panel_7.add(lblCarName7);
		
		JLabel lbl_name = new JLabel("MODEL ");
		lbl_name.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbl_name.setBounds(428, 280, 114, 22);
		frame.getContentPane().add(lbl_name);
		
		JLabel lbl_brand = new JLabel("BRAND ");
		lbl_brand.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbl_brand.setBounds(428, 327, 114, 22);
		frame.getContentPane().add(lbl_brand);
		
		JLabel lbl_speed = new JLabel("SPEED");
		lbl_speed.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbl_speed.setBounds(428, 376, 114, 22);
		frame.getContentPane().add(lbl_speed);
		
		JLabel lbl_acc = new JLabel("ACCELERATION");
		lbl_acc.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbl_acc.setBounds(428, 421, 114, 22);
		frame.getContentPane().add(lbl_acc);
		
		JLabel lbl_cylinder = new JLabel("CYLINDERS");
		lbl_cylinder.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbl_cylinder.setBounds(428, 468, 114, 22);
		frame.getContentPane().add(lbl_cylinder);
		
		JLabel lbl_price = new JLabel("PRICE");
		lbl_price.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbl_price.setBounds(428, 517, 114, 27);
		frame.getContentPane().add(lbl_price);
		
		try
		{
			
			int i=0,j=0,k=0;
	
			Connection con=DAO.getConnection();
			//step 3: Create Statement object
			Statement st=con.createStatement();
			
			
			
			
				ResultSet r1=st.executeQuery("select * from scars where id='"+1+"'");
				if(r1.next())
				{		
					lblCarName1.setText(r1.getString("name"));
				}
				else
					lblCarName1.setText(null);
				ResultSet r2=st.executeQuery("select * from scars where id='"+2+"'");
				if(r2.next())
				{		
					
					lblCarName2.setText(r2.getString("name"));
				}
				else
					lblCarName2.setText(null);
				 ResultSet r3=st.executeQuery("select * from scars where id='"+3+"'");
				if(r3.next())
				{		
					i=1;
					lblCarName3.setText(r3.getString("name"));
				}
				else
					lblCarName3.setText(null);
				ResultSet r4=st.executeQuery("select * from scars where id='"+4+"'");
				if(r4.next())
				{		
				
					lblCarName4.setText(r4.getString("name"));
				}
				else
					lblCarName4.setText(null);
			
				ResultSet r5=st.executeQuery("select * from scars where id='"+5+"'");
				if(r5.next())
				{		
				
					lblCarName5.setText(r5.getString("name"));
				}
				else
					lblCarName5.setText(null);
				ResultSet r6=st.executeQuery("select * from scars where id='"+6+"'");
				if(r6.next())
				{		
				
					lblCarName6.setText(r6.getString("name"));
				}
				else
					lblCarName6.setText(null);
				ResultSet r7=st.executeQuery("select * from scars where id='"+7+"'");
				if(r7.next())
				{		
				
					lblCarName7.setText(r7.getString("name"));
				}
				else
					lblCarName7.setText(null);
			r1.close();
			r2.close();
			r3.close();
			r4.close();
			r5.close();
			r6.close();
			r7.close();
			st.close();
			con.close();					
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
			
		frame.setVisible(true);
	}
}
