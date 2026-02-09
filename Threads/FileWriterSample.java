import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterSample {

	public static void main(String[] args)throws Exception {
//	try {
//		FileWriter fw=new FileWriter("D:example.txt");
//		fw.write("Hello java file handling");
//		fw.close();
//		System.out.println("File Written successfully");
//	}
//   catch(IOException e) {
//	   System.out.println(e);
//   }
	//file Reader
	
//	FileReader fr= new FileReader("d:/example.txt");
//	int ch;
//	while((ch=fr.read())!=-1) {
//		System.out.println((char)ch);
//	}
//	fr.close();
//	}
	 BufferedReader br = new BufferedReader(new FileReader("d:/example.txt"));

     String line;
     while ((line = br.readLine()) != null) {
         System.out.println(line);
     }

    br.close();
}
}