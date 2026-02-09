package Mypackage;
		import java.util.ArrayList;
		import java.util.Scanner;

		public class SearchinElementInArrayList {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				ArrayList<Integer> num = new ArrayList<Integer>();
				num.add(1);
				num.add(2);
				num.add(3);
				num.add(4);
				num.add(5);
				num.add(6);
				
				Scanner sc = new Scanner(System.in);
				System.out.println("enter element to search:");
				int elm = sc.nextInt();
				for(int i=0;i<=num.size()-1;i++) {
					if(elm==num.get(i)) {
						System.out.println("element found in the :" + i+ " index");
					}
					
				}
				
			}
			

		}

	


