package Mypackage;

public class StringBuilders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StringBuilder sy = new StringBuilder("Hello  ");

		//1.Append 
		sy.append("Welcome to the planet");
		System.out.println("the String is"+""+sy);
		
		//2.Insert
		sy.insert(15, "the worldd");
		System.out.println("the inserted string is"+""+sy);

		//3.Replace
		sy.replace(0, 6,"Superman");
		System.out.println("the  replaced String is  "+""+sy);

		//4.Reverse
		sy.reverse();
		System.out.println("the Reversed String is "+""+sy);
		
		//5.Delete
		sy.delete(0, 5);
		System.out.println("the  Deleted String is "+""+sy);
		
		//6.Length and Capacity
		System.out.println("the  length ofString is"+""+sy.length());
		System.out.println("the  capacity String is"+""+sy.capacity());
		
		
	}

}
