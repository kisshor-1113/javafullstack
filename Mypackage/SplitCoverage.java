package Mypackage;

public class SplitCoverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "J@ava";
		
		//parts[0] before @--J
		//parts[1] after @ --ava
		String[] parts = text.split("@");
		String result = parts[0]+parts[1];
		System.out.println(result);
		
		System.out.println("H@i How@ A@re Y@ou".replace("@", ""));

		
		String text2 ="H@i How@ A@re Y@ou";
		String[] parts2= text2.split("@");
		String results ="";
		
		for(String p :parts2) {
			results = results+p;
		}
		System.out.println(results);

	}

}
