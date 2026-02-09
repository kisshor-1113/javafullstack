package Mypackage;

		import java.util.ArrayList;

		public class ReversingArrayList {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				ArrayList<Integer> num = new ArrayList<Integer>();
				num.add(1);
				num.add(2);
				num.add(3);
				num.add(4);
				num.add(5);
				num.add(6);
				System.out.println("numbers in straight order :");
				for(int i=0;i<=num.size()-1;i++) {
					System.out.println(num.get(i));
				}
				System.out.println("numbers in reverse order :");
				for(int i=num.size()-1;i>=0;i--) {
					System.out.println(num.get(i));
				}
				
			}

}
