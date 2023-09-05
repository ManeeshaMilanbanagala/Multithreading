package Multithreading;

public class main {
	
	public static void main(String[]args) {
		
		
		multithreading ma = new multithreading();
		multi2 na = new multi2();
		
		ma.setName("Thread one");
		na.setName("Thread two");

		

		ma.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
		}
		
		na.start();
		
		
	}

}
