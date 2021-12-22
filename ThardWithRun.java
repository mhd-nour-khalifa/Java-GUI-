
public class ThardWithRun implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(Thread.currentThread().getId()==12) {
			System.out.println(" Now I am in the run method....");
			System.out.println(" My name is Istanbul....");
			System.out.println(Thread.currentThread().getName());
		}
		else if (Thread.currentThread().getId()==13) {
			System.out.println("In the RUUUUUUUUN methods");
			System.out.println("My name is Adana");
			System.out.println(Thread.currentThread().getName());
		}
		
	}
	

}
