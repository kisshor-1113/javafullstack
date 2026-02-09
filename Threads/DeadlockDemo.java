
public class DeadlockDemo {
    static Object lock1=new Object();
    static Object lock2=new Object();
	public static void main(String[] args) {
		
		 Thread t1 =new Thread(()->{
	          
	          synchronized(lock1)
	          {
	        	  System.out.println("Thread2: holding lock1 and lock2");
	          
	        	  try {
	        		  Thread.sleep(100);
	        	  }
	        	  catch(InterruptedException e) {
	        		 System.out.println(e); 
	        	  }
	        	  synchronized(lock2)
	    	      {
	    	    	  System.out.println("Thread1: holding lock1 and lock2");
	    	      }
	          }
	    	});
	
      Thread t2 =new Thread(()->{
          
          synchronized(lock2)
          {
        	  System.out.println("Thread2: holding lock1 and lock2");
          
        	  try {
        		  Thread.sleep(100);
        	  }
        	  catch(InterruptedException e) {
        		 System.out.println(e); 
        	  }
        	  synchronized(lock2)
    	      {
    	    	  System.out.println("Thread1: holding lock2 and lock1");
    	      }
          }
    	});
	}	
}
