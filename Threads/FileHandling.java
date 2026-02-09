//File handling allows to  create read , write and delete files stored on a desk.

import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
	try {
	File file = new File("D:/example.txt");	
	if(file.createNewFile()) {
		System.out.println("file created");
	}
	else {
		System.out.println("file  already existed");
	}
	}
	catch(IOException e) {

		System.err.println("error msg");
	}

	}

}
