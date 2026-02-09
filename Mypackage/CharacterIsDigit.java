package Mypackage;
import java .util.*;
public class CharacterIsDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
    String s = sc.next();
    char ch;
    
    for(int i=0;i<s.length();i++) {
    	ch=s.charAt(i);
    	boolean check=false;
    	if(ch>= '0'&&ch<='9') {
    		check=false;
    	}
    	else {
    		check=true;
    	}
    	System.out.println(ch+" -> "+check);
    }
    sc.close();
    
	}

}
