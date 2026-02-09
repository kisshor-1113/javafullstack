package Mypackage;

public class MailSplit {

	public static void main(String[] args) {
		String s1 = "user.mail.service@sub.mail.google.co.in";
		String p1 = s1.split("@")[1];
		String [] p = p1.split("\\.");
		int n = p.length;
          
		String res = p[n-3]+"."+p[n-2]+"."+p[n-1];
		System.out.println("The given input is :"+s1);
		System.out.println("The result after split is:"+"\n");
		System.out.println(res);
		
	String s2 = "ab+cd-ef*gh";
	String [] parts = s2.split("");
	int v=parts.length;
	String res1=parts[v-11]+parts[v-10]+","+parts[v-9]+","+parts[v-8]+parts[v-7]+","+parts[v-6]+","+parts[v-5]+parts[v-4]+","+parts[v-3]+","+parts[v-2]+parts[v-1];
			
			
			
	System.out.println("the given input is:"+s2);
	System.out.println(res1);
		
	}

}
