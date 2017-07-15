
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class Staff1 {

	private JFrame frame;
	private JTextField mouseTf;
	private JTextField keyboardTf;
	private JTextField fanTf;
	private JTextField otherTf;
	private JTextField mouseAmtTf;
	private JTextField keyboardAmtTf;
	private JTextField fanAmtTf;
	private JTextField otherAmtTf;
	JCheckBox mouseCb,keyboardCb,fanCb,otherCb;
	int mouseQ,keyboardQ,fanQ,otherQ;
	double mouseAmt,keyboardAmt,fanAmt,otherAmt;
    double totalAmt;
    private JTextField totalTf;
    private JTextField yearTf;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JPanel panel;
    private JPanel panel_1;
    private JLabel lblNewLabel_2;
	
	/**
	 * Launch the application.
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Staff1 window = new Staff1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} */

	/**
	 * Create the application.
	 */
	public Staff1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		Dimension ScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
	frame.setSize(ScreenSize.width,ScreenSize.height);
		 frame.getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("DASHBOARD");
		lblNewLabel.setBounds(0, 0, 1350, 178);
		Image img = new ImageIcon(this.getClass().getResource("/gj.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel_1 = new JLabel("DASHBOARD");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 42));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 82, 357, 63);
		frame.getContentPane().add(lblNewLabel_1);
		frame.getContentPane().add(lblNewLabel);
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(0, 182, 1340, 456);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(509, 0, 841, 456);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Times New Roman", Font.BOLD, 29));
		lblQuantity.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuantity.setBounds(298, 11, 177, 34);
		panel_1.add(lblQuantity);
		
		 mouseCb = new JCheckBox("Mouse");
		 mouseCb.setFont(new Font("Times New Roman", Font.BOLD, 22));
		 mouseCb.setBounds(19, 75, 148, 43);
		 panel_1.add(mouseCb);
		 
		  keyboardCb = new JCheckBox("Keyboard");
		  keyboardCb.setFont(new Font("Times New Roman", Font.BOLD, 21));
		  keyboardCb.setBounds(19, 137, 160, 23);
		  panel_1.add(keyboardCb);
		  
		  JLabel lblItems = new JLabel("Items");
		  lblItems.setHorizontalAlignment(SwingConstants.CENTER);
		  lblItems.setFont(new Font("Times New Roman", Font.BOLD, 29));
		  lblItems.setBounds(24, 11, 143, 34);
		  panel_1.add(lblItems);
		  
		  JLabel lblAmount = new JLabel("Amount");
		  lblAmount.setFont(new Font("Times New Roman", Font.BOLD, 29));
		  lblAmount.setHorizontalAlignment(SwingConstants.CENTER);
		  lblAmount.setBounds(604, 9, 170, 39);
		  panel_1.add(lblAmount);
		  
		   fanCb = new JCheckBox("Fan");
		   fanCb.setFont(new Font("Times New Roman", Font.BOLD, 21));
		   fanCb.setBounds(19, 187, 137, 34);
		   panel_1.add(fanCb);
		   
		    otherCb = new JCheckBox("Others");
		    otherCb.setFont(new Font("Times New Roman", Font.BOLD, 21));
		    otherCb.setBounds(19, 231, 160, 43);
		    panel_1.add(otherCb);
		    
		    mouseTf = new JTextField();
		    mouseTf.setBackground(Color.WHITE);
		    mouseTf.setBounds(315, 90, 115, 28);
		    panel_1.add(mouseTf);
		    mouseTf.setColumns(10);
		    
		    mouseTf.setEditable(false);
		    
		    keyboardTf = new JTextField();
		    keyboardTf.setBackground(Color.WHITE);
		    keyboardTf.setBounds(315, 142, 115, 28);
		    panel_1.add(keyboardTf);
		    keyboardTf.setColumns(10);
		    keyboardTf.setEditable(false); 
		    
		    fanTf = new JTextField();
		    fanTf.setBackground(Color.WHITE);
		    fanTf.setBounds(315, 194, 115, 28);
		    panel_1.add(fanTf);
		    fanTf.setColumns(10);
		    fanTf.setEditable(false);
		    
		    otherTf = new JTextField();
		    otherTf.setBackground(Color.WHITE);
		    otherTf.setBounds(315, 243, 115, 31);
		    panel_1.add(otherTf);
		    otherTf.setColumns(10);
		    
		    otherTf.setEditable(false);
		    
		    mouseAmtTf = new JTextField();
		    mouseAmtTf.setBackground(Color.WHITE);
		    mouseAmtTf.setBounds(626, 90, 148, 28);
		    panel_1.add(mouseAmtTf);
		    mouseAmtTf.setColumns(10);
		    mouseAmtTf.setEditable(false);
		    
		    keyboardAmtTf = new JTextField();
		    keyboardAmtTf.setBackground(Color.WHITE);
		    keyboardAmtTf.setBounds(626, 142, 148, 28);
		    panel_1.add(keyboardAmtTf);
		    keyboardAmtTf.setColumns(10);
		    keyboardAmtTf.setEditable(false);
		    
		    fanAmtTf = new JTextField();
		    fanAmtTf.setBackground(Color.WHITE);
		    fanAmtTf.setBounds(626, 194, 148, 27);
		    panel_1.add(fanAmtTf);
		    fanAmtTf.setColumns(10);
		    fanAmtTf.setEditable(false);
		    
		    otherAmtTf = new JTextField();
		    otherAmtTf.setBackground(Color.WHITE);
		    otherAmtTf.setBounds(626, 243, 148, 31);
		    panel_1.add(otherAmtTf);
		    otherAmtTf.setColumns(10);
		    
		    	otherAmtTf.setEditable(false);
		    	
		    	totalTf = new JTextField();
		    	totalTf.setBounds(626, 308, 148, 34);
		    	panel_1.add(totalTf);
		    	totalTf.setColumns(10);
		    	
		    	JLabel lblTotal = new JLabel("TOTAL :");
		    	lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		    	lblTotal.setFont(new Font("Times New Roman", Font.BOLD, 20));
		    	lblTotal.setBounds(475, 308, 129, 34);
		    	panel_1.add(lblTotal);
		    	
		    	JButton btnSum = new JButton("Sum");
		    	btnSum.setForeground(Color.WHITE);
		    	btnSum.setBackground(Color.DARK_GRAY);
		    	btnSum.setFont(new Font("Times New Roman", Font.BOLD, 20));
		    	btnSum.setBounds(418, 391, 143, 34);
		    	panel_1.add(btnSum);
		    	
		    	JButton btnNewButton_1 = new JButton("Forward");
		    	btnNewButton_1.setForeground(Color.WHITE);
		    	btnNewButton_1.setBackground(Color.DARK_GRAY);
		    	btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		    	btnNewButton_1.setBounds(637, 391, 143, 34);
		    	panel_1.add(btnNewButton_1);
		    	
		    	JButton btnNewButton = new JButton("CheckStatus");
		    	btnNewButton.setForeground(Color.WHITE);
		    	btnNewButton.setBackground(Color.DARK_GRAY);
		    	btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		    	btnNewButton.setBounds(186, 391, 148, 34);
		    	panel_1.add(btnNewButton);
		    	
		    	yearTf = new JTextField();
		    	yearTf.setBounds(186, 322, 148, 28);
		    	panel_1.add(yearTf);
		    	//yearTf.setColumns(10);
		    	
		    	
		    	
		    	JPanel panel_3 = new JPanel();
		    	panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		    	panel_3.setBounds(0, 56, 842, 311);
		    	panel_1.add(panel_3);
		    	panel_3.setLayout(null);
		    	
		    	
		    	
		    	JLabel lblNewLabel_4 = new JLabel("Year :");
		    	lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		    	lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		    	lblNewLabel_4.setBounds(34, 265, 120, 35);
		    	panel_3.add(lblNewLabel_4);
		    	
		    	
		    	//int year=Integer.parseInt(yearTf.getText());

		    	btnNewButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
					//	String y=;
						int year=Integer.parseInt(yearTf.getText());
						try{
		    				
		   				 
		   				 
		    				
		    				
		    				Class.forName("oracle.jdbc.driver.OracleDriver");
		    			
		    			   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","test","test");
		    			   Statement stmt=con.createStatement();  
						   ResultSet rs=stmt.executeQuery("select * from Amt where year="+ year);
						   while(rs.next()){
							   JOptionPane.showMessageDialog(null,rs.getString("status"));
						   }
						  
		    			 
		    			   System.out.println("Sucess");
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
		    			
		    		int year=Integer.parseInt(yearTf.getText());
		    			
		    			try{
		    				
		    				 
		    				 
		    				
		    				
		    				Class.forName("oracle.jdbc.driver.OracleDriver");
		    			
		    			   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","test","test");
		    			   PreparedStatement st=con.prepareStatement("Insert into Amt  values("+year+","+totalAmt+",'Request from Staff')");
		    		
		    			   
		    			   
		    			   
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
		    	btnSum.addActionListener(new ActionListener() {
		    		public void actionPerformed(ActionEvent arg0) {
		    		}
		    	});
		    	
		    	btnSum.addActionListener(new ActionListener() {
		    		
		    		@Override
		    		public void actionPerformed(ActionEvent e) {
		    			// TODO Auto-generated method stub
		    			if(mouseCb.isSelected()){
		    				String m=mouseTf.getText();
		    				mouseQ=Integer.parseInt(m);
		    				//System.out.print(mouseQ);
		    				mouseAmt=mouseQ*10;
		    				String h=String.valueOf(mouseAmt);
		    				//System.out.print(h);
		    				mouseAmtTf.setText(h);
		    				
		    				}
		    			if(keyboardCb.isSelected())
		    			{String k=keyboardTf.getText();
		    			keyboardQ=Integer.parseInt(k);
		    			keyboardAmt=keyboardQ*20;
		    			String h=String.valueOf(keyboardAmt);
		    			//System.out.print(h);
		    			keyboardAmtTf.setText(h);
		    			
		    			}
		    			if(fanCb.isSelected())
		    			{String f=fanTf.getText();
		    			fanQ=Integer.parseInt(f);
		    			fanAmt=fanQ*30;
		    			String h=String.valueOf(fanAmt);
		    			//System.out.print(h);
		    			fanAmtTf.setText(h);
		    				
		    			}
		    			if(otherCb.isSelected())
		    			{String o=otherTf.getText();
		    			otherQ=Integer.parseInt(o);	
		    			otherAmt=mouseQ*40;
		    			String h=String.valueOf(otherAmt);
		    		//	System.out.print(h);
		    			otherAmtTf.setText(h);
		    				
		    		}
		    			totalAmt= keyboardAmt + otherAmt + fanAmt +mouseAmt;
		    			totalTf.setText(String.valueOf(totalAmt));
		    			
		    			
		    					
		    			
		    			
		    			//Staff obj=new Staff();
		    			
		    			//obj.compute(mouseQ,keyboardQ,fanQ,otherQ);
		    			
		    		}
		    	});
		    
		    otherCb.addActionListener(new ActionListener() {
		    	
		    	@Override
		    	public void actionPerformed(ActionEvent e) {
		    		// TODO Auto-generated method stub
		    		if(otherCb.isSelected())
		    		{
		    			otherTf.setEditable(true);
		    	}
		    	else otherTf.setEditable(false);
		    	}
		    });
		   
		   fanCb.addActionListener(new ActionListener() {
		   	
		   	@Override
		   	public void actionPerformed(ActionEvent e) {
		   		// TODO Auto-generated method stub
		   		if(fanCb.isSelected())
		   		{
		   			fanTf.setEditable(true);
		   		}
		   		else fanTf.setEditable(false);
		   		
		   	}
		   });
		  
		  
		  
		  JLabel lblName = new JLabel(" Name :");
		  lblName.setFont(new Font("Monospaced", Font.BOLD, 25));
		  lblName.setBounds(10, 11, 295, 26);
		  panel.add(lblName);
		  
		  JLabel lblEmployeeId = new JLabel("Employee ID :");
		  lblEmployeeId.setFont(new Font("Monospaced", Font.BOLD, 25));
		  lblEmployeeId.setBounds(20, 48, 330, 33);
		  panel.add(lblEmployeeId);
		  
		  JPanel panel_2 = new JPanel();
		  panel_2.setBackground(SystemColor.controlShadow);
		  panel_2.setBounds(0, 638, 1350, 91);
		  frame.getContentPane().add(panel_2);
		  panel_2.setLayout(null);
		  
		  JButton btnLogout = new JButton("LogOut");
		  btnLogout.setForeground(Color.WHITE);
		  btnLogout.setFont(new Font("Times New Roman", Font.BOLD, 20));
		  btnLogout.setBackground(Color.DARK_GRAY);
		  btnLogout.setBounds(1175, 22, 127, 38);
		  panel_2.add(btnLogout);
		  
		  keyboardCb.addActionListener(new ActionListener() {
		  	
		  	@Override
		  	public void actionPerformed(ActionEvent e) {
		  		// TODO Auto-generated method stub
		  		
		  		if(keyboardCb.isSelected())
		  		{
		  			keyboardTf.setEditable(true);
		  		}
		  		else keyboardTf.setEditable(false);
		  	}
		  });
		
	
		
		
		mouseCb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(mouseCb.isSelected()){
					
					
					mouseTf.setEditable(true);
					}
				else
					mouseTf.setEditable(false);
				
			}
		});
		btnLogout.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
					System.exit(0);
				}
			});

		
		
	}
}
