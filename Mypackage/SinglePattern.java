package Mypackage;
 
class SingleImplementation{
	private SingleImplementation() {}
	private static SingleImplementation obj=new SingleImplementation();	
	
	public static SingleImplementation getInstance() {//getinstance is a method
		return obj;
	}
	
	public void showMessage() {
		System.out.println("singleton class is working");
	}
}
class TestClass{
	public void usesshowMessage() {
		SingleImplementation obj=SingleImplementation.getInstance();
		obj.showMessage();
		
	}
}
public class SinglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleImplementation obj=SingleImplementation.getInstance();
		obj.showMessage();
	}

}
