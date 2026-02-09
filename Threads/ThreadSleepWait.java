
class SleepExample extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Thread running"+i);
			try {
				Thread.sleep(1000);// pause for 1 second
				
			}
			catch(InterruptedException e) {
				System.out.println("thread interupted");
			}
		}
	}


public class ThreadSleepWait {

	public static void main(String[] args) {
		SleepExample t1=new SleepExample();
		 t1.start();
		

	}
}
}
