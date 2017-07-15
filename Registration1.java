
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.SystemColor;

public class Registration1 {

	private JFrame frame;
	private JTextField nametf;
	private JTextField eidf;
	private JPasswordField cpwdtf;
	private JPasswordField pwdtf;
	private JTextField mobtf;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration1 window = new Registration1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the application.
	 */
	public Registration1() {
		initialize();
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 490, 415);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		Dimension ScreenSize=Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(ScreenSize.width,ScreenSize.height);
		
		JLabel lblRegistration = new JLabel("New User Registration");
		lblRegistration.setForeground(new Color(139, 0, 0));
		lblRegistration.setFont(new Font("Thonburi", Font.BOLD, 20));
		lblRegistration.setBounds(482, 355, 237, 36);
		frame.getContentPane().add(lblRegistration);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(Color.DARK_GRAY);
		lblName.setBackground(Color.PINK);
		lblName.setFont(new Font("Thonburi", Font.BOLD, 12));
		lblName.setBounds(467, 413, 46, 23);
		frame.getContentPane().add(lblName);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setForeground(Color.DARK_GRAY);
		lblGender.setFont(new Font("Thonburi", Font.BOLD, 12));
		lblGender.setBounds(467, 450, 46, 14);
		frame.getContentPane().add(lblGender);
		
		JLabel lblEmpid = new JLabel("Emp_Id");
		lblEmpid.setFont(new Font("Thonburi", Font.BOLD, 12));
		lblEmpid.setForeground(Color.DARK_GRAY);
		lblEmpid.setBounds(467, 487, 46, 14);
		frame.getContentPane().add(lblEmpid);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Thonburi", Font.BOLD, 12));
		lblPassword.setForeground(Color.DARK_GRAY);
		lblPassword.setBackground(Color.DARK_GRAY);
		lblPassword.setBounds(467, 552, 62, 14);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setForeground(Color.DARK_GRAY);
		lblConfirmPassword.setFont(new Font("Thonburi", Font.BOLD, 12));
		lblConfirmPassword.setBounds(446, 588, 107, 14);
		frame.getContentPane().add(lblConfirmPassword);
		
		JLabel lblMobile = new JLabel("Phone no.");
		lblMobile.setForeground(Color.DARK_GRAY);
		lblMobile.setFont(new Font("Thonburi", Font.BOLD, 12));
		lblMobile.setBounds(478, 630, 62, 14);
		frame.getContentPane().add(lblMobile);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBackground(Color.LIGHT_GRAY);
		btnSubmit.setForeground(Color.BLACK);
		btnSubmit.setFont(new Font("Thonburi", Font.BOLD, 14));
		btnSubmit.setBounds(705, 664, 89, 36);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Thonburi", Font.BOLD, 14));
		btnReset.setForeground(Color.BLACK);
		btnReset.setBackground(Color.LIGHT_GRAY);
		btnReset.setBounds(848, 664, 89, 36);
		frame.getContentPane().add(btnReset);
		
		nametf = new JTextField();
		nametf.setFont(new Font("Thonburi", Font.PLAIN, 12));
		nametf.setBackground(SystemColor.inactiveCaption);
		nametf.setBounds(687, 414, 107, 20);
		frame.getContentPane().add(nametf);
		
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setForeground(Color.DARK_GRAY);
		rdbtnMale.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnMale.setBounds(688, 444, 62, 23);
		frame.getContentPane().add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setForeground(Color.DARK_GRAY);
		rdbtnFemale.setFont(new Font("Thonburi", Font.PLAIN, 12));
		rdbtnFemale.setBounds(774, 446, 109, 23);
		frame.getContentPane().add(rdbtnFemale);
		
		ButtonGroup jbt = new ButtonGroup();
		jbt.add(rdbtnMale);
		jbt.add(rdbtnFemale);
		
		eidf = new JTextField();
		eidf.setBackground(SystemColor.inactiveCaption);
		eidf.setFont(new Font("Thonburi", Font.PLAIN, 12));
		eidf.setBounds(687, 484, 107, 20);
		frame.getContentPane().add(eidf);
		eidf.setColumns(10);
		
		cpwdtf = new JPasswordField();
		cpwdtf.setBackground(SystemColor.inactiveCaption);
		cpwdtf.setBounds(691, 584, 103, 20);
		frame.getContentPane().add(cpwdtf);
		
		pwdtf = new JPasswordField();
		pwdtf.setBackground(SystemColor.inactiveCaption);
		pwdtf.setBounds(691, 548, 103, 20);
		frame.getContentPane().add(pwdtf);
		
		mobtf = new JTextField();
		mobtf.setBackground(SystemColor.inactiveCaption);
		mobtf.setBounds(691, 626, 103, 20);
		frame.getContentPane().add(mobtf);
		mobtf.setColumns(10);
		
		JLabel lblRole = new JLabel("Role");
		lblRole.setForeground(Color.DARK_GRAY);
		lblRole.setFont(new Font("Thonburi", Font.BOLD, 12));
		lblRole.setBounds(482, 527, 46, 14);
		frame.getContentPane().add(lblRole);
		
		String item[]={"Admin","Manager","Staff"};
		JComboBox comboBox = new JComboBox(item);
		comboBox.setFont(new Font("Thonburi", Font.PLAIN, 12));
		comboBox.setForeground(Color.DARK_GRAY);
		comboBox.setBackground(SystemColor.inactiveCaption);
		comboBox.setBounds(693, 517, 82, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 37, 1305, 290);
		Image img = new ImageIcon(this.getClass().getResource("/r.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		frame.getContentPane().add(lblNewLabel);
		
		
		btnSubmit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
			
				
				
				
				
				String namev=nametf.getText();
				String gender="";
				if(rdbtnMale.isSelected()){
					gender="male";
				}
				if(rdbtnFemale.isSelected()){
					gender="female";
				}
						String emp_idv=eidf.getText();
						
						String rolev=(String)comboBox.getSelectedItem();
				String mob=mobtf.getText();
				String pass=String.valueOf(pwdtf.getPassword());
				String cpass=String.valueOf(cpwdtf.getPassword());
				
				
				if(namev.isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Please enter name");
				}
				else if(gender.isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Please select gender");
				}
				else if(emp_idv.isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Please enter employ id");
				}
				else if(mob.isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Please enter mobile number");
				}
				else if(pass.isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Please enter password");
				}
				else if (cpass.isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Please enter confirm password");
				}
				
				
				
				
				if(pass.equals(cpass)){
					
				
				
				
				 try{
						
					 
					 
						
						//String query="Insert into expense values("+yearv+",'"+categoryv+"','"+specificv+"',"+amountv+")";
						Class.forName("oracle.jdbc.driver.OracleDriver");
					
					   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","test","test");
					   PreparedStatement st=con.prepareStatement("Insert into usert values(?,?,?,?,?,?)");
				
					   st.setString(1,namev);
					   st.setString(2,gender);
					   st.setString(3,emp_idv);
					   st.setString(4,rolev);
					   st.setString(5,pass);
					   st.setString(6,mob);
					   
					   
					   st.executeUpdate();
					   JOptionPane.showMessageDialog(null,"New User registered");
					   System.out.println("Sucess");
					   con.close();
					   new Admin();
					   frame.dispose();
					   
					   
					   
					   
				 }
					catch (Exception e){
							System.out.println(e);
					}
				
				
			}
			
			else  {
				JOptionPane.showMessageDialog(null,"Wrong Password");
				pwdtf.setText("");
				cpwdtf.setText("");
				
			}
			}
		});
		
		
		
		
		btnReset.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				nametf.setText("");
				eidf.setText("");
				mobtf.setText("");
				cpwdtf.setText("");
				pwdtf.setText("");
			}
		});
		
	}
}
