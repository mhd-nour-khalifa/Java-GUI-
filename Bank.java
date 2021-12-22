
public class Bank {
	private int balance;

	public Bank(int balance) {
		super();
		this.balance = balance;
	}
	
	public String getMoney(int money) {
		String msg="";
		
		if(balance>=money) {
			
			try {
				Thread.currentThread().sleep(100);
				balance=balance-money;
				
				msg= " You can get "+money+" TL!";
			}
			catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
			else 
				msg=" You can't get "+money+"!. The maximum amoun you can get is "+balance;
		
		return msg;
			
			
		}
		
	}
	
	


