package Mypackage;
import java.util.*;
public class StringTokenizerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//type 1 Default Delimiter (space)
		
		System.out.println("Type 1: Default Space Delimiter");
		StringTokenizer st1 = new StringTokenizer("java python c++");//Space
		
        while (st1.hasMoreTokens()) {
        	System.out.println(st1.nextToken());
        }
        
        //Type 2 : Custom delimiter
        
        System.out.println("Type 1: Custom Delimiter");
		StringTokenizer st2 = new StringTokenizer("A,B,C",",");//comma
		
        while (st2.hasMoreTokens()) {
        	System.out.println(st2.nextToken());
        }
        
        // Type 3 : Custom Delimiter + returnDelims = true
        
        System.out.println("Type 3: Custom Delimiter with returnDelims");
		StringTokenizer st3 = new StringTokenizer("A,B:C", ",:",true);//
		
        while (st3.hasMoreTokens()) {
        	System.out.println(st3.nextToken());
        }
	}

}
