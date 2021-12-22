import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
	public static void main(String[] args) {
		Bank bank= new Bank(1000);
		
		/*
		User u1= new User(750, bank);
		u1.setName("Ali");
		u1.start();
		
		User u3= new User(250, bank);
		u3.setName("Fatma");
		u3.start();
		
		
		User u2= new User(300, bank);
		u2.setName("Erdem");
		u2.start();
		*/
		// Test the UserLock classes
		/*
		ReentrantLock lock= new ReentrantLock();
		
		UserLock u4 = new UserLock(750, bank, lock);
		u4.setName(" Zehra");
		
		UserLock u5 = new UserLock(250, bank, lock);
		u5.setName("Reyhan");
		
		UserLock u6 = new UserLock(300, bank, lock);
		u6.setName(" Erdem");
		
		u4.start();
		u5.start();
		u6.start();
		*/
		
		// Test semaphore
		Semaphore semaphore= new Semaphore(1);
		
		UserSemaphore u7= new UserSemaphore(750, bank, semaphore);
		UserSemaphore u8= new UserSemaphore(250, bank, semaphore);
		UserSemaphore u9= new UserSemaphore(300, bank, semaphore);
		
		Thread t1= new Thread(u7, "Erhan");
		Thread t2= new Thread(u8, "Ankara");
		Thread t3= new Thread(u9, "Istanbul");
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
		
	}

}
