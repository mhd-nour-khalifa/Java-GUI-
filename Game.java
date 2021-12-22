import javax.swing.JFrame;

public class Game extends JFrame implements Runnable{
	private int x=10;
	Thread thread;
	public Game() {
		// TODO Auto-generated constructor stub
		
		thread= new Thread(this);
		//thread.start();
		
		setSize(500,500);
		setVisible(true);
		setTitle("Game with Thread");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void paint(java.awt.Graphics g) {
		super.paint(g);
	
		g.fillOval(x, 200, 100, 100);
	}
	
	public static void main(String[] args) {
		Game g= new Game();
		Thread t= new Thread(g);
		t.start();
		
		// stop the animation after 10,000 millionseconds
		try {
			Thread.currentThread().sleep(10000);
			t.interrupt();
		}
		catch (InterruptedException  e) {
			// TODO: handle exception
		}
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true) {
			try {
				Thread.currentThread().sleep(500);
				x=x+5;
				repaint();
			}
			catch (InterruptedException e) {
				// TODO: handle exception
				System.err.println(" I got the interrupt message");
				return;
			}
		}
		
	}

}
