import java.util.Random;

public class Consumer implements Runnable{
	private Counter counter;
	private Random ran;
	public Consumer(Counter counter) {
		
		this.counter = counter;
		ran= new Random();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				counter.decrease();
				Thread.currentThread().sleep(1000);
			}
			catch (InterruptedException e) {
				// TODO: handle exception
				System.err.println(" Exceptin int the sonsumer method");
			}
		}
	}
	
}
