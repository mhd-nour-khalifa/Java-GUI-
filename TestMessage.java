
public class TestMessage {
	public static void main(String[] args) {
		
		PrallelMesssage p1= new PrallelMesssage(" Hello");
		PrallelMesssage p2= new PrallelMesssage(" Bilgi");
		
		Thread t1= new Thread(p1,"t1");
		Thread t2= new Thread(p2,"t2");
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		
		// t1.run();
		 // t2.run();
		t1.start();
		t2.start();
		
		try {
			Thread.currentThread().sleep(5000);
		}
		catch (InterruptedException  e) {
			// TODO: handle exception
		}
		
		System.out.println(" End of the main");
		
	}

}
