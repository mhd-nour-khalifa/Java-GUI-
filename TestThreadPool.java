import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {
	private ExecutorService myService;
	
	public TestThreadPool(int size) {
		// TODO Auto-generated constructor stub
		myService= Executors.newFixedThreadPool(size);
	}
	
	public void executeMyTask() {
		while(true) {
			myService.execute(new Task());
		}
	}
	
	public static void main(String[] args) {
		TestThreadPool k= new TestThreadPool(10);
		k.executeMyTask();
	}

}

class Task implements Runnable {
	private int n;
	private Random ran;
	
	public Task() {
		// TODO Auto-generated constructor stub
		ran= new Random();
		n=ran.nextInt(2000);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			System.out.println(" Id is: "+ Thread.currentThread().getId()+" I am working for" +n+" minutes");
			Thread.currentThread().sleep(n);
		}
		catch (InterruptedException e) {
			// TODO: handle exception
		}
		
	}
}
