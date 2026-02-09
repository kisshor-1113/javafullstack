
public class ExampleSleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Thread t = new Thread(new Runnable(){
		public void run() {
			//thread starting 
			System.out.println("Thread Starting");
			
			try {
				Thread.sleep(3000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Thread Resumed after sleep");
			
		}
	});
			t.start();
	

	}
}
