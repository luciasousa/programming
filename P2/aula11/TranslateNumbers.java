import static java.lang.System.*;
import java.util.*;
import java.io.*;
import p2utils.*;

public class TranslateNumbers{
	public static void main(String[] args) throws IOException {
		Scanner kb = new Scanner(System.in);
		File fin = new File(args[0]);
		if (fin.exists() && fin.canRead()) {
			Scanner scf = new Scanner(fin);
			while (scf.hasNextLine()) { 
				String line = scf.nextLine();
			
				String[] s = line.split(" - ");
				String[] num = new String[10];
				String[] ext = new String[10];
				for (int i = 0; i < 10; i++){
					if(i%2 == 0){
						num[i] = s[i];
					}
					else{
						ext[i] = s[i];
					}
				}
				System.out.println("A list of numbers: ");
				String n = kb.nextLine();
				
				String[] input = n.split(" ");
				for (int i = 0; i < 10; i++){
					if(input[i] == num[i]){
						System.out.printf("List of numbers translated: %s", ext[i]);
					}
				}
			}
			scf.close();
		}
	}
}
