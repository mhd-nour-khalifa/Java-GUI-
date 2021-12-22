import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadioOptions extends JFrame implements ActionListener{
	private JLabel lblFirstNumber, lblSecondNumber, lblResult, lblDisplay;
	private JTextField txtFirstNumber,txtSecondNumber,txtResult;
	private JButton btnCalculate, btnReset, btnExit;
	private Calculate calculate;
	private JRadioButton rdAdd, rdSub,rdMul,rdDiv;
	private ButtonGroup btnGroup;
	private JCheckBox chLabelOption;
	
	public RadioOptions() {
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
		
		
		/*
		add(btnCalculate);
		add(btnReset);
		add(btnExit);
		*/
		
		JPanel pnlButtons= new JPanel();
		pnlButtons.setLayout(new FlowLayout());
		pnlButtons.add(btnCalculate);
		pnlButtons.add(btnReset);
		pnlButtons.add(btnExit);
		add(pnlButtons);
		// register buttons to handel actions
		
		btnCalculate.addActionListener(this);
		btnReset.addActionListener(this);
		btnExit.addActionListener(this);
		
		// initialize radio buttons
		rdAdd= new JRadioButton("Add");
		rdSub= new JRadioButton("Sub");
		rdMul= new JRadioButton("Mul");
		rdDiv= new JRadioButton("Div");
		
		// Jpanel for radio button
		JPanel pnlRadio= new JPanel();
		pnlRadio.setLayout(new FlowLayout());
		pnlRadio.add(rdAdd);
		pnlRadio.add(rdSub);
		pnlRadio.add(rdMul);
		pnlRadio.add(rdDiv);
		
		btnGroup= new ButtonGroup();
		btnGroup.add(rdAdd);
		btnGroup.add(rdSub);
		btnGroup.add(rdMul);
		btnGroup.add(rdDiv);
		
		// set default option
		rdAdd.setSelected(true);
		
		// display this radio panel on the application
		add(pnlRadio);
		
		// initialize check box
		chLabelOption= new JCheckBox("Display Result");
		lblDisplay= new JLabel();
		add(chLabelOption);
		add(lblDisplay);
		
	
	}
	public static void main(String[] args) {
		new RadioOptions();
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
		int myResult=0;
		try {
		
		int nmrOne= Integer.parseInt(strOne);
		int nmrTwo= Integer.parseInt(strTwo);
		
		//int result= nmrOne+nmrTwo;
		//int result = calculate.add(nmrOne, nmrTwo);
		if(rdAdd.isSelected())
			myResult=calculate.add(nmrOne, nmrTwo);
		else if(rdSub.isSelected())
			myResult=calculate.sub(nmrOne, nmrTwo);
		else if(rdMul.isSelected())
			myResult=calculate.mul(nmrOne, nmrTwo);
		else if(rdDiv.isSelected())
			myResult=calculate.div(nmrOne, nmrTwo);
		
		//txtResult.setText(result+"");
		//txtResult.setText(String.valueOf(result));
		txtResult.setText(String.valueOf(myResult));
		
		// check satus of the check box
		if(chLabelOption.isSelected()) {
			lblDisplay.setText("Result is "+myResult);
		}
		else {
			lblDisplay.setText("");
		}
		
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
		rdAdd.setSelected(true);
		lblDisplay.setText("");
	}
	
	private void exit() {
		
		System.exit(1);
	}
	
	

}
