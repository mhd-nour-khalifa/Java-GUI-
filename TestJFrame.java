import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TestJFrame extends JFrame{
	
	JLabel lblName, lblAge;
	JTextField txtName,txtAge;
	JButton btnSubmit, btnReset;
	
	
	public TestJFrame() {
		// TODO Auto-generated constructor stub
		
		lblName= new JLabel("Name");
		lblAge= new JLabel("Age");
		
		txtName = new JTextField();
		txtAge= new JTextField();
		
		btnSubmit= new JButton("Submit");
		btnReset= new JButton("Reset");
		
		// test flow layout
		
		/*
		setLayout(new FlowLayout());
		add(lblName);
		txtName.setColumns(20);
		add(txtName);
		add(lblAge);
		txtAge.setColumns(20);
		add(txtAge);
		add(btnSubmit);
		add(btnReset);
		*/
		
		/*
		setLayout(new BorderLayout());
		add(lblName,BorderLayout.NORTH);
		add(txtName,BorderLayout.SOUTH);
		add(btnSubmit,BorderLayout.WEST);
		add(btnReset,BorderLayout.EAST);
		add(txtName,BorderLayout.CENTER);
		
		*/
		
		/*
		setLayout(new GridLayout(0, 2));
		add(lblName);
		add(txtName);
		add(lblAge);
		add(txtAge);
		add(btnSubmit);
		add(btnReset);
		
		*/
		setLayout(null);
		lblName.setSize(100, 20);
		lblName.setLocation(10, 10);
		add(lblName);
		
		txtName.setBounds(120, 10, 100, 20);
		add(txtName);
		
		// in the same way please rest of the items....
		
		
		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setResizable(false);
		setTitle("My Bilgi");
	}
	
	public static void main(String[] args) {
		new TestJFrame();
	}

}
