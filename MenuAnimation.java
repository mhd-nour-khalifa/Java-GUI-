import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MenuAnimation extends JPanel implements ActionListener{
	private int x,y;
	private Font myFont, yourFont;
	private int size;
	private Timer timer;
	private boolean blnMoveRigt;
	
	// add Menu to this app
	private JMenuBar myMenuBar;
	private JMenu menuFile,menuHelp,menuCalculate;
	private JMenuItem itemStart,itemStop,itemHelp,itemExit;
	
	
	public MenuAnimation() {
		// TODO Auto-generated constructor stub
		setLayout(new BorderLayout());
		size=30;
		
		myFont= new Font("TimesRoman", Font.BOLD, 25);
		yourFont= new Font("Courier", Font.BOLD +Font.ITALIC, size);
		
		timer= new Timer(100, this);
		//  timer.start();
		
		blnMoveRigt=true;
		
		// initialize menu items...
		myMenuBar= new JMenuBar();
		//myMenuBar.setLayout(new GridLayout(0, 1));
		
		menuFile= new JMenu("File");
		menuHelp= new JMenu("Help");
		
		itemStart= new JMenuItem("Start");
		itemStop= new JMenuItem("Stop");
		itemHelp= new JMenuItem("Help");
		itemExit= new JMenuItem("Exit");
		
		
		// add menu items into ralted menus...
		menuFile.add(itemStart);
		menuFile.add(itemStop);
		
		menuHelp.add(itemHelp);
		menuHelp.add(itemExit);
		
		// add menues  to MenuBar
		myMenuBar.add(menuFile);
		myMenuBar.add(menuHelp);
		menuCalculate= new JMenu("Calculate");
		myMenuBar.add(menuCalculate);
		
		// add the menu bar to the application contant
		add(myMenuBar, BorderLayout.NORTH); // we are using Border Layout
		// register menut items with actionlistener
		itemStart.addActionListener(this);
		itemStop.addActionListener(this);
		itemHelp.addActionListener(this);
		itemExit.addActionListener(this);
		
		x=200;
		y=250;
		setSize(800,600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		MenuAnimation myString= new MenuAnimation();
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
		if(e.getSource().equals(timer))
			displayString();
		else if(e.getSource().equals(itemStart))
			timer.start();
		else if(e.getSource().equals(itemStop))
			timer.stop();
		else if(e.getSource().equals(itemHelp))
			help();
		else if(e.getSource().equals(itemExit))
			exit();
		
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
	
	private void help() {
		JOptionPane.showMessageDialog(this, "dispaly information about this app");
	}
	
	private void exit() {
		System.exit(1);
	}
	

}
