package Mypackage;

public class SwapArray {

	public static void main(String[] args) {
       int a=10;
       int b=45;
       System.out.println("before swapping"+a+""+b);
      int temp=a;
      a=b;
      b=temp;
      System.out.println("after swapping"+a+""+b);
      
      int k=10;
      int j = 50;
      int [] temparray = {k,j};
      System.out.println("after swapping"+k+""+j);
      k= temparray[1];
      j= temparray[0];
      System.out.println("before swapping"+k+""+j);

	}

}
