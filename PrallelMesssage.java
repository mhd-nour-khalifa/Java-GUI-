
public class PrallelMesssage implements Runnable{
	private String msg;
	
	public PrallelMesssage(String msg) {
		// TODO Auto-generated constructor stub
		this.msg=msg;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			
			try {
				Thread.currentThread().sleep(1000);
				System.out.println(Thread.currentThread().getName() +" "+ msg);
			}
			catch (InterruptedException e) {
				// TODO: handle exception
			}
			
		}
		
	}

}
