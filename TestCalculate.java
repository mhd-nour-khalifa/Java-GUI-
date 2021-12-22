
public class TestCalculate {
	public static void main(String[] args) {
		Calculate c1= new Calculate(1, 50);
		
		Calculate c2= new Calculate(51, 80);
		
		Thread t1= new Thread(c1);
		Thread t2= new Thread(c2);
		
		t1.start();
		t2.start();
		
		CalculateThread t3=  new CalculateThread(81, 100);
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		}
		catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		int sum= c1.getSum()+c2.getSum()+t3.getSum();
		System.out.println("Total sum is: "+ sum);
		
		
	}

}
