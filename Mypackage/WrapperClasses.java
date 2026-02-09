package Mypackage;

public class WrapperClasses {

	public static void main(String[] args) {
		int x = 25;
		Integer y = new Integer(x);//converting primitive to object called "BOXING"
		//Integer y = Integer.valueOf(x);
		
		System.out.println(y);
		
		char c= 'A';
		Character ch = new Character(c);
		System.out.println(ch);
		
		int a1 = 20;
		Integer obj = a1;//Auto Boxing : int -> integer
		
		System.out.println("Auto Boxing "+obj);
		
		
		String s1="apple;banana,orange";
	  String [] arr = s1.split("[;,]");
	  
	  for(String x1:arr) {
		  System.out.println(x1);
			
	  }
	  
	  
	  String s2 = ",java,,python,,c++,,";
//	   String [] a = s2.split("[,]");
//	   
//	   for(String y1:a) {
//		   System.out.println(y1);
//	   }
		
	  String [] a = s2.split(",",-1);
	  System.out.println(a.length);
		
	  
	}

}
