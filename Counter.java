import java.util.Random;

public class Counter {
	private int n;
	private Random ran;
	public Counter(int n) {
		super();
		this.n=n;
		ran=new Random();
	}
	
	public synchronized void increase() {
		int p=ran.nextInt(10);
		if(p+n>=100) {
			System.out.println("Producer is stopped....");
			System.out.println("Producer: current value is: "+n+" , and the genearter number is: "+p);
			try {
				wait();
			}
			catch ( InterruptedException e) {
				// TODO: handle exception
				System.err.println(" Error in the increasing method");
			}
		}// end of the if block
		
		n=n+p;
		
		System.out.println(" Producer: the updated value is: "+n);
		notifyAll(); // send mesaage to other waiting thread
	}
	
	

	public synchronized void decrease() {
		int p=ran.nextInt(10);
		if(n-p<=0) {
			System.out.println(" Consumer is stopped...");
			System.out.println("Consumer: current value is: "+n+" , and the genearter number is: "+p);
			try {
				wait();
			}
			catch ( InterruptedException e) {
				// TODO: handle exception
				System.err.println(" Error in the decreasing method");
			}
		}// end of the if block
		
		n=n-p;
		
		System.out.println(" Consmuer: the updated value is: "+n);
		notifyAll(); // send mesaage to other waiting thread
	}
	
	
	
	
	

}
