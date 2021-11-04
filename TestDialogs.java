import java.util.Scanner;

import javax.swing.JOptionPane;

public class TestDialogs {
	public static void main(String[] args) {
		
		// Message Dialog
		
		//System.out.println("Hello");
		
		
		//JOptionPane.showMessageDialog(null, "  Hello Bilgi");
		//JOptionPane.showMessageDialog(null, "Hello Bilgi", "My titlle", JOptionPane.WARNING_MESSAGE);
		
		// Options dialogs
		
	


		Object []myoptions= {"Yes", "No", "I don't care", "Bilgi"};
		
		while(true) {
		
		int n= JOptionPane.showOptionDialog(null, "Do you like Coffee", "Cofee",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
				null, myoptions, myoptions[0]);
		
		
		System.out.println(" The value of n is: "+n);
		JOptionPane.showMessageDialog(null, n+"");
		
		Object [] stop= {"Yes","No"};
		int k= JOptionPane.showOptionDialog(null, "Do you want to stop",
				"Conrol the loop", JOptionPane.YES_NO_OPTION,
				JOptionPane.WARNING_MESSAGE, 
				null, stop, stop[1]);
		
		if(k==0) {
			if(k==JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "it is going to stop");
			break;
			
		}
		
		else {
			JOptionPane.showMessageDialog(null, "continue one more loop");
		}
		
		}// end of the while loop
		
		
		
		// test the confirmation dialog yourself...
		
		
		
		// test input dialog
		
		// console input
		
		
		
		
		
		
		//String strAge= JOptionPane.showInputDialog("How old are you", 18);
		Object [] notes = {"click here" , "dont click"};
		String mhd = (String) JOptionPane.showInputDialog(null,"choose what ever you want",
		"dont selcet", JOptionPane.INFORMATION_MESSAGE,
		null,notes,notes[0]);
		
		JOptionPane.showMessageDialog(null, "notes: "+mhd);
	


		
		//Object []days = {"MOn", "Tues", "Wed","Thur", "Fri", "Sat", "Sun"};
		//String myDay= (String)  JOptionPane.showInputDialog(null,"Select a day", 
			//	"Week Days", JOptionPane.INFORMATION_MESSAGE, 
			//	null, days, days[0]);
		
		
		//JOptionPane.showMessageDialog(null, "today is: "+myDay);
			// end of the main method


// end of the class
	}
		}	
	}
	


