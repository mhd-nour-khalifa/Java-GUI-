
public class Bilgi {
	public static void main(String[] args) {
		Bilgi b = new Bilgi();
		
		System.out.println("Hello-1");
		System.out.println("Hello-2");
		b.hi();
		b.numbers();
		
		b.infinite();
		
		b.run();
		System.out.println(" End of the main");
		
	}
	
	public void hi() {
		System.out.println(" Hi");
	}
	
	public void numbers() {
		for(int i=0;i<5;i++)
			System.out.println("numbers: "+i);
	}
	
	public void run() {
		System.out.println("simple run method");
	}
	
	public void infinite() {
		while(true)
			System.out.println("infinite...");
	}

}
