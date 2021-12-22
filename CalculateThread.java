
public class CalculateThread extends Thread{
	private int s,t;
	public int sum;
	
	public CalculateThread(int s,int t) {
		// TODO Auto-generated constructor stub
		this.s=s;
		this.t=t;
		sum=0;
	}
	
	public int getSum() {
		return sum;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		sum=mySum();
		
	}
	
	private int mySum() {
		int p=0;
		for(int i=s;i<=t;i++)
			p+=i;
		return p;
	}

}
