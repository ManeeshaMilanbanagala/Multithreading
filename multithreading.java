package Multithreading;

 class multithreading extends Thread{

	 public void run() {
		for(int x=0;x<=10;x++) {
			System.out.println(Thread.currentThread().getName() + " = Hellow");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
 
 
 class multi2 extends Thread{
	 
	 public void run() {
		
		 for(int a=0;a<=10;a++) {
			 System.out.println(Thread.currentThread().getName() +" = Wellcome");
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		 }
	}
 }
