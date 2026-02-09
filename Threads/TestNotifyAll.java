
 class Demo{
	 synchronized void waitmethod() {
		 try {
			System.out.println(Thread.currentThread().getName()+"Waiting");
			wait();
			System.out.println(Thread.currentThread().getName()+"Resumed");
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
	 }
 }
public class TestNotifyAll {

	public static void main(String[] args) {
		Demo obj=new Demo();
		Thread t1 = new Thread(()-> obj.waitmethod(),"Thread1");
		Thread t2 = new Thread(()-> obj.waitmethod(),"Thread2");

		t1.start();
		t2.start();
		try {
			Thread.sleep(3000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		synchronized (obj) {
			System.out.println("main thread notifyAll(");
		    obj.notifyAll();
		}
	}

}
