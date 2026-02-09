package Mypackage;

public class StringHandling {

	public static void main(String[] args) {
	String month = "January";
	String Days = "Wednesdy";
   String Word = new String("Hi hello");
   System.out.println(Word);
   System.out.println(Days);
   System.out.println(month);
   
   //Length
   int length = Days.length();

   System.out.println(length);
   
   //Concat
   String concatt = Days.concat(month);
   String concat2 = Word + month;
   System.out.println(concatt);
   System.out.println(concat2);
   
   //Compare two strings using equals or ==
   boolean answer = concatt.equals(concat2);
   System.out.println("Both are equal"+answer);
   
   //using new operator
   String Words = new String("Hi hello");
   System.out.println(Words);
   
   //Replace
   System.out.println("Replacing Strings"+""+Word.replace('h','k'));
   
   //ReplaceAll  
   System.out.println("Replacing Strings"+""+Days.replaceAll("Wednesday","vanakam"));

   //Uppercases
   System.out.println("To uppercase"+""+month.toUpperCase());
   
   //lowercase
   System.out.println("To lowercase"+""+month.toLowerCase());
   
   //Character at position
   System.out.println("Charcter position  "+""+month.charAt(2));
   
   //Sub string
   System.out.println("sub string  "+""+month.substring(0,5));
   
   
   
	}

}
