package Mypackage;
public class TypeCasting {
	public static void main(String[]args) {
	
		//implicit
	    byte b=10;
		short s=b;
		int i=s;
		long l=i;
		float f=l;
		double d=f;
		
		System.out.println("short"+s);
		System.out.println("int"+i);
		System.out.println("long"+l);
		System.out.println("float"+f);
		System.out.println("double"+d);
		
		//explicit
		double d1=123.154;
		float f1=(float)d;
		long l1=(long)f;
		int i1=(int)l1;
		short s1=(short)i1;
		byte b1=(byte)s1;
		
		System.out.println("byte"+""+b1);
		System.out.println("short"+""+s1);
		System.out.println("int"+""+i1);
		System.out.println("long"+""+l1);
		System.out.println("float"+""+f1);
		System.out.println("double"+""+d1);
		
		
		
				
		
	}

}
