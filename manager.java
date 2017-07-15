

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class manager extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					manager frame = new manager();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	
	public manager() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setVisible(true);
		//Image img = new ImageIcon(this.getClass().getResource("/newP/img/download (2).jpg")).getImage();
		// contentPane.setI
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		Dimension ScreenSize=Toolkit.getDefaultToolkit().getScreenSize();
		setSize(ScreenSize.width,ScreenSize.height);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Manager ");
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setBackground(Color.PINK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(595, 312, 145, 25);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Show Request");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setForeground(Color.GRAY);
		btnNewButton.setBounds(282, 420, 125, 42);
		btnNewButton.setFont(new Font("Thonburi", Font.BOLD, 12));
		btnNewButton.setBackground(Color.BLACK);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Compare Fund");
		btnNewButton_1.setBounds(282, 522, 125, 42);
		btnNewButton_1.setFont(new Font("Thonburi", Font.BOLD, 12));
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setForeground(Color.GRAY);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Employee ID :");
		lblNewLabel_1.setForeground(new Color(139, 0, 0));
		lblNewLabel_1.setFont(new Font("Thonburi", Font.BOLD, 14));
		lblNewLabel_1.setBackground(Color.MAGENTA);
		lblNewLabel_1.setBounds(74, 340, 104, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name :");
		lblNewLabel_2.setBackground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Thonburi", Font.BOLD, 16));
		lblNewLabel_2.setForeground(new Color(139, 0, 0));
		lblNewLabel_2.setBounds(84, 383, 94, 25);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_4 = new JButton("Logout");
		btnNewButton_4.setBounds(926, 669, 104, 50);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_4.setForeground(Color.DARK_GRAY);
		btnNewButton_4.setBackground(Color.BLACK);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(10, 11, 1330, 291);
		Image img = new ImageIcon(this.getClass().getResource("/gj.jpg")).getImage();
		JLabel lblNewLabel_4 = new JLabel("DASHBOARD");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 45));
		lblNewLabel_4.setBounds(21, 158, 360, 67);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_3.setIcon(new ImageIcon(img));
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_2 = new JButton("Status");
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setForeground(Color.GRAY);
		btnNewButton_2.setBounds(742, 420, 94, 42);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Send Request");
		btnNewButton_3.setBackground(Color.BLACK);
		btnNewButton_3.setForeground(Color.GRAY);
		btnNewButton_3.setBounds(737, 521, 109, 42);
		contentPane.add(btnNewButton_3);
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				int year=Integer.parseInt(JOptionPane.showInputDialog("year"));
  				 
				try{

				
				Class.forName("oracle.jdbc.driver.OracleDriver");
			
			   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","test","test");
			   Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
			   ResultSet rs=stmt.executeQuery("select * from Amt where year="+ year);
			   while(rs.next()){
				   
				   JOptionPane.showMessageDialog(null,"Amount for"+year+"="+rs.getFloat("amount"));
			   }
			  
			 
			  // System.out.println("Sucess");
			   con.close();
			   
			   
			   
			   
			   
		 }
			catch (Exception e){
					System.out.println(e);
			}
			}	
			
		});
		
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int year=Integer.parseInt(JOptionPane.showInputDialog("year"));
				try{

					
					Class.forName("oracle.jdbc.driver.OracleDriver");
				
				   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","test","test");
				   Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
				   ResultSet rs=stmt.executeQuery("select * from Amt where year="+ year);
				   while(rs.next()){
					   
					   JOptionPane.showMessageDialog(null,rs.getString("status"));
				   }
				  
				 
				   //System.out.println("Sucess");
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
					
					 
					 
					String response="forwarded to the admin";
					
					Class.forName("oracle.jdbc.driver.OracleDriver");
				
				   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","test","test");
				   PreparedStatement st=con.prepareStatement("Update Amt set status='"+response+"'where year="+year);
				   //PreparedStatement st1=con.prepareStatement("Update Amt set FORWARD='YES' where year="+year);
				   
				   
				   
				   st.executeUpdate();
				   JOptionPane.showMessageDialog(null,"Request is Successfully Forwarded");
				  // System.out.println("Sucess");
				   con.close();
				   
				   
				   
				   
				   
			 }
				catch (Exception e){
						System.out.println(e);
				}
				
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int year=Integer.parseInt(JOptionPane.showInputDialog("year"));
				
try{

					
					Class.forName("oracle.jdbc.driver.OracleDriver");
				
				   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","test","test");
				   Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
				   ResultSet rs=stmt.executeQuery("select * from budget where year="+ year);
				   Statement stmt1=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
				   ResultSet rs1=stmt1.executeQuery("select * from Amt where year="+ year);
				   float budget=0,amount=0;
				   while(rs.next()){
					    budget=rs.getFloat("budget");
				   }
				   while(rs1.next()){
					    amount=rs1.getFloat("amount");
				   }
				 
				   if(budget>=amount){
					   JOptionPane.showMessageDialog(null,"In Budget");
				   }
				   else{
					   JOptionPane.showMessageDialog(null,"out of  Budget"); 
				   }
				   System.out.println("Sucess");
				   con.close();
				   
				   
				   
				   
				   
			 }
				catch (Exception e){
						System.out.println(e);
				}
				
				
			}
		});
		 btnNewButton_4.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
					System.exit(0);
				}
			});
	}
}
