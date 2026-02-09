package Mypackage;

		import java.util.ArrayList;

		public class ArrayListCreation {

			public static void main(String[] args) {
				ArrayList<String> names = new ArrayList<String>();
				names.add("kiss");
				names.add("maran");
				names.add("kani");
				names.add("kundan");
				names.add("nani");
				System.out.println("NAMES ARE :");
				for(int i=0;i<=names.size()-1;i++) {
					System.out.println(names.get(i));
				}
				

			}

}
