import java.util.concurrent.locks.ReentrantLock;


public class UserLock extends Thread{
	private int money;
	private Bank bank;
	private ReentrantLock myLock;
	
	public UserLock(int money, Bank bank, ReentrantLock myLock) {
		super();
		this.money = money;
		this.bank = bank;
		this.myLock=myLock;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		String result="";
		
		// protect the critical section
		myLock.lock();
			result=getName()+" "+ bank.getMoney(money);
		myLock.unlock();
		System.out.println(result);
		
	}
	
	

}
