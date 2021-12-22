
public class Test {
	public static void main(String[] args) {
		Counter counter= new Counter(0);
		
		Producer p1= new Producer(counter);
		p1.start();
		
		/*
		Producer p2= new Producer(counter);
		p2.start();
		
		Producer p3= new Producer(counter);
		p3.start();
		*/
		
		Consumer con1= new Consumer(counter);
		Thread c1= new Thread(con1);
		c1.start();
		
		
		Consumer con2= new Consumer(counter);
		Thread c2= new Thread(con2);
		c2.start();
		
		
		Consumer con3= new Consumer(counter);
		Thread c3= new Thread(con3);
		c3.start();
	}

}
