import java.util.Random;

public class Producer extends Thread{
	private Counter counter;
	private Random ran;
	public Producer(Counter counter) {
		super();
		this.counter = counter;
		ran= new Random();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				counter.increase();
				sleep(1000);
			}
			catch (InterruptedException e) {
				// TODO: handle exception
				System.err.println(" Exceptin int the producer method");
			}
		}
	}
	
}
