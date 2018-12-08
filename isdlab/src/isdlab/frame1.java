package isdlab;
import java.awt.event.*;
import java.awt.EventQueue;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frame1 {
	private JButton btnNewButton ;
	
	private JLabel lblNewLabel_3 ;
	private JLabel lblNewLabel_2 ;
	private JFrame frame;
	private JTextField uname;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 window = new frame1();
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
	public frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("username");
		lblNewLabel.setBounds(54, 74, 87, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(54, 117, 87, 31);
		frame.getContentPane().add(lblPassword);
		
		uname = new JTextField();
		uname.setBounds(148, 81, 114, 19);
		frame.getContentPane().add(uname);
		uname.setColumns(10);
		
		pass = new JPasswordField();
		pass.setBounds(148, 123, 114, 19);
		frame.getContentPane().add(pass);
		
		btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = uname.getText();
				String pswd=pass.getText();
				if(e.getSource()==btnNewButton)
				{
					if(user.equals("sunil")&&(pswd.equals("1234")))
					{
						JOptionPane.showMessageDialog(null, "successful login");
							
						
					}
					else
					{
						JOptionPane.showMessageDialog(null, " login failed :"
								+ ""
								+ " invalid username or password");
						 
					}
				}
			}
		});
		btnNewButton.setBounds(129, 186, 117, 25);
		frame.getContentPane().add(btnNewButton);
		
	JLabel lblNewLabel_1 = new JLabel(" ");
		Image image= new ImageIcon(this.getClass().getResource("/teacher.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(image));
		lblNewLabel_1.setBounds(301, 51, 166, 103);
		frame.getContentPane().add(lblNewLabel_1);
		
		 lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(321, 196, 70, 19);
		frame.getContentPane().add(lblNewLabel_2);
		
		 lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(311, 169, 70, 15);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
