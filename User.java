
public class User extends Thread{
	private int money;
	private Bank bank;
	
	public User(int money, Bank bank) {
		super();
		this.money = money;
		this.bank = bank;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		String result="";
		
		result=getName()+" "+ bank.getMoney(money);
		System.out.println(result);
		
	}
	
	

}
