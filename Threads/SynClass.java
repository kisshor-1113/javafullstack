 class SynChronizedClass{
	synchronized void run1(int n) {
	for(int i =1;i<=5;i++) {
		System.out.println(n+i);
		try {
			Thread.sleep(3000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	}
	
public class SynClass {
  public static void main(String[] args) {
	 final SynChronizedClass obj = new SynChronizedClass();
	 Thread a = new Thread() {
	 public void run() {
		 obj.run1(16);
	 }
  };
  
  Thread b = new Thread() {
	  public void run() {
		  obj.run1(20);
	  }
  };
  a.start();
  b.start();
  }
}
}
