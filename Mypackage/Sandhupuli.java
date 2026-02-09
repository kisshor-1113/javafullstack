package Mypackage;

public class Sandhupuli {

	public static void main(String[] args) {
		int i;
		for(i =1;i<=4;i++) {
			for(int s=4;s>i;s--) {//space
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
			

	}

}
