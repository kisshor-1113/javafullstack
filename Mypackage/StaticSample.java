package Mypackage;
class StaticExample{
	static int counter=0;
	StaticExample(){
		counter++;
	}
}
public class StaticSample {

	public static void main(String[] args) {
     new StaticExample();	
     new StaticExample();	
     new StaticExample();	
System.out.println(StaticExample.counter);
	}

}

