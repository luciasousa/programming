import static java.lang.System.*;
import java.util.*;
import java.io.*;
import p2utils.*;

public class NumberValue{
	public static void main(String[] args) throws IOException {
		File f = new File(args[0]);
		Scanner sf = new Scanner(f);
		Scanner kb = new Scanner(System.in);
		out.println("Numero extenso: ");
		String ne = kb.nextLine();
		String[] input = ne.split(" ");
		String line = sf.nextLine();
		String[] l = line.split(" - ");
		int[] n = new int[100];
		for (int i = 0; i < 100; i++){
			for (int j = 0; j < 100; j++){
				if(i%2 == 0){
					n[j] = Integer.parseInt(l[i]);
				}
				
				if(l[i].equals(input[j])){
					
				}
			}
		}
		
	}
}
