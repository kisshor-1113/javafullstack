package Mypackage;
class Food{
	void eat(String breakfast) {
		System.out.println("breaking the fast"+breakfast);
	}
	
	void eat(String lunch ,int time) {
		System.out.println("Lunch"+lunch+"at"+time+"pm");
	
}
	void eat(String snacks,double quantity) {
		System.out.println("Snacks"+snacks+"Quantity of plates"+quantity);
	}
	
	void eat(String dinner,boolean islight) {
      if(islight) {
    	  System.out.println("dinner is"+dinner+"(lite meal)");
      }
      else
    	  System.out.println("dinner is "+dinner+"(heavy meal)");
	}
	
	
public class Polymorphism {

	public static void main(String[] args) {
		Food f=new Food();
          f.eat("naan");
          f.eat("biriyani",3);
          f.eat("samosa",41.00);
          f.eat("parota",true);
          
          
          
	}
 }
}
