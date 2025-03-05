package junit;

public class thread1  {
	public static void main(String[]args) {
		threadone t1=new threadone();
		threadtwo  t2=new threadtwo();
		threadthree t3=new threadthree();
		t1.start();
		t2.start();
		t3.start();
		
	}

}
class threadone extends Thread{
	public void run() {
		for (int i=0;i<=10;i++) {
			System.out.println("Thread 1 :"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				 
				e.printStackTrace();
			}
			
		}
	}
}
class threadtwo extends Thread{
	public void run() {
		for (int i=0;i<=10;i++) {
			System.out.println("Thread 2 :"+i);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			 
			e.printStackTrace();
		}
	}
}
class threadthree extends Thread{
	public void run() {
		for (int i=0;i<=10;i++) {
			System.out.println("Thread 3 :"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				 
				e.printStackTrace();
			}
		}
	}
}
