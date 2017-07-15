

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.sql.*;
public class Admin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(169, 169, 169));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		Dimension ScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(ScreenSize.width,ScreenSize.height);
		setContentPane(contentPane);
		Image img = new ImageIcon(this.getClass().getResource("/bn2.jpg")).getImage();
		contentPane.setLayout(null);
		JLabel lblNewLabel_1 = new JLabel("DASHBOARD");
		lblNewLabel_1.setBounds(10, 93, 328, 78);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 45));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(lblNewLabel_1);
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 172, 1350, 489);
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(482, 0, 868, 489);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("Request Check");
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_3.setBackground(Color.DARK_GRAY);
		btnNewButton_3.setBounds(89, 78, 235, 63);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Add User");
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setBackground(Color.DARK_GRAY);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_4.setBounds(533, 78, 226, 63);
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Add Database");
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setBackground(new Color(64, 64, 64));
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_5.setBounds(89, 248, 235, 63);
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Budget Information");
		btnNewButton_6.setForeground(Color.WHITE);
		btnNewButton_6.setBackground(Color.DARK_GRAY);
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_6.setBounds(533, 248, 226, 63);
		panel_1.add(btnNewButton_6);
		
		JButton btnApprove = new JButton("Approve");
		btnApprove.setBackground(Color.DARK_GRAY);
		btnApprove.setForeground(Color.WHITE);
		btnApprove.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnApprove.setBounds(89, 357, 235, 63);
		panel_1.add(btnApprove);
		
		JButton btnDisapprove = new JButton("Disapprove");
		btnDisapprove.setBackground(Color.DARK_GRAY);
		btnDisapprove.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnDisapprove.setForeground(Color.WHITE);
		btnDisapprove.setBounds(533, 357, 226, 63);
		panel_1.add(btnDisapprove);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(0, 169, 484, 334);
		Image im = new ImageIcon(this.getClass().getResource("/man.jpg")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(im));
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("WELCOME ADMINISTRATOR!!!");
		lblNewLabel_4.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_4.setFont(new Font("Monospaced", Font.BOLD, 32));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setBounds(10, 11, 462, 51);
		panel.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.setBounds(1190, 112, 150, 49);
		btnNewButton.setBackground(Color.GRAY);
		contentPane.add(btnNewButton);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 1350, 171);
		contentPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(img));
		
		
		 btnNewButton_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new Registration1();
				dispose();
				
			}
		});
		
		 btnNewButton_5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				

				int year=Integer.parseInt(JOptionPane.showInputDialog("year"));
				
				int bud=Integer.parseInt(JOptionPane.showInputDialog("Budget"));
				
				try{
					
					 
					 
					
				
					Class.forName("oracle.jdbc.driver.OracleDriver");
				
				   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","test","test");
				   PreparedStatement st=con.prepareStatement("Insert into budget values(?,?)");
			
				   st.setInt(1,year);
				   st.setFloat(2,bud);
				   
				   
				   st.executeUpdate();
				   JOptionPane.showMessageDialog(null,"Data successfully added");
				   System.out.println("Sucess");
				   con.close();
				   
				   
				   
				   
				   
			 }
				catch (Exception e){
						System.out.println(e);
				}
			}
		});
		
		 btnNewButton_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int year=Integer.parseInt(JOptionPane.showInputDialog("year"));
				try{
					
					
					
					Class.forName("oracle.jdbc.driver.OracleDriver");
				
				   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","test","test");
				   Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
				   ResultSet rs=stmt.executeQuery("select * from Amt where year="+year);
				   while(rs.next()){
					   //System.out.println("hello");
					   
					   JOptionPane.showMessageDialog(null,"Amount Requested for year "+year+" is "+rs.getFloat("amount"));  
				   }
				  
				   con.close();
				}

				catch (Exception e){
						System.out.println(e);
						
				}
			}
		});
		
		 btnNewButton_6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int year=Integer.parseInt(JOptionPane.showInputDialog("year"));
				
try{
					
					
					
					Class.forName("oracle.jdbc.driver.OracleDriver");
				
				   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","test","test");
				   Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
				   ResultSet rs=stmt.executeQuery("select * from budget where year="+ year);
				   while(rs.next()){
					   //System.out.println("hello");
					   
					   JOptionPane.showMessageDialog(null,"Budget for year "+year+" is "+rs.getFloat("budget"));  
				   }
				  
				   con.close();
				}

				catch (Exception e){
						System.out.println(e);
						
				}
				
			}
		});
		 btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				System.exit(0);
			}
		});
		 btnApprove.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					int year=Integer.parseInt(JOptionPane.showInputDialog("year"));
					try{
						
						 
						 
						String response="Request is Apprroved";
						
						Class.forName("oracle.jdbc.driver.OracleDriver");
					
					   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","test","test");
					   PreparedStatement st=con.prepareStatement("Update Amt set status='"+response+"'where year="+year);
					   //PreparedStatement st1=con.prepareStatement("Update Amt set FORWARD='YES' where year="+year);
					   
					   
					   
					   st.executeUpdate();
					   JOptionPane.showMessageDialog(null,"Your Response is Successfully Recorded");
					  // System.out.println("Sucess");
					   con.close();
					   
					   
					   
					   
					   
				 }
					catch (Exception e){
							System.out.println(e);
					}
				}
		 });
		 btnDisapprove.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					int year=Integer.parseInt(JOptionPane.showInputDialog("year"));
					try{
						
						 
						 
						String response="Request is Disapprroved";
						
						Class.forName("oracle.jdbc.driver.OracleDriver");
					
					   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","test","test");
					   PreparedStatement st=con.prepareStatement("Update Amt set status='"+response+"'where year="+year);
					   //PreparedStatement st1=con.prepareStatement("Update Amt set FORWARD='YES' where year="+year);
					   
					   
					   
					   st.executeUpdate();
					   JOptionPane.showMessageDialog(null,"Your Response is Successfully Recorded");
					  // System.out.println("Sucess");
					   con.close();
					   
					   
					   
					   
					   
				 }
					catch (Exception e){
							System.out.println(e);
					}
				}
		 });
	}
}
