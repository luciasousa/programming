import java.util.Scanner;
import java.io.*;

public class Sete {
	
	public static void main(String[] args) throws IOException {
	
		Scanner sc = new Scanner(System.in);
		
		File fin1 = new File("Texto1.txt");
		
		if (!fin1.canRead()) {
			
			System.out.print("Nao consegue ler ficheiro");
		}
		
		File fin2 = new File("Texto2.txt");
		
		Scanner sf1 = new Scanner(fin1);
		PrintWriter pw2 = new PrintWriter(fin2);
		
		while(sf1.hasNextLine()) {
			
			String linha = sf1.nextLine();
			pw2.println(linha);
		}
		sf1.close();
		pw2.close();
	}
}
