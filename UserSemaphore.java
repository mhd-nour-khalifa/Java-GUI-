import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;


public class UserSemaphore implements Runnable{
	private int money;
	private Bank bank;
	private ReentrantLock myLock;
	private Semaphore semaphore;
	
	//public UserSemaphore(int money, Bank bank, ReentrantLock myLock) {
	public UserSemaphore(int money, Bank bank, Semaphore semaphore) {
		super();
		this.money = money;
		this.bank = bank;
		//this.myLock=myLock;
		this.semaphore=semaphore;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		String result="";
		
		// protect the critical section
		//myLock.lock();
		try {
			semaphore.acquire();
				result=Thread.currentThread().getName()+" "+ bank.getMoney(money);
			semaphore.release();
		}
		catch ( InterruptedException e) {
			// TODO: handle exception
		}
		
		//myLock.unlock();
		System.out.println(result);
		
	}
	
	

}
