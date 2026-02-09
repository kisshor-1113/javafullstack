package Mypackage;
class Single{
	private static Single obj=new Single();
	private Single() {}
	public static Single getInstance() {
	
		return obj;
	
}
	public void message(String from) {
	System.out.println("called from"+""+from);	
	}
}
	
class ClassA{
	void useSingleton() {
		Single s= Single.getInstance();
		s.message("class A");
	}
	
	class ClassB{
		void useSingleton() {
			Single s= Single.getInstance();
			s.message("class B");
		}
		
		class ClassC{
			void useSingleton() {
				Single s= Single.getInstance();
				s.message("classC");
			}
}
public class Singleton {

	public static void main(String[] args) {
		ClassA a=new ClassA();
		ClassA b=new ClassA();
		ClassA c=new ClassA();

		  a.useSingleton();
		  b.useSingleton();
		  c.useSingleton();

	}	}
}
}
