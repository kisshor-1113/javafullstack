package Mypackage;

public class Car {
   String model;
   int year;
   
   public void display() {
	   System.out.println("car model "+model+" "+"year  "+" "+year);
   }
	
	public static void main(String[] args) {
		Car obj=new Car();
		obj.model="toyota";
		obj.year=2012;
		obj.display();
		
		obj.model="Tata";
		obj.year=2014;
		obj.display();
				
		

	}

}
