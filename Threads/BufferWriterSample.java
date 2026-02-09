import java.io.BufferedWriter;
import java.io.FileWriter;
//Buffer means temporary memory
//File slower for large data and buffer faster for large data



public class BufferWriterSample {

	public static void main(String[] args)throws Exception {
		BufferedWriter bw=new BufferedWriter(new FileWriter("d:/example.txt"));
        bw.write("Hello java");
        bw.newLine();
        bw.write("BufferedWriter Example");
        bw.close();
        System.out.println("Data is Writtten Success");
        }

}
