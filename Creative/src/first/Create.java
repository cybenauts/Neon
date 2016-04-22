package first;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import java.awt.Color;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import java.awt.TextArea;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Create {

	private JFrame frmMatrix;
	private JTextField textField;
	TextArea textArea = new TextArea();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Create window = new Create();
					window.frmMatrix.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Create() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMatrix = new JFrame();
		frmMatrix.setForeground(new Color(255, 255, 204));
		frmMatrix.setTitle("Matrix");
		frmMatrix.setResizable(false);
		frmMatrix.setBackground(Color.DARK_GRAY);
		frmMatrix.setBounds(100, 100, 455, 279);
		frmMatrix.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMatrix.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(50, 68, 115, 25);
		frmMatrix.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNumber = new JLabel("Number:");
		lblNumber.setBounds(50, 43, 46, 14);
		frmMatrix.getContentPane().add(lblNumber);
		
		JButton btnClick = new JButton("Click");
		btnClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int num = Integer.parseInt(textField.getText());
			for(int i=1;i<=num;i++)
			{
				for(int j=1;j<=i;j++)
				{
					textArea.append(Integer.toString(j));
				}
				textArea.append("\n");
				}
			
			}	
		});
		btnClick.setBounds(222, 181, 83, 40);
		frmMatrix.getContentPane().add(btnClick);
		
		JLabel lblResult = new JLabel("Result:");
		lblResult.setBounds(222, 13, 46, 14);
		frmMatrix.getContentPane().add(lblResult);
		
		
		textArea.setBounds(184, 43, 222, 122);
		frmMatrix.getContentPane().add(textArea);
	}
}
