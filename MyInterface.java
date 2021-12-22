import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyInterface extends JFrame implements ActionListener{
	private JLabel lblFirstNumber, lblSecondNumber, lblResult;
	private JTextField txtFirstNumber,txtSecondNumber,txtResult;
	private JButton btnCalculate, btnReset, btnExit;
	private Calculate calculate;
	
	public MyInterface() {
		// TODO Auto-generated constructor stub
		
		setLayout(new GridLayout(0, 2));
		init();
		calculate = new Calculate();
			
		setSize(500, 400);
		setTitle("Calculate");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void init() {

		// initialize GUI item
		lblFirstNumber= new JLabel("First Number");
		lblSecondNumber= new JLabel("Second Number");
		lblResult= new JLabel("Result");
		
		txtFirstNumber= new JTextField();
		txtSecondNumber= new JTextField();
		txtResult= new JTextField();
		txtResult.setEditable(false);
		txtResult.setBackground(Color.GREEN);
		txtResult.setForeground(Color.RED);
		
		btnCalculate = new JButton("Calculate");
		btnReset = new JButton("Reset");
		btnExit = new JButton("Exit");
		
		btnCalculate.setBackground(Color.RED);
	
		// display item on user interface
		
		add(lblFirstNumber);
		add(txtFirstNumber);
		
		add(lblSecondNumber);
		add(txtSecondNumber);
		
		add(lblResult);
		add(txtResult);
		
		add(btnCalculate);
		add(btnReset);
		add(btnExit);
		// register buttons to handel actions
		
		btnCalculate.addActionListener(this);
		btnReset.addActionListener(this);
		btnExit.addActionListener(this);
		
		
	
	}
	public static void main(String[] args) {
		new MyInterface();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(btnCalculate))
			//JOptionPane.showMessageDialog(this, "Hello Calculate");
			calculate();
		else if(e.getSource().equals(btnReset))
			//JOptionPane.showMessageDialog(null, "reset");
			reset();
		else if(e.getSource().equals(btnExit))
			//System.out.println("Exit")
			exit();
	}
	
	
	private void calculate() {
		String strOne= txtFirstNumber.getText().trim();
		String strTwo= txtSecondNumber.getText().trim();
		
		try {
		
		int nmrOne= Integer.parseInt(strOne);
		int nmrTwo= Integer.parseInt(strTwo);
		
		//int result= nmrOne+nmrTwo;
		int result = calculate.add(nmrOne, nmrTwo);
		
		//txtResult.setText(result+"");
		txtResult.setText(String.valueOf(result));
		
		}
		catch (NumberFormatException e) {
			// TODO: handle exception
			
			JOptionPane.showMessageDialog(this, "Input Integer number only",
					"Number Fromat Problem", JOptionPane.ERROR_MESSAGE);
			
		}
		
		
	}
	
	private void reset() {
		
		txtFirstNumber.setText("");
		txtSecondNumber.setText("");
		txtResult.setText("");
	}
	
	private void exit() {
		
		System.exit(1);
	}
	
	

}
