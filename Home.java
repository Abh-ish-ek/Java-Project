import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import java.awt.SystemColor;
public class Home {

	private JTextField textField;
	private JPasswordField passwordField;
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
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
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1450, 977);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		Dimension ScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.getContentPane().setSize(ScreenSize.width,ScreenSize.height);
		
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 1350, 260);
		Image img = new ImageIcon(this.getClass().getResource("/i.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		JLabel lblNewLabel_1 = new JLabel("BUDGETING SYSTEM");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 60));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(629, 36, 685, 190);
		frame.getContentPane().add(lblNewLabel_1);
		
		frame.getContentPane().add(lblNewLabel);
		Image im = new ImageIcon(this.getClass().getResource("/bn.jpg")).getImage();
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(211, 211, 211));
		panel_2.setBounds(0, 341, 1350, 398);
		frame.getContentPane().add(panel_2);
		panel_2.setVisible(false);
		panel_2.setLayout(null);
		
		
		
		
		JLabel lblNewLabel_5 = new JLabel();
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_5.setBackground(new Color(144, 238, 144));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(424, 11, 474, 64);
		panel_2.add(lblNewLabel_5);
		Image img3 = new ImageIcon(this.getClass().getResource("/login.jpg")).getImage();
		lblNewLabel_5.setIcon(new ImageIcon(img3));
		
		JLabel lblNewLabel_3 = new JLabel("USERNAME");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(419, 98, 193, 54);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_6 = new JLabel("PASSWORD");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(437, 178, 156, 34);
		panel_2.add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setToolTipText("Only numerical value allowed here.");
		textField.setBounds(726, 110, 172, 35);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JButton login = new JButton("Login");
		login.setFont(new Font("Tahoma", Font.PLAIN, 16));
		login.setForeground(new Color(0, 0, 0));
		login.setBounds(596, 322, 100, 34);
		panel_2.add(login);
		
		JLabel lblNewLabel_7 = new JLabel("ROLE");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(446, 248, 106, 29);
		panel_2.add(lblNewLabel_7);
		
		
		String role[]={"Admin","Manager","Staff"};
		JComboBox comboBox = new JComboBox(role);
		comboBox.setBounds(726, 250, 172, 29);
		panel_2.add(comboBox);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(726, 180, 172, 34);
		panel_2.add(passwordField);
	   
	
	    
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setForeground(new Color(0, 0, 0));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 341, 1403, 322);
	    panel.setLayout(null);
		
	    JButton btnNewButton = new JButton("LOGIN");
	    btnNewButton.setBounds(83, 228, 154, 40);
	    btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    btnNewButton.setBackground(new Color(192, 192, 192));
	    panel.add(btnNewButton);
	   
		
	    frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("WELCOME !!!!\r\n");
		lblNewLabel_2.setBounds(80, 11, 518, 71);
		lblNewLabel_2.setFont(new Font("Monospaced", Font.BOLD, 32));
		panel.add(lblNewLabel_2);
		
	
		JTextArea txtrThisBudgetingSystem = new JTextArea();
		txtrThisBudgetingSystem.setBounds(70, 73, 929, 228);
		txtrThisBudgetingSystem.setText("This budgeting system is here to help you in budget calculation and management.It is\r\n also equipped to solve your various problem related to the task.\r\nIt has been designed specifiaclly to ease the huge and tedious task of managing the budget of the lT labs of the university.\r\n So, what are your waiting for?Get started with this application to enjoy the benefits.");
		txtrThisBudgetingSystem.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
		txtrThisBudgetingSystem.setBackground(new Color(255, 255, 255));
		
		panel.add(txtrThisBudgetingSystem);
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(992, -16, 363, 338);
		panel.add(lblNewLabel_4);
		lblNewLabel_4.setIcon(new ImageIcon(im));
		
		JTextArea txtrManageYourMoney = new JTextArea();
		txtrManageYourMoney.setFont(new Font("Times New Roman", Font.BOLD, 42));
		txtrManageYourMoney.setText("MANAGE YOUR MONEY TO GET OUT AND STAY OUT OF DEBT...");
		txtrManageYourMoney.setForeground(new Color(255, 255, 255));
		txtrManageYourMoney.setBackground(new Color(0, 0, 0));
		txtrManageYourMoney.setBounds(0, 259, 1350, 83);
		frame.getContentPane().add(txtrManageYourMoney);
		
		
		

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel_2.setVisible(true);
				btnNewButton.setVisible(false);
			}
		});
		
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int uid=Integer.parseInt(textField.getText());
				 String pwd=String.valueOf(passwordField.getPassword());
				String r=String.valueOf(comboBox.getSelectedItem());
				String pwdd="",role="";
				try{
					
					// System.out.println(uid);
					 
					
					//String query="Insert into expense values("+yearv+",'"+categoryv+"','"+specificv+"',"+amountv+")";
					Class.forName("oracle.jdbc.driver.OracleDriver");
				
				   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","test","test");
				   Statement stmt=con.createStatement();  
				   ResultSet rs=stmt.executeQuery("select * from usert where emp_id = '"+uid+"'");  
				   
				    while(rs.next())
				    {
				   pwdd= rs.getString("pass");
				  
				   role=rs.getString("rolev");
				  
				   
					  if(pwd.equals(pwdd)){
						  
						  JOptionPane.showMessageDialog(null,"login successfull");
						  if(r.equalsIgnoreCase("Admin")){
							   new Admin();
							  frame.dispose();
						   }
						   else if(r.equalsIgnoreCase("Manager")){
							   new manager();
							   frame.dispose();
						   }
						   else if (r.equalsIgnoreCase("Staff")){
							   new Staff1();
							   frame.dispose();
						   }
				
					  }
					  else
					  {
						  JOptionPane.showMessageDialog(null,"Wrong Password");
					  }
					  
					  
				    }

				  con.close();
				     
				   
			 }
				catch (Exception e){
					System.out.println(e);
			}
				
				
				
				
			}
		} );
		
	}

	

}
