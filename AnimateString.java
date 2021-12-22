import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class AnimateString extends JPanel implements ActionListener{
	private int x,y;
	private Font myFont, yourFont;
	private int size;
	private Timer timer;
	private boolean blnMoveRigt;
	public AnimateString() {
		// TODO Auto-generated constructor stub
		size=30;
		
		myFont= new Font("TimesRoman", Font.BOLD, 25);
		yourFont= new Font("Courier", Font.BOLD +Font.ITALIC, size);
		
		timer= new Timer(100, this);
		timer.start();
		
		blnMoveRigt=true;
		x=200;
		y=250;
		setSize(800,600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		AnimateString myString= new AnimateString();
		JFrame myFrame= new JFrame("Animate strings");
		myFrame.setSize(myString.getSize());
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.add(myString); // add the panel object to JFrame content
				
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		g.drawString("CMPE 261 is fun", 100, 100);
		
		g.setFont(myFont);
		g.setColor(Color.RED);
		g.drawString("We love programming", x, y);
		
		yourFont= new Font("Courier", Font.BOLD +Font.ITALIC, size);
		g.setFont(yourFont);
		g.setColor(Color.GREEN);
		g.drawString("We love Istanbul", x, y+200);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		displayString();
		repaint(); // call the paint
				
	}
	
	private void displayString() {
		if(x<500 && blnMoveRigt) { // move to right
			x+=10;
		}
		else if(x>10)  {
			// move to left
			blnMoveRigt=false;
			x=x-10;
		}
		else
			blnMoveRigt=true; // set the boolean value to "true" move to right again....
		//size+=1;
		System.out.println(x);
	}
	

}
