
public class ThreadNamesId extends Thread {
	
	public static void main(String[] args) {
		
		ThreadNamesId t1= new ThreadNamesId();
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		
		t1.start(); // I have a child thread
		System.out.println(" Id of the child: "+t1.getId());
		System.out.println(" Name of the child: "+t1.getName());
		
		ThreadNamesId t2= new ThreadNamesId();
		t2.start(); // I have a child thread
		System.out.println(" Id of the child: "+t2.getId());
		System.out.println(" Name of the child: "+t2.getName());
		
		
		Thread t3= new Thread(new ThardWithRun(),"Istanbul");
		
		t3.start(); // I have a child thread
		t3.setName(" New Istanbul");
		
		System.out.println(" Id of the child: "+t3.getId());
		//System.out.println(" Name of the child: "+t3.getName());
		
		

		Thread t4= new Thread(new ThardWithRun(),"Adana");
		t4.start(); // I have a child thread
		
		System.out.println(" Id of the child: "+t4.getId());
		//System.out.println(" Name of the child: "+t4.getName());
		
		
		
		
	}

}
