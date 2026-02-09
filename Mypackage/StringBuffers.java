package Mypackage;

public class StringBuffers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer("Hello  ");

		//1.Append 
		sb.append("Welcome to the planet");
		System.out.println("the String is"+""+sb);
		
		//2.Insert
		sb.insert(15, "the worldd");
		System.out.println("the inserted string is"+""+sb);

		//3.Replace
		sb.replace(0, 6,"Superman");
		System.out.println("the  replaced String is  "+""+sb);

		//4.Reverse
		sb.reverse();
		System.out.println("the Reversed String is "+""+sb);
		
		//5.Delete
		sb.delete(0, 5);
		System.out.println("the  Deleted String is "+""+sb);
		
		//6.Length and Capacity
		System.out.println("the  length ofString is"+""+sb.length());
		System.out.println("the  capacity String is"+""+sb.capacity());



		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
