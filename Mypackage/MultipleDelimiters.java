package Mypackage;
import java.util.*;
public class MultipleDelimiters {

	public static void main(String[] args) {
	System.out.println("Enter a String");
	String str = "A@B#C$D%E";
	String arr [] = str.split("[@,#,$,%]");
	
	for(String s:arr) {
		System.out.println(s);
	}
	
	}

}
