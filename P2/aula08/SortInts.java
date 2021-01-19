import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class SortInts{

	public static void main(String[] args) throws IOException{
		File f = new File(args[0]);
		Scanner sf = new Scanner(f);
		int n[] = new int[10];
		
		while(sf.hasNextLine()){
			String[] line = new String[10];
			for (int i = 0; i < 10; i++){
				line[i] = sf.nextLine();
				n[i] = Integer.parseInt(line[i]);
				if(line[i] == null){
					break;
				}
				Arrays.sort(n);
				out.printf("%d\n", n);
			}
		}
	}
}


