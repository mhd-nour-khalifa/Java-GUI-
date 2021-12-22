
public class BilgiRun implements Runnable {
	public static void main(String[] args) {
		
		BilgiRun b = new BilgiRun();
		
		System.out.println("Hello-1");
		System.out.println("Hello-2");
		b.hi();
		b.numbers();
		// b.start(); // now "b" is not a thread. It is a runnable object
		
		// create thread...
		Thread t= new Thread(b);
		t.start();
		
	 //	b.infinite();
		
		//b.run();
		System.out.println(" End of the main");
		
	}
	
	public void hi() {
		System.out.println(" Hi");
	}
	
	public void numbers() {
		for(int i=0;i<5;i++)
			System.out.println("numbers: "+i);
	}
	
	public void run() {
		System.out.println("now we have thread");
		infinite();
	}
	
	public void infinite() {
		while(true) {
			System.out.println("infinite...");
			try {
				Thread.currentThread().sleep(1000); //delay
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	}

}
