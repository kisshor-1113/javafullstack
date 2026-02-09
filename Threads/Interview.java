
class Interview {

	    
	    // Function to check vowel
	    static boolean isVowel(char ch) {
	       
	        return ch == 'a' || ch == 'e' || ch == 'i' || 
	               ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || 
	               ch == 'O' || ch == 'U' ;
	    }

	    public static void main(String[] args) {
	        int N = 7;
	        String S = "TechIEA";

	        int i = N - 1;

	        // Remove vowels from the end
	        while (i > 0 && isVowel(S.charAt(i))) {
	            i--;
	        }

	        // Output result
	        System.out.println(S.substring(0, i + 1));
	    }
	}

       
       
    



	



