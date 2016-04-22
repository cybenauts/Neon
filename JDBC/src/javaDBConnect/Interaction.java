package javaDBConnect;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Interaction {

	private JFrame frame;
	private JTextField t1;
	Connection cn;
	PreparedStatement st;
	JTextArea result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interaction window = new Interaction();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void happenhere()
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","matrix78692110");
			int id=Integer.parseInt(t1.getText());
			st=cn.prepareStatement("select * from employee where emp_no = ?");
			st.setInt(1, id);
			ResultSet rs=st.executeQuery();
		
			
			if(rs.next())
			 {
				//System.out.println("Here");
				 int e_no=rs.getInt(1);
				 Date d=rs.getDate(2);
				 String fname=rs.getString(3);
				 String lname=rs.getString(4);
				 String dept_no=rs.getString(5);
				 result.setText("Employee Number : "+e_no+"\nD.O.B : "+d+":\nName : "+fname+"\nLast Name : "+lname+"\nDepartment : "+dept_no+"\n");
			 }
			else
				result.setText("INVALID ID\n");
				
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	/**
	 * Create the application.
	 */
	public Interaction() {
		
			initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
			
			
		
		result = new JTextArea();
		result.setEditable(false);
		frame = new JFrame();
		frame.setResizable(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Moonis\\CZ\\My Icons\\Apple.ico"));
		frame.setBounds(100, 100, 882, 629);
		frame.setTitle("DETAIL RETRIEVER");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
			if(arg0.getKeyCode()==KeyEvent.VK_ENTER)
			{
				happenhere();
			}
			}
		});
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setBackground(new Color(204, 204, 255));
		t1.setFont(new Font("Arial Black", Font.BOLD, 11));
		t1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				t1.setText("");
			}
		});
		t1.setText("Enter Employee id...");
		t1.setBounds(525, 114, 175, 30);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		     happenhere();
			}
		});
		btnNewButton.setBackground(new Color(102, 153, 255));
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnNewButton.setBounds(388, 217, 150, 36);
		frame.getContentPane().add(btnNewButton);
		
		JLabel imglable = new JLabel("SUBMIT");
		imglable.setBackground(new Color(204, 204, 255));
		imglable.setFont(new Font("Arial Black", Font.BOLD, 14));
		imglable.setIcon(new ImageIcon("C:\\Moonis\\JavaCodes\\Neon\\JDBC\\media\\fd.png"));
		
		imglable.setBounds(0, 0, 866, 590);
		frame.getContentPane().add(imglable);
		
		
		result.setBounds(111, 336, 666, 243);
		frame.getContentPane().add(result);
	}
}
