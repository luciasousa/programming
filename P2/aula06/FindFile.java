import static java.lang.System.*;
import java.io.*;

public class FindFile{
	
	public static void main(String[] args) throws IOException {
		
		lista(args[0]);
	}
	
	public static void lista(String s) throws IOException {
		
		File f = new File(s);
		
		File[] file = f.listFiles();
		
		for (int i = 0; i < file.length; i++){
			
			out.println(file[i].getPath());
			out.print(f.getName());
			
			if(!file[i].isFile()){
				lista(file[i].getPath());
				out.print(f.getName());
			}
		}
	}
}
